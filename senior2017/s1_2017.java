//package senior2017;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        ArrayList<Integer> list1 = new <Integer>ArrayList();
        ArrayList<Integer> list2 = new <Integer>ArrayList();
        ArrayList<Integer> longest = new <Integer>ArrayList();
        s.nextLine();
        String[] str1 = s.nextLine().split(" ");
        String[] str2 = s.nextLine().split(" ");
        for (int i = 0; i < k; i++) {
            list1.add(Integer.valueOf(str1[i]));
            list2.add(Integer.valueOf(str2[i]));
        }
        int sum1 = 0;
        int sum2 = 0;
        int biggest = 0;

        sum1 = 0;
        sum2 = 0;

        for (int i = 0; i <k; i++) {
            sum1+=list1.get(i);
            sum2+=list2.get(i);
            if (sum1==sum2)
            {
                biggest = i+1;
            }
        }
       
        System.out.println(biggest);
    }
}
