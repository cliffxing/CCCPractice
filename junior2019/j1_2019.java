package junior2019;

import java.util.Scanner;
import java.util.ArrayList;

public class j1_2019 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int scorea = 0;
        int scoreb = 0;

        for (int i = 0; i < 3; i++) {
            int x = s.nextInt();
            if (i == 0)
            {
                scorea+=x*3;
            }

            else if (i==1)
            {
                scorea+=x*2;
            }
            else{
                scorea+=x*1;
            }

        }

        for (int i = 0; i < 3; i++) {
            int x = s.nextInt();
            if (i == 0)
            {
                scoreb+=x*3;
            }

            else if (i==1)
            {
                scoreb+=x*2;
            }
            else{
                scoreb+=x*1;
            }

        }
        if (scorea==scoreb)
        {
            System.out.println("T");
        }
        else if (scorea>scoreb)
        {
            System.out.println("A");
        }
        else{
            System.out.println("B");
        }
    }
}
