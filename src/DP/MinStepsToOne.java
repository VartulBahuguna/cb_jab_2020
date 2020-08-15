package DP;

public class MinStepsToOne
{
    public static void main(String[] args) {
        int n = 10;
        int[] dp = new int[10];
        System.out.println(TD(n,dp));
        System.out.println(BU(n));

    }

    public static int BU(int n)
    {
        int[] dp = new int[n];

        dp[0] = 0;

        for (int i = 1; i < n; i++)
        {
            if(i%3 == 0)
            {
                dp[i] = dp[i/3] + 1;
            }
            else if(i%2 == 0)
            {
                dp[i] = dp[i/2] + 1;
            }
            else
            {
                dp[i] = dp[i-1] + 1;
            }
        }

        return dp[n-1];
    }


    public static int TD(int n, int[] dp)
    {
        if(n == 1)
        {
            return 0;
        }

        if(dp[n-1] != 0)
        {
            return dp[n - 1];
        }

        int p2;
        int p3;
        int p1 = p2 = p3 = Integer.MAX_VALUE;

        if(n%3 == 0)
        {
            p3 = TD(n/3, dp) + 1;
        }
        if(n%2 == 0)
        {
            p2 = TD(n/2, dp) + 1;
        }
        p1 = TD(n-1, dp) + 1;

        return dp[n-1] = Math.min(p1,Math.min(p2,p3));
    }

}
