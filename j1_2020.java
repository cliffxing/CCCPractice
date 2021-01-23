import java.util.Scanner;
public class j1_2020 {

    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        int small = s.nextInt();
        int medium = s.nextInt();
        int large = s.nextInt();

        int h = (1*small)+(2*medium )+(3*large);
        if (h>=10)
        {
            System.out.println("happy");

        }
        else 
        {
            System.out.println("sad");
        }

    }

}
