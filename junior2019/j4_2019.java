package junior2019;

import java.util.Scanner;
/**
 * Write a description of class s1_2019 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class j4_2019
{
    // instance variables - replace the example below with your own

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int r;
        int l;

        int [][] grid = new int[2] [2];
        grid[0][0]=1;
        grid[0][1]=2;
        grid[1][0]=3;
        grid[1][1]=4;

        for (int i=0; i<s.length();i++)
        {
            char c = s.charAt(i);
            if (c == 'H')
            {
                r = grid[0][0];
                l = grid[0][1];

                grid[0][0] = grid[1][0];
                grid[0][1] = grid [1][1];
                
                grid[1][0] = r;
                grid [1][1] = l;

            }

            else if (c=='V')
            {
                r = grid[0][0];
                l = grid[1][0];

                grid[0][0] = grid[0][1];
                grid[1][0] = grid [1][1];
                
                grid[0][1] = r;
                grid [1][1] = l;
            }
        }


        for (int y=0; y<2; y++)
        {
            for (int x =0; x<2; x++)
            {
                System.out.print(grid[y][x]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        

    }
}
