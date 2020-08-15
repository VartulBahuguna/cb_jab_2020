package practice;

import java.util.Scanner;

public class Mixtures
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();

      //  int[] a = new int[n];
        int[] b = {40,60,20};

//        for(int i = 0; i < n; ++i)
//        {
//            a[i] = s.nextInt();
//        }
   //     int[][] dp = new int[n+1][n+1];
        int[][] dp = new int[2+1][2+1];
        System.out.print(smoke(b,0,2,dp));
    }

    public static int smoke(int[] a, int i, int j,int[][] dp)
    {
        if(i >= j)
        {
            return 0;
        }

        // if(dp[i][j] != 0)
        // {
        // 	return dp[i][j];
        // }

        int cnt = Integer.MAX_VALUE;

        for(int k = i; k <=j ;++k)
        {
            cnt = Math.min(cnt,smoke(a,i,k,dp) + smoke(a,k+1,j,dp)+ mixture(a,i,k)*mixture(a,k+1,j));
            //	dp[i][j] = Math.min(dp[i][j],smoke(a,i,k,dp) + smoke(a,k+1,j,dp)+ mixture(a,i,k)*mixture(a,k+1,j));
        }
        //return dp[i][j];
        return cnt;
    }

    public static int mixture(int[]a, int i, int j)
    {
        int sum = 0;
        for(int k = i; k <=j; ++k)
        {
            sum = (sum+a[i])%100;
        }
        return sum;
    }
}
