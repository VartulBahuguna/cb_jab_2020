import java.util.*;
public class UglyNumbers
 {
    public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);

		int t = s.nextInt();

		while(t-- != 0)
		{
			long n = s.nextInt();

			System.out.println(Ugly(n));
		}
    }

	public static long Ugly(long n)
	{
		long[] dp = new long[(int)n+1];
		long nm2 = 2;
		long nm3 = 3;
		long nm5 = 5;
		dp[0] = 1;
		long i2 = 0;
		long i3 = 0;
		long i5 = 0;
		
		for(long i = 1; i <= n; ++i)
		{
			long nm = Math.min(nm2, Math.min(nm3, nm5));
			
			dp[(int)i] = nm;
			if(nm == nm2)
			{
				i2++;
				nm2 = dp[(int)i2] * 2;
			}
			if(nm == nm3)
			{
				i3++;
				nm3 = dp[(int)i3] * 3;
			}
			if(nm == nm5)
			{
				i5++;
				nm5 = dp[(int)i5] * 5;
			}
		}

		return dp[(int)n-1];
	}
}