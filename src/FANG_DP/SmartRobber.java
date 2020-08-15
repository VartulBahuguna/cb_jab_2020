package FANG_DP;

import java.util.Scanner;

public class SmartRobber
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while (t-- != 0)
        {
            int n = s.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
            {
                a[i] = s.nextInt();
            }
            System.out.println(robbery(a));
        }
    }

    public static int robbery(int[] a)
    {

        int n = a.length;

        if(n == 0)
        {
            return 0;
        }
        if(n == 1)
        {
            return a[1];
        }
        if(n == 2)
        {
            return  Math.max(a[0], a[1]);
        }

        int[] ans = new int[n];

        ans[0] = a[0];
        ans[1] = Math.max(a[0], a[1]);

        for(int i = 2; i < n; ++i)
        {
            ans[i] = Math.max(ans[i-1], ans[i-2] + a[i]);
        }

        return ans[n-1];

    }

}
