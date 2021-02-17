package junior2018;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class j3_2018 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();

        String str = s.nextLine();

        String[] x = str.split(" ");
        for (int i = 0; i < 4; i++) {
            list.add(Integer.valueOf(x[i]));
        }
        ArrayList<Integer> reglist = list;
        int total = 0;
        int counter = 0;
        boolean foundZ = false;
        int left = 0;
        int prevleft = 0;

        for (int i = 0; i < 5; i++) {
            left = 0;
            counter = 0;

            for (int j = 0; j < i; j++) {
                left += list.get(j);
                prevleft = left;
            }

            for (int m = 0; m < 4; m++) {
                if (m == i) {
                    System.out.print(0 + " " + list.get(m) + " ");
                    counter = list.get(m);
                }

                else if (m > i) {
                    counter += list.get(m);
                    System.out.print(counter + " ");

                }

                else if (m < i) {
                    for (int l = 0; l < m; l++) {
                        left -= list.get(l);
                    }
                    System.out.print(left + " ");
                    left = prevleft;
                }

            }
            if (i != 4) {
                System.out.println("");
            } else {
                System.out.print(0);
            }

        }

    }

}
