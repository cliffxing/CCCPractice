package junior2018;

import java.util.Scanner;
import java.util.ArrayList;

public class j2_2018 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();
        int x = s.nextInt();
        s.nextLine();

        String []str = s.nextLine().split("");
        for (int i =0; i<str.length; i++)
        {
           
            list1.add(str[i]);


        }

        String []str2 = s.nextLine().split("");
        for (int i =0; i<str2.length; i++)
        {
           
            list2.add(str2[i]);


        }
        int counter =0 ;
        for (int i=0; i<x; i++)
        {
            if (list1.get(i).equals(list2.get(i)) && list1.get(i).equals("C"))
            {
                counter++;
            }
        }
        System.out.println(counter);
        
    }

}
