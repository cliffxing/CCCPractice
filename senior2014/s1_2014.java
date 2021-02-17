package senior2014;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class s1_2014 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for (int i = 1; i < x+1; i++) {
            list.add(i);
        }
        
        int rounds = s.nextInt();

        for (int i = 0; i < rounds; i++) {
            int counter = 0;
            int y = s.nextInt();
            for (int k = 0; k < list.size(); k++) 
            {
               counter++;
               if (counter == y)
               {
                   counter = 0;
                   list.set(k, 0);
               }
            }

            list.removeAll(Collections.singleton(0));

        }

        for (int i = 0; i < list.size(); i++) {
            
            System.out.println(list.get(i));
        }

    }
}
