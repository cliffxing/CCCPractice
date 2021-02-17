
package senior2017;

import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;

public class s2_2017 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        int[] list1 = new int[k];
        ArrayList<Integer> list = new <Integer>ArrayList();
        ArrayList<Integer> list2 = new <Integer>ArrayList();

        s.nextLine();
        String[] str1 = s.nextLine().split(" ");

        for (int i = 0; i < k; i++) {
            list1[i] = Integer.valueOf(str1[i]);
        }
        list1 = sort(list1);

        int half = k / 2;

        for (int p = 0; p < half; p++) {
            list.add(list1[p]);
        }
        for (int p = half; p < k; p++) {
            list2.add(list1[p]);
        }
        for (int i = 0; i < half; i++) {
            System.out.print(list.get((half - 1) - i) + " ");
            System.out.print(list2.get(i) + " ");

        }


    }

    static int[] sort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

        return arr;
    }
}
