package senior2020;

import java.util.Scanner;
import java.util.ArrayList;
public class s2_2020 {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int m = s.nextInt();
        int n = s.nextInt();

        int [] [] grid = new int[m][n];
        ArrayList <Integer> list = new ArrayList<Integer> ();
        s.nextLine();
        for (int i=0; i<m;i++)
        {
            String str = s.nextLine();
            String [] row =  str.split(" ");

            for (int x = 0; x<n; x++)
            {
                grid[i][x] = Integer.parseInt(row[x]);
                list.add(Integer.parseInt(row[x]));
            }

        }
        boolean found = false;
        boolean done = false;
        boolean research = false;
        int search = (m)*(n);
        int initial = grid [0][0];
        

        if (m==2 && n ==2)
        {
            if (grid[0][0] ==4)
            {
                System.out.println("yes");
                done = true;
                found = true;

            }

            else if (grid[0][0]==2 && grid[0][1]==4 )
            {
                System.out.println("yes");
                done = true;
                found = true;
            }

            else if (grid[0][0]==2 && grid[1][0]==4)
            {
                System.out.println("yes");
                done = true;
                found = true;
            }
        }
       
        while (list.contains(search))
        {
      
                for (int y=0; y<m;y++)
                {

                    for (int x = 0; x<n; x++)
                    {
                        if (grid[y][x]==search)
                        {
                            search = (y+1)*(x+1);
                            
                            if (search == initial)
                            {
                                System.out.println("yes");
                                found = true;
                                break;
                            }

                        }
                    }
                    if (found == true)
                    {
                        break;
                    }
                }

                if (found == true)
                {
                    break;
                }
            
            
        }

        if (found ==false)
        {

            System.out.println("no");

        }

    }

}
