package practice;

import java.util.Scanner;

public class OddandEvenbackinDelhi
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while(n-- != 0)
        {
            long num = s.nextLong();
            int sumo = 0;
            int sume = 0;
            while(num != 0)
            {
                int rem = (int)(num % 10 );
                if(rem % 2 == 0)
                {
                    sume += rem;
                }
                else
                    sumo += rem;
                num = num / 10;
            }
            if(sumo % 3 == 0 || sume % 4 == 0)
            {
                System.out.println("Yes");
            }
            else
                System.out.println("No");
        }
    }
}
