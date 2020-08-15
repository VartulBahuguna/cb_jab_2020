package practice;

import java.util.Scanner;

public class KthRoot
{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        while(t-- != 0)
        {
            long n = s.nextLong();
            long k = s.nextLong();

            long temp = 1;
            long left = 1;
            long right = (long)Math.sqrt(n);

            if(k == 1)
            {
                System.out.println(n);
            }
            else
            {
                while(left < right)
                {
                    temp = 1;
                    boolean check = true;
                    long mid = ((right + left + 1) >> 1);
                    for(int i = 1;  i <= k; ++i)
                    {
                        temp = temp * mid;
                        if(temp > n)
                        {
                            check = false;
                            break;
                        }
                    }
                    if(check)
                    {
                        left = mid ;
                    }
                    else
                    {
                        right = mid - 1;
                    }
                }
                System.out.println(right);
            }
        }
    }
}
//while(t-- != 0)
//        {
//        long n = s.nextLong();
//        long k = s.nextLong();
//
//        long x = 0;
//
//        while(true)
//        {
//        if(Math.pow(x, k) > n)
//        {
//        break;
//        }
//
//        x++;
//        }
//
//        System.out.println(x - 1);
//        }