package CB_DP_Webinar;

public class MinCoinsNeeded
{
    public static void main(String[] args) {
        int[] ch = {1, 7, 10};
        int n = 15;
        int[] dp = new int[n+1];
        System.out.println(minCoinsNeeded(n,dp,ch));
        System.out.println(itrminCoinsNeeded(n,ch));
    }

    private static int minCoinsNeeded(int n, int[] dp, int[] ch)
    {
        int sum = Integer.MAX_VALUE;
        if(n == 0)
        {
            return 0;
        }

        if(dp[n] != 0)
        {
            return dp[n];
        }

        for (int i = 0; i < ch.length; i++)
        {
            if(n-ch[i] >= 0)
            {
                int t = minCoinsNeeded(n-ch[i], dp , ch)+1;
                if(t < sum)
                sum = t;
            }
            else
            {
                break;
            }
        }

        return dp[n] = sum;
    }

    private static int itrminCoinsNeeded(int n, int[] ch)
    {
        int[] dp = new int[n+1];

        for (int i = 1; i <= n; i++)
        {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < ch.length; j++)
            {
                if(i - ch[j] >= 0)
                {
                    int t = dp[i-ch[j]]+1;
                    {
                        if(min>t)
                        {
                            min = t;
                        }
                    }
                }
            }
            dp[i] = min;
        }

        return dp[n];
    }

}
