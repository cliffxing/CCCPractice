package junior2019;

import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class j5_2019 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashMap<String, String> subs = new HashMap<String, String>();
        ArrayList<String> list = new ArrayList<String>();

        /*
         * for (int i = 0; i < 3; i++) { String[] str = s.nextLine().split(" ");
         * subs.put(str[0], str[1]); }
         */
        String[] l = s.nextLine().split(" ");
        int moves = Integer.valueOf(l[0]);
        String currentStr = l[1];
        String f = l[2];
        boolean found = true;

        for (int i = 0; i < currentStr.length(); i++) {
            for (int k = i + 1; k <= currentStr.length(); k++) {

                    list.add(currentStr.substring(i, k));
                    System.out.println(currentStr.substring(i, k));
                
               
            }
        }

        while (found == false) {
            for (int i = 1; i < currentStr.length(); i++) {
                for (int k = 1; k < currentStr.length(); k++) {

                }
            }
        }

    }

    /*
     * static String sub (String currentStr, HashMap<String, String> subs, int
     * moves) {
     * 
     * }
     */
}
