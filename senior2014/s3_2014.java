package senior2014;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class s3_2014 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Stack<Integer> branch = new Stack<Integer>(); // branch
        Stack<Integer> input = new Stack<Integer>(); // input

        ArrayList<Integer> list = new ArrayList<Integer>();
        int x = s.nextInt();

        for (int i = 0; i < x; i++) // each test
        {
            int n = s.nextInt(); // rounds

            branch.clear();
            input.clear();
            list.clear();
            
            for (int k = 0; k < n; k++) {
                input.push(s.nextInt());
            }
            int index = 1;
            while (!input.isEmpty()) {
                int y = input.pop();

                if (y == index) {
                    index++;
                    list.add(y);
                    
                }

                else if (!branch.isEmpty() && branch.peek() == index) {

                    list.add(branch.pop());
                    
                    index++;
                }

                else {
                    branch.push(y);
                    
                }
            }

            int u = branch.size();

            if (!branch.isEmpty()) {
                for (int j = 0; j < u; j++) {
                    
                    list.add(branch.pop());

                }

            }

            if (listCheck(list) == true) {
                System.out.println("Y");
            }

            else {
                System.out.println("N");
            }

        }

    }

    public static boolean listCheck(ArrayList<Integer> list) {
        int index = 1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == index) {
                index++;
            } else {
                return false;
            }
        }
        return true;

    }
}
