package junior2019;

import java.util.Scanner;
import java.util.ArrayList;

public class j2_2019 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        s.nextLine();
        for (int i =0; i<n; i++)
        {
            
            String[] str = s.nextLine().split(" ");
            int r = Integer.valueOf(str[0]);

            for(int k = 0; k<r ;k++)
            {
                System.out.print(str[1]);
            }
            System.out.println("");

        }
    }
}
