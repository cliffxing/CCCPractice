package junior2018;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class j4_2018 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        s.nextLine();

        int[][] grid = new int[n][n];

        for (int y = 0; y < n; y++) {
            String str = s.nextLine();
            String[] row = str.split(" ");
            for (int x = 0; x < n; x++) {
                grid[y][x] = Integer.valueOf(row[x]);
            }
        }
        boolean found = false;
        grid = rotate90(grid, n);

        while (found == false) {
            grid = rotate90(grid, n);
            if (checkGrid(grid, n) == true) {
                found = true;

            }

        }

        for (int y = 0; y < n; y++) {
            for (int x = 0; x < n; x++) {
                System.out.print(grid[y][x] + " ");
            }
            System.out.println("");
        }

    }

    static int[][] rotate90(int[][] grid, int n) {
        int[][] rotated = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[i][j] = grid[n - j - 1][i];
            }
        }
        return rotated;
    }

    static boolean checkGrid(int[][] grid, int n) {
        for (int y = 0; y < n; y++) {
            for (int i = 0; i < n; i++) {
                if (i < n - 1) {
                    if (grid[y][i] > grid[y][i + 1]) {
                        return false;
                    }
                }
            }
        }
        for (int y = 0; y < n; y++) {
            if (y < n - 1) {
                if (grid[y][0] > grid[y + 1][0]) {
                    return false;
                }
            }

        }

        return true;

    }

}
