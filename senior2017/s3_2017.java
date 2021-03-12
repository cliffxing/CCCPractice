
package senior2017;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class s3_2017 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> sums = new ArrayList<Integer>();

        int n = s.nextInt();
        s.nextLine();
        String[] line = s.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            list.add(Integer.valueOf(line[i]));
        }

        int lengthCount = 0;
        int start;
        int search = 0;
       int large = 0;

        for (int i = 0; i < n; i++) {

            start = list.get(i);

            for (int k = i; k < n; k++) {
                if (k != i) {
                    sums.add(start + list.get(k));
                    
                }

            }

        }
        boolean hasStarted = false;
        int biggest = 0;
        
        for (int k = 0; k < sums.size(); k++) {
            int y = Collections.frequency(sums, sums.get(k));


            if (y>biggest)
            {
                biggest = y;
            }
        }
        System.out.println(biggest + " "+large);
    }
   

}
