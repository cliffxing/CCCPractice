package senior2020;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
/**
 * Write a description of class s4_2020 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class s4_2020
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        ArrayList <Integer> chars = new ArrayList<Integer>();

        
        String str = scan.nextLine();
        String[] list = str.split("");
        String n = "";
        boolean diff=false;
        int zeroC = 0;
        int oneC=0;
        for (int i=0; i<list.length; i++)
        {
            chars.add(Integer.valueOf(list[i]));
            if (Integer.valueOf(list[i])==0)
            {
                zeroC++;
            }

            else
            {
                oneC++;
            }
        }
        boolean sorted = false;
        int c =0;
        int index[] = checkSorted( chars, zeroC, oneC);
        System.out.println(index[0]);
        /*
        while(sorted == false)
        {
        int[] index = checkSorted(chars, oneC, zeroC);

        if (index[0] < 0)
        {
        System.out.println(c);
        break;
        }

        else
        {
        swap(chars, index[0], index[1]);
        }

        c++;
        }
         */

    }

    public static int[] checkSorted(ArrayList <Integer> chars, int a, int b)
    {
        int counter =0;
        ArrayList <Integer> biggest = new ArrayList<Integer>();
        ArrayList <Integer> end = new ArrayList<Integer>();
        int[] returnvalue = new int[2];
        for (int i=0; i<chars.size(); i++)
        {
            if (i<chars.size()-1)
            {
                if (chars.get(i) == chars.get(i+1))
                {
                    counter++;

                }
                else 
                {
                    end.add(i);
                    biggest.add(counter);
                    counter = 0;
                }
            }

        }

        int big = Collections.max(biggest)+1;
        System.out.println(big);
        if (chars.get(chars.indexOf(big-1))==0)
        {
            if (a ==  big)
            {
                System.out.println("here");
                returnvalue[0]=-1;
                returnvalue[1]=0;
                return returnvalue;
            }
            else
            {
                //System.out.println(biggest.indexOf(big-1));
                returnvalue[0]=end.get(biggest.indexOf(big-1)); //index
                returnvalue[1]=big; //value
                return returnvalue;
            }
        }
        else
        {
            if (b ==  big)
            {
                System.out.println("here");
                returnvalue[0]=-1;
                returnvalue[1]=0;
                return returnvalue;
            }
            else
            {
                //System.out.println(biggest.indexOf(big-1));
               returnvalue[0]=end.get(biggest.indexOf(big-1)); //index
                returnvalue[1]=big; //value
                return returnvalue;
            }
        }


    }

    public static void swap(ArrayList<Integer> chars, int index, int biggest)
    {
        int startingIndex = index - biggest;

        int longest;
        int c=0;
        if (chars.get(index)==0)
        {
            longest = 0;
        }
        else
        {
            longest =1;
        }

        boolean continuous = true;
        for (int i=0; i<chars.size(); i++)
        {
            if (i <startingIndex-1)
            {
                if (chars.get(i) != chars.get(i+1))
                {
                    if (chars.get(i)==longest)
                    {
                        int temp = i;
                        chars.set(i, chars.get(startingIndex-1));
                        chars.set(startingIndex - 1, temp);
                    }

                    else
                    {
                        int temp = i+1;
                        chars.set(i+1, chars.get(startingIndex-1));
                        chars.set(startingIndex - 1, temp);
                    }
                }
            }

            else
            {
                if (chars.get(i) != chars.get(i+1))
                {
                    if (chars.get(i)==longest)
                    {
                        int temp = i;
                        chars.set(i, chars.get(index+1));
                        chars.set(index + 1, temp);
                    }

                    else
                    {
                        int temp = i+1;
                        chars.set(i+1, chars.get(index+1));
                        chars.set(index + 1, temp);
                    }
                }
            }

        }  
    }
}
