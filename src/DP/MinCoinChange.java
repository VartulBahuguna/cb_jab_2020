package DP;

public class MinCoinChange
{
    public static void main(String[] args) {
        int[] coins = {1,2,5,10,20,50};
        int target = 4;
        int[] dp = new int[target];
        System.out.println(TD(coins,target,dp));
        System.out.println(BU(coins, target));
    }

    public  static  int BU(int[] a,int t)
    {
        int[] dp = new int[t+1];
        dp[0] = 0;


        for (int i = 1; i <= t; i++)
        {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < a.length; j++)
            {
                    if(i-a[j]  < 0)
                    {
                        continue;
                    }

                    if(min > dp[i-a[j]])
                    {
                        min = dp[i-a[j]] + 1;
                    }
            }
            dp[i] = min;
        }
        return dp[t];
    }

    public  static  int TD(int[] a,int t, int[] dp)
    {
        if(t == 0)
        {
            return 0;
        }

        if(dp[t-1] != 0)
        {
            return dp[t-1];
        }
        int ans = Integer.MAX_VALUE;
        for (int value : a) {
            if (t - value < 0) {
                continue;
            }
            int temp = TD(a, t - value, dp);
            if (temp < ans) {
                ans = temp + 1;
            }
        }
        return dp[t-1] = ans;
    }

}
