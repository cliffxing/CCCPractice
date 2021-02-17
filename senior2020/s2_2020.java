package senior2020;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;
import java.util.Stack;

public class s2_2020 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //get m and n
        int m = s.nextInt();
        int n = s.nextInt();

        int[][] grid = new int[m][n];
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> dupe = new ArrayList<Integer>();
        ArrayList<int[]> point = new ArrayList<int[]>();
        Stack<Integer> duplicated = new Stack<Integer>();

        s.nextLine();

        //append into 2d array
        for (int i = 0; i < m; i++) {
            String str = s.nextLine();
            String[] row = str.split(" ");

            for (int x = 0; x < n; x++) {
                grid[i][x] = Integer.parseInt(row[x]);

                if (list.contains(Integer.valueOf(row[x]))) {
                    dupe.add(Integer.valueOf(row[x])); //adds to dupe array

                    int[] array = new int[2];
                    array[0] = i;
                    array[1] = x;
                    point.add(array); //adds the dupe's coordinate to array
                }

                list.add(Integer.valueOf(row[x])); //adds number to array
            }

        }
        boolean found = false;
        boolean done = false;
        
        int search = (m) * (n);
        int initial = grid[0][0];
        int counter = 0;

        if (m == 2 && n == 2) { //m=2 and n=2 case
            if (grid[0][0] == 4) {
                System.out.println("yes");
                done = true;
                found = true;

            }

            else if (grid[0][0] == 2 && grid[0][1] == 4) {
                System.out.println("yes");
                done = true;
                found = true;
            }

            else if (grid[0][0] == 2 && grid[1][0] == 4) {
                System.out.println("yes");
                done = true;
                found = true;
            }
        } else if (m == 1) {
            if (!list.contains(n)) {
                System.out.println("no");
                done = true;
            }
        }

        boolean duping = false;
        int previousdupe = 0;

        while (done == false) {
            
            if (counter >= m * n) {
                System.out.println("no");
                break;
            }

            if (dupe.contains(search)) {
                for (int i = 0; i < Collections.frequency(dupe, search); i++) {
                    duplicated.push(search);

                }

            }

            search = findSearch(search, m, n, grid, initial, list);
            

            if (search == 0 && duping == false && duplicated.isEmpty()) {
                System.out.println("no");
                break;
            } else if (search < 0) {
                break;
            }

            else if (search == 0 && !duplicated.isEmpty()) {

                int k = duplicated.pop();

                int[] x = point.get(dupe.indexOf(k));
                search = (x[0] + 1) * (x[1] + 1);

                point.remove(dupe.indexOf(k));
                dupe.remove(dupe.indexOf(k));

            }
            counter++;
        }

    }

    static int findSearch(int search, int m, int n, int[][] grid, int initial, ArrayList<Integer> list) {
        if (!list.contains(search)) {
            return 0;
        }

        for (int y = 0; y < m; y++) {
            for (int x = 0; x < n; x++) {
                if (grid[y][x] == search) {

                    if (search == initial) {
                        System.out.println("yes");
                        return -1;
                    }

                    return (y + 1) * (x + 1);

                }
            }

        }
        return 0;
    }

}