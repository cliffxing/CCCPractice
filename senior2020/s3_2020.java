package senior2020;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.lang.Math;
public class s3_2020

{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String needle =  scan.nextLine();
        String haystack  =  scan.nextLine();
        ArrayList<String> perms = new ArrayList<String>();
        ArrayList<String> duplicate = new ArrayList<String>();

        List<String> y = new ArrayList<String>();

        perms = findPermutation(needle, "", perms);

        String list []  = needle.split("");

        y = Arrays.asList(list);

        int counter =0 ;
        for (int i = 0; i < perms.size(); i++) 
        {
            String x = perms.get(i);

            if (haystack.contains(x))
            {
                counter++;
            }
        }

        
        System.out.println(counter);
    }
    
   
    static ArrayList<String> findPermutation(String str, String y, ArrayList<String> perms) 
    { 

        if (str.length() == 0) 
        { 
            if (!perms.contains(y))
            {
                perms.add(y);
            }
            

            return perms; 
        } 

        for (int i = 0; i < str.length(); i++) { 

            char c = str.charAt(i); 

            String x = str.substring(0, i) +  str.substring(i + 1); 

            findPermutation(x, y + c, perms); 
        } 

        return perms;
    } 
}
