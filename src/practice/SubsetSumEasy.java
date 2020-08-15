package practice;

import java.util.Scanner;

public class SubsetSumEasy
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- != 0)
        {
            int n = s.nextInt();
            int[] ar = new int[n];
            for(int i = 0; i < n; ++i)
            {
                ar[i] = s.nextInt();
            }
            if(subset(ar, 0, 0, false))
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
    }

    public static boolean subset(int[] ar, int i , int sum, boolean include)
    {
        if(i == ar.length)
        {
            return (sum == 0 && include);
        }

        boolean inc = subset(ar, i + 1, sum + ar[i], true);
        boolean exc = subset(ar, i + 1, sum, include);
        return inc || exc;
    }
}
