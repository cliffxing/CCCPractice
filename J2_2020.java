import java.util.Scanner;
public class J2_2020 {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        
        int p = s.nextInt();
        int n = s.nextInt();
        int r = s.nextInt();
        
        
        int count =0;
        int people = n;
        
        while (people<=p)
        {

            n = (n*r);
            people = people + n;
            count++;
            
        }
        
        System.out.println(count);
        
        
        

    }

}
