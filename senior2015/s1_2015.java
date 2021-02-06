package senior2015;

import java.util.Scanner;
import java.util.Stack;
import java.util.*;

/**
 * Write a description of class s1_2019 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class s1_2015 {
    // instance variables - replace the example below with your own

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            int x = scan.nextInt();
            if (x == 0) {
                list.remove(list.size() - 1);
            } else {
                list.add(x);

            }

        }
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.println(sum);
    }
}
