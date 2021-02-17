package junior2019;

import java.util.Scanner;
import java.util.ArrayList;

public class j3_2019 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> input = new ArrayList<String>();

        int n = s.nextInt();
        s.nextLine();

        for (int y = 0; y < n; y++) {
            input.add(s.nextLine());
        }

        for (int i = 0; i < n; i++) {
            String[] str = input.get(i).split("");
            list.clear();
            for (int k = 0; k < str.length; k++) {
                if (k == 0) {
                    list.add(str[k]);
                }

                else {
                    if (list.contains(str[k])) {
                        list.add(str[k]);
                    }

                    else {
                        System.out.print(list.size() + " " + list.get(0)+" ");
                        list.clear();
                        list.add(str[k]);

                    }
                }

                if (k == str.length - 1) {
                    System.out.print(list.size() + " " + list.get(0));
                }

            }
            System.out.println("");
        }
    }
}
