
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<String>();
        ArrayList<String> transformations = new ArrayList<String>();
        ArrayList<String> done = new ArrayList<String>();

        ArrayList<String> transformedC = new ArrayList<String>();
        ArrayList<String> transformedR = new ArrayList<String>();

        HashMap<String, Integer> frequency = new HashMap<String, Integer>();

        int m = s.nextInt();
        int n = s.nextInt();
        int k = s.nextInt();
        s.nextLine();

        int[][] grid = new int[m][n];
        for (int i = 0; i < k; i++) {
            String str = s.nextLine();
            inputs.add(str);

            if (frequency.containsKey(str))
            {
                frequency.put(str, frequency.get(str)+1);
            }
            else
            {
                frequency.put(str, 1);
            }
        }
        

        int counter = 0;
        for (int i = 0; i < inputs.size(); i++) {
            try {
                if (frequency.get(inputs.get(i)) % 2 != 0) {
                    String[] line = inputs.get(i).split(" ");
                    int num = Integer.valueOf(line[1]);

                    if (line[0].equals("R")) {
                        counter += n - 2 * transformedC.size();
                        transformedR.add(line[1]);
                    } else {
                        counter += m - 2 * transformedR.size();
                        transformedC.add(line[1]);
                    }
                    frequency.remove(inputs.get(i));
                }
            } catch (Exception e) {
                continue;
            }

        }

        System.out.println(counter);
    }

}
