package CB_DP_Webinar;

public class LadderProblem
{
    public static void main(String[] args)
    {
        int n = 6;
        int[] dp = new int[n+1];
        System.out.println(up(n, dp));
        System.out.println(itrup(n));

    }

    public static int up(int n, int[] dp)
    {
        int sum = 0;
        if(n == 0)
        {
            return 1;
        }
        if(n<0)
        {
            return 0;
        }
        if(dp[n] != 0)
        {
            return dp[n];
        }

        for (int i = 1; i <= 3 ; i++)
        {
             sum += up(n - i,dp);
        }

        return dp[n] = sum;
    }

    public static int itrup(int n)
    {
        int[] dp = new int[n+1];
        dp[0] = 1;

        for (int i = 1; i <= n ; i++)
        {
            for (int j = 1; j <= 3 ; j++)
            {
                if(i-j>=0)
                {
                    dp[i] += dp[i-j];
                }
            }
        }

        return dp[n];
    }




}
