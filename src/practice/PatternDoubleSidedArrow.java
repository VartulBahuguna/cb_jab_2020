package practice;

import java.util.Scanner;

public class PatternDoubleSidedArrow
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int k = 1;

        for(int i = 1; i <= n; ++i)
        {
            int m = k;
            for(int j = 1; j <= n + 2*(k-1); ++j)
            {
                if(j < n - 2*(k-1) || ((j >= n - k + 2) && (j < n + (k-1))))
                {
                    System.out.print("  ");
                }
                else
                {
                    System.out.print(m + " ");
                    if(j<n)
                    {
                        m--;
                    }
                    else
                    {
                        m++;
                    }
                    if(m == 0)
                    {
                        m=1;
                    }
                }

            }
            if(i <= n/2)
            {
                k++;
            }
            else
            {
                k--;
            }
            System.out.println();
        }
    }
}
