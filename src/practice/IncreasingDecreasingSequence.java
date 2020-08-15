package practice;

import java.util.Scanner;

public class IncreasingDecreasingSequence
{
    public static void main(String args[])
    {Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        boolean check = true;

        boolean decOrder = false;

        int a = s.nextInt();

        n -= 1;

        while(n-- != 0)
        {
            int b = s.nextInt();

            if(a < b)
            {
                decOrder = true;
            }
            else if(b < a && decOrder)
            {
                check = false;
            }
            else if(a == b)
            {
                check = false;
            }

            a = b;
        }

        System.out.print(check);
    }
}
