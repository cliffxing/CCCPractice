package junior2010;

import java.util.Scanner;
import java.util.ArrayList;

public class j2_2010 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int s = scan.nextInt();
        int distance1 = 0;
        int distance2 = 0;
        int totalsteps1 = 0;
        int totalsteps2 = 0;
        int counter = 1;
        boolean done = false;
    
        while (done==false) {
            if (counter % 2 != 0) {
                if (totalsteps1 + a < s) {
                    distance1 += a;
                    totalsteps1 += a;
                }
                else {
                    distance1 += (s - totalsteps1);
                   
                    break;
                }
            } else {

                if (totalsteps1 + b < s) {
                    distance1 -= b;
                    totalsteps1 += b;
                }
                else {
                    distance1 -= (s - totalsteps1);
                    
                    done = true;
                    break;
                }
            }
            counter++;
        }
        counter = 1;
        done =false;
        while (done == false) {

            if (counter % 2 != 0) {
                if (totalsteps2 + c < s) {
                    distance2 += c;
                    totalsteps2 += c;
                    
                }
                else {
                    distance2 += (s - totalsteps2);
                    
                    break;
                }
            } else {

                if (totalsteps2 + d < s) {
                    distance2 -= d;
                    totalsteps2 += d;
                   
                }
                else {
                    distance2 -= (s - totalsteps2);
                   
                    done = true;
                    break;
                }
                if (done == true)
                {
                    break;
                }
            }
            counter++;
        }
        if (distance1==distance2)
        {
            System.out.println("Tied");
        }

        else if (distance1>distance2)
        {
            System.out.println("Nikky");
        }
        else
        {
            System.out.println("Byron");
        }

    }

}
