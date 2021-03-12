package senior2021;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;

public class s2_test {

    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<String>();
        ArrayList<String> transformations = new ArrayList<String>();
        int m = s.nextInt();
        int n = s.nextInt();
        int k = s.nextInt();
        s.nextLine();

        int[][]grid = new int [m][n];
        for (int i = 0; i<k; i++)
        {
            inputs.add(s.nextLine());
        }

        for (int i = 0; i<inputs.size(); i++)
        {
            if (Collections.frequency(inputs, inputs.get(i))%2!=0 )
            {
                transformations.add(inputs.get(i));
                inputs.remove(transformations.get(i));
                
            }
        }

        int counter = 0;
        
        for (int i = 0; i<transformations.size();i++)
        {
            String [] line = transformations.get(i).split(" ");
            int num = Integer.valueOf(line[1]);
            if (line[0].equals("R"))
            {
                for (int j = 0; j<n; j++)
                {
                    if (grid[num-1][j]==0)
                    {
                        grid[num-1][j] = 1;
                        counter++;
                    }
                    else
                    {
                        grid[num-1][j] = 0;
                        counter--;
                    }
                }
            }
            else
            {
                for (int j = 0; j<m; j++)
                {
                    if (grid[j][num-1]==0)
                    {
                        grid[j][num-1] = 1;
                        counter++;
                    }
                    else
                    {
                        grid[j][num-1] = 0;
                        counter--;
                    }
                }
            }

            
        }
        
    
        System.out.println(counter);


       
    }

}
