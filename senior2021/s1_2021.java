//package senior2021;

import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        ArrayList<Double> height = new ArrayList<Double>();
        ArrayList<Double> width = new ArrayList<Double>();
        String[] x = s.nextLine().split(" ");
        for (int i = 0; i < n + 1; i++) {
            height.add(Double.valueOf(x[i]));
        }
        String[] y = s.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            width.add(Double.valueOf(y[i]));
        }
        double area = 0.0;
        for (int i = 0; i < n; i++) {
            if (height.get(i) == height.get(i + 1)) {
                area += height.get(i) * width.get(i);
            }
            else if (height.get(i) < height.get(i + 1)) {
                area += height.get(i) * width.get(i);
                area += ((height.get(i + 1) - height.get(i)) * width.get(i)) / 2;
            }
            else {
                area += height.get(i + 1) * width.get(i);
                area += ((height.get(i) - height.get(i + 1)) * width.get(i)) / 2;
            }
        }
        System.out.println(area);
    }
}
