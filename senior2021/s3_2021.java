package senior2021;

import java.util.Scanner;

import java.util.ArrayList;
import java.lang.Math;
import java.util.Collections;

public class s3_2021 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<Integer> position = new ArrayList<Integer>();
        ArrayList<Integer> velocity = new ArrayList<Integer>();
        ArrayList<Integer> range = new ArrayList<Integer>();

        ArrayList<Integer> minRanges = new ArrayList<Integer>();
        ArrayList<Integer> maxRanges = new ArrayList<Integer>();
        ArrayList<Integer> times = new ArrayList<Integer>();
        s.nextLine();

        for (int i = 0; i < n; i++) {
            String[] line = s.nextLine().split(" ");
            position.add(Integer.valueOf(line[0]));
            velocity.add(Integer.valueOf(line[1]));
            range.add(Integer.valueOf(line[2]));

            minRanges.add(Integer.valueOf(line[0]) - Integer.valueOf(line[2]));
            maxRanges.add(Integer.valueOf(line[0]) + Integer.valueOf(line[2]));
        }

        int max = Collections.max(maxRanges);
        int min = Collections.min(minRanges);

        for (int c = min; c<max; c++)
        {
            int biggest = 0;
            for (int p = 0; p<n; p++)
            {
                if (Math.abs(c - position.get(p))<=range.get(p))
                {
                    biggest +=0;
                }

                else 
                {
                    biggest += (Math.abs(c - position.get(p))-range.get(p))*velocity.get(p);
                }
            }
            
            times.add(biggest);
        }
        System.out.println(Collections.min(times));
    }


}
