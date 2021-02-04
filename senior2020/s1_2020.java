package senior2020;


import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;
import java.util.Comparator;

public class s1_2020 {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        double speed;
        s.nextLine();
        double x;
        double y;
        double x2;
        double y2;

        double[] [] array = new double[n][2];

        for (int i=0; i<n; i++)
        {
            String[] line = s.nextLine().split(" ");
            array[i][0] = Double.valueOf(line[0]);
            array[i][1] = Double.valueOf(line[1]);
        }

        Arrays.sort(array, new Comparator<double[]>()
        {
            public int compare (double[] a, double[] b)
            {
                return Double.compare(a[0], b[0]);
            }
        }
        );
        
        
      boolean hasStarted = false;
        double biggest=0;

    
        for (int i=0; i<n; i++)
        {

            if (i!= n-1)
            {
                
                x = array[i][0];
                y = array[i][1];

                
                x2 = array[i+1][0];
                y2 = array[i+1][1];

                speed = Math.abs(y2-y)/Math.abs(x2-x);
                
                if (hasStarted == false)
                {
                    biggest = speed;
                    hasStarted = true;
                }

                else
                {
                    if (speed>biggest)
                    {
                        biggest = speed;
                    }
                }
            }
        }

        System.out.println(biggest);

       
    }
    
}

/*
 * 
 *  for (int i = 0; i < xarray.length; i++) {

            for (int k = 1; k < xarray.length - i; k++) {

                if (xarray[k - 1] > xarray[k]) {

                    double temp = xarray[k - 1];

                    xarray[k - 1] = xarray[k];

                    xarray[k] = temp;

                    temp = yarray[k-1];
                    yarray[k - 1] = yarray[k];
                    yarray[k] = temp;

                }

            }

        }

        
 */
