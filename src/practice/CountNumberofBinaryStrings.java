package practice;

import java.util.*;
public class CountNumberofBinaryStrings
 {
    public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);

		int t = s.nextInt();

		while(t-- != 0)
		{
			long n = s.nextInt();
			long[] a = new long[(int)n];
			long[] b = new long[(int)n];
			a[0] = 1;
			b[0] = 1;
			for(long i =1; i < n; ++i)
			{
				a[(int)i] = a[(int)(i-1)] + b[(int)(i-1)];
				b[(int)i] = a[(int)(i-1)];
			}
			System.out.println(a[(int)(n-1)] + b[(int)(n-1)]);
	//		System.out.println(count(n,""));
		}
    }

	public static int count(int n, String proc)
	{
		int cnt = 0;
		if(n == 0)
		{
			return 1;
		}

		cnt += count(n-1, proc + "0");
		if(proc.isEmpty() || proc.charAt(proc.length() - 1) != '1')
		{
			cnt += count(n-1, proc + "1");
		}
		// else if(proc.charAt(proc.length - 1) != '1')
		// {
		// 	cnt += count(n-1, proc + "1");
		// 
		
		return cnt;
	}
}