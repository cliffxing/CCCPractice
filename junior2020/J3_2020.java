package junior2020;

import java.util.Scanner;

public class J3_2020 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean hasStarted = false;
        int n = s.nextInt();
        int minX = 0;
        int minY = 0;
        int maxX = 0;
        int maxY = 0;

        int[] xCoords = new int[n];
        int[] yCoords = new int[n];
        for (int i = 0; i < n; i++) {
            String[] coord = s.next().split(",");
            int coordX = Integer.parseInt(coord[0]);
            int coordY = Integer.parseInt(coord[1]);

            xCoords[i] = coordX;
            yCoords[i] = coordY;

        }

        // min x and y
        for (int i = 0; i < xCoords.length; i++) {
            if (hasStarted == false) {
                minX = xCoords[i];
                minY = yCoords[i];
                hasStarted = true;
            }

            else {
                if (xCoords[i] < minX) {
                    minX = xCoords[i];
                }

                if (yCoords[i] < minY) {
                    minY = yCoords[i];
                }

            }

        }
        hasStarted = false;
        for (int i = 0; i < xCoords.length; i++) {
            if (hasStarted == false) {
                maxX = xCoords[i];
                maxY = yCoords[i];
                hasStarted = true;
            }

            else {
                if (xCoords[i] > maxX) {
                    maxX = xCoords[i];
                }

                if (yCoords[i] > maxY) {
                    maxY = yCoords[i];
                }

            }

        }
        maxY = maxY + 1;
        maxX = maxX + 1;
        minY = minY - 1;
        minX = minX - 1;

        System.out.println(minX + ", " + minY);
        System.out.println(maxX + ", " + maxY);

    }

}
