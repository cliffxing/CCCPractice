package junior2020;

import java.util.Scanner;
public class j4_2020 {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        boolean yes=false;
        String t = scan.nextLine();
        String s = scan.nextLine();
        char r;
        for (int i=0; i<s.length();i++)
        {
            r = s.charAt(0);
            s = s.substring(1, s.length()) + r;

            if (t.contains(s) == true)
            {
                System.out.println("yes");
                yes = true;
                break;
            }
        }

        if ( yes == false)
        {
            System.out.println("no");
        }

        
    }
}
