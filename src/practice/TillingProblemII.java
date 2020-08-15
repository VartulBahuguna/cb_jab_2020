package practice;

import java.util.*;
public class TillingProblemII
 {
    public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);

		int t = s.nextInt();

		while(t-- != 0)
		{
			int n = s.nextInt();
			int m = s.nextInt();
			System.out.println(tiling(m,n)%(1000000007));
		}
    }

	public static int tiling(int m, int n)
	{
		int cnt = 0;
		if(n == 0)
		{
			return 1;
		}

		if(n >= m)
		{
			cnt += tiling(m, n - m);
		}
	
		cnt += tiling(m, n - 1);
		
		return cnt%(1000000007);
	}
}