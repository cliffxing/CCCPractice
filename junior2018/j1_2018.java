package junior2018;

import java.util.Scanner;
import java.util.ArrayList;

public class j1_2018 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();
        int x;
        boolean tele = true;
        for (int i = 0; i < 4; i++) {
            x = s.nextInt();

            list.add(x);

        }

        if (list.get(0)!=8)
        {
            if (list.get(0)!=9)
            {
                tele = false;
            }
        }

        if (list.get(1)!= list.get(2))
        {
            tele = false;
        }

        if (list.get(3)!=8)
        {
            if (list.get(3)!=9)
            {
                tele = false;
            }
        }

        if (tele == true) {
            System.out.println("ignore");
        }

        else {
            System.out.println("answer");
        }

    }

}
