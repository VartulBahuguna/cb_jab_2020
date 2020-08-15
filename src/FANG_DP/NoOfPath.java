package FANG_DP;

import java.util.Scanner;

public class NoOfPath
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        while(t-- != 0)
        {
            int n = s.nextInt();
            int m = s.nextInt();
            int[][] dp = new int[n][m];
            System.out.println(cntPath(n-1, m-1, dp));
            System.out.println(cntPathItr(n, m));
        }

    }

    public static int cntPath(int n, int m, int[][] dp)
    {
        if(n == 0 || m == 0)
        {
            return 1;
        }

        if(dp[n][m] != 0)
        {
            return dp[n][m];
        }

        dp[n][m] = cntPath(n-1, m, dp) + cntPath(n, m - 1, dp);

        return dp[n][m];
    }

    public static int cntPathItr(int n, int m)
    {
        int[][] dp = new int[n][m];
        dp[0][0] = 1;

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                if(i == 0 && j == 0)
                {
                    continue;
                }

                if(i-1 >= 0 && j-1 >= 0)
                {
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
                else if(i-1 >= 0)
                {
                    dp[i][j] = dp[i-1][j];
                }
                else
                {
                    dp[i][j] = dp[i][j-1];
                }
            }
        }

        return dp[n-1][m-1];
    }


}
