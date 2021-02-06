//package senior2015;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

import javax.lang.model.util.ElementScanner6;

/**
 * Write a description of class s1_2019 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main {
    // instance variables - replace the example below with your own

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numJersey = scan.nextInt();
        int numPlayer = scan.nextInt();
        HashMap<Integer, Integer> jerseys = new HashMap<Integer, Integer>();
        ArrayList<String> input = new ArrayList<String>();
        scan.nextLine();
        for (int i = 0; i < numJersey; i++) {
            String str = scan.nextLine();

            if (str.equals("S")) {
                jerseys.put(i + 1, 1);
            } else if (str.equals("M")) {
                jerseys.put(i + 1, 2);
            } else if (str.equals("L")) {
                jerseys.put(i + 1, 3);
            }

        }
        int size = 99999;
        int counter = 0;

        for (int i = 0; i < numPlayer; i++) {
            String[] list = scan.nextLine().split(" ");

            int number = Integer.valueOf(list[1]);
            if (list[0].equals("S")) {
                size = 1;
            }

            else if (list[0].equals("M")) {
                size = 2;
            }

            else if (list[0].equals("L")){
                size = 3;
            }
            
            if (jerseys.get(number)!=null)
            {
                if (jerseys.get(number) >= size) {
                    counter++;
                    jerseys.remove(number);
                }
            }
           

        }
        System.out.println(counter);

    }
}
