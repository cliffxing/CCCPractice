import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
/**
 * Write a description of class s1_2019 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class s2_2019
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
        ArrayList <Integer> list = new ArrayList<Integer>();
        
        int [] a;
        int [] b = new int[start];
        int biggest=0;

        boolean hasStarted = false;
        for (int i =0; i <start; i++)
        {   
            b[i] = scan.nextInt();
            if (hasStarted == false)
            {
                biggest = b[i];
                hasStarted = true;
            }
            else
            {
                if (b[i]>biggest)
                {
                    biggest = b[i];
                }
            }
        }                             
        list = findPrimes(biggest*2);
        
        for (int i=0; i<start; i++)
        {
            a = search(b[i]*2, list);
            System.out.println(a[0] + " "+a[1]);
        }
        
    }
    
    public static int[] search(int x, ArrayList <Integer> list)
    {
        int [] a = new int[2];
        for (int i=0; i<x/2;i++)
        {
            int num = x - list.get(i);
            
            int index = Collections.binarySearch(list, num);
            if (index > 0 )
            {
                a[0] = num;
                a[1] = list.get(i);
                return a;
            }
            
           
        }
        return a;
    }
    
    public static ArrayList<Integer> findPrimes(int n)
    {
        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++)
            prime[i] = true;

        for (int p = 2; p * p <= n; p++) 
        {

            if (prime[p] == true) 
            {

                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }
        ArrayList <Integer> list2 = new ArrayList<Integer>();
        
        for (int i = 2; i <= n; i++)
        {
            if (prime[i] == true)
                list2.add(i);
        }
        return list2;
    }

}
