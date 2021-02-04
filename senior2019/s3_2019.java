package senior2019;

import java.util.Scanner;
import java.util.Arrays;
public class s3_2019 {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String [] [] grid = new String[3][3];
        int xPos=0;
        int yPos=0;
        int counter=0;
        int difference;
        int sum;

        for (int y=0; y<3;y++)
        {
            String [] line =  s.nextLine().split(" ");
            for (int x =0; x<3; x++)
            {
                grid[y][x] =line[x];
            }
        }

        
        for (int y=0; y<3;y++) //rows
        {
            counter = 0;
            sum =0;
            for (int x =0; x<3; x++)
            {
               if (!grid[y][x].equals("X"))
               {
                   counter++;
                   sum += Integer.valueOf(grid[y][x]);
               }
               
               else 
               {
                   xPos = x;
                   yPos = y;
               }
         
            }
            
            if (counter == 2)
            {
                if (xPos == 0)
                {
                   difference = Integer.valueOf(grid[yPos][2]) - Integer.valueOf(grid[yPos][1]);
                   grid[yPos][xPos] = String.valueOf(Integer.valueOf(grid[yPos][2]) - difference);
                }
                else if (xPos == 1)
                {
                     grid[yPos][xPos] = String.valueOf(sum/2);
                }
                else
                {
                   difference = Integer.valueOf(grid[yPos][1]) - Integer.valueOf(grid[yPos][0]);
                   grid[yPos][xPos] = String.valueOf(Integer.valueOf(grid[yPos][1]) + difference);
                    
                }
               
            }
            
        }
        
        
        
        for (int x=0; x<3;x++) //columns
        {
            counter = 0;
            sum =0;
            for (int y =0; y<3; y++)
            {
               if (!grid[y][x].equals("X"))
               {
                   counter++;
                   sum += Integer.valueOf(grid[y][x]);
               }
               
               else 
               {
                   xPos = x;
                   yPos = y;
               }
         
            }
            
            if (counter == 2)
            {
                if (yPos == 0)
                {
                   difference = Integer.valueOf(grid[2][xPos]) - Integer.valueOf(grid[1][xPos]);
                   grid[yPos][xPos] = String.valueOf(Integer.valueOf(grid[1][xPos]) - difference);
                }
                else if (yPos == 1)
                {
                     grid[yPos][xPos] = String.valueOf(sum/2);
                }
                else
                {
                   difference = Integer.valueOf(grid[1][xPos]) - Integer.valueOf(grid[0][yPos]);
                   grid[yPos][xPos] = String.valueOf(Integer.valueOf(grid[1][yPos]) + difference);
                    
                }
               
            }
            
        }
        
        
        
        
        printGrid(grid);
       
        
       
    }
    
    public static void printGrid(String grid[][])
    {
        for (int y=0; y<3;y++)
        {
            
            for (int x =0; x<3; x++)
            {
                System.out.print(grid[y][x] +" ");
                
            }
            System.out.println("");
        }
    }
}

