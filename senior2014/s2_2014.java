//package senior2014;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        HashMap<String, String> hash = new HashMap<String, String>();
        s.nextLine();
        String[] str1 = s.nextLine().split(" ");
        String[] str2 = s.nextLine().split(" ");

        for (int i = 0; i < x; i++) {
            hash.put(str1[i], str2[i]);

        }
        boolean check = true;
        for (int i = 0; i < x; i++) {
            
            if (hash.get(str1[i]).equals(str1[i])) {

                check = false;
                System.out.println("bad");
                break;
            }
        }
        if (check==true)
        {
            for (int i = 0; i < x; i++) {
                String str = hash.get(str1[i]);
                if (!hash.get(str).equals(str1[i])) {
    
                    check = false;
                    System.out.println("bad");
                    break;
                }
            }
        }
        if (check == true) {
            System.out.println("good");
        }
    }
}
