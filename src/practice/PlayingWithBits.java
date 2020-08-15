package practice;

import java.util.Scanner;

public class PlayingWithBits
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int  t = s.nextInt();

        while(t-- != 0)
        {
            int num1 = s.nextInt();
            int num2 = s.nextInt();
            int setBit = 0;
            for(int i = num1; i <= num2; ++i)
            {
                int num = i;
                while(num != 0)
                {
                    if((num&1) == 1)
                    {
                        setBit++;
                    }

                    num = (num>>1);
                }
            }
            System.out.println(setBit);
        }

    }
}
