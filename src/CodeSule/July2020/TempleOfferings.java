package CodeSule.July2020;

import java.util.Arrays;
import java.util.Scanner;

public class TempleOfferings
{
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        int t = s.nextInt();

        while(t-- != 0)
        {
            int n = s.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; ++i)
            {
                a[i] = s.nextInt();
            }
            int[] ans = new int[n];

            ans[0] = 1;
            for(int i = 1; i < n; ++i)
            {
                ans[i] = 1;
                if(a[i] > a[i-1])
                {
                    ans[i] = ans[i-1] + 1;
                }
                else if(a[i] < a[i-1])
                {
                    if(ans[i-1] - 1 <= 0)
                    {
                        check(a,ans,i);
                    }
//                    else
//                    {
//                        ans[i] = ans[i-1] - 1;
//                    }
                }

            }

            int sum = 0;
            for(int i = 0; i < n; ++i)
            {
                sum += ans[i];
            }
             System.out.println(Arrays.toString(ans));
            System.out.println(sum);
        }

    }

    public static void check(int[] a, int[] ans, int k)
    {
        for(int i = k; i >= 1; --i)
        {
            if(a[i-1] > a[i])
            {
                ans[i-1]++;
            }
            else
            {
                break;
            }
        }
    }


}