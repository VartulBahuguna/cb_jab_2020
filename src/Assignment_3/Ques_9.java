package Assignment_3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ques_9
{
    public static void main(String[] args)
    {
         Scanner s = new Scanner(System.in);
         int num = s.nextInt();
         if(Armstrong(num) == num)
             System.out.println("Yes, Armstrong " + Armstrong(num));
         else
             System.out.println("No, Not a Armstrong " + Armstrong(num));
    }
    public static int Armstrong (int num)
    {
        int n = num ;
        int x = 0;
        int c = 0;
        while(n!=0)
        {
            n = n / 10;
            c++;
        }

        while(num!=0)
        {
            int rem = num % 10 ;
            x = x + (int)Math.pow(rem , c);
            num = num / 10 ;
        }
        return x;
    }


}
