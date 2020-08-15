package practice;

import java.util.*;
public class MinimumJumpsRequired
 {
    public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);

		int t = s.nextInt();

		while(t-- != 0)
		{
			int n = s.nextInt();

			int[] a = new int[n];

			int[][] mem = new int[n+1][n+1];
			for(int i = 0; i < n; ++i)
			{
				a[i] = s.nextInt();
			}

			System.out.println(findMin(a,0,mem));
		}
    }

	public static int findMin(int[] a, int i, int[][] mem)
	{
		int min = Integer.MAX_VALUE;

		if(i >= a.length)
		{
			return 0;
		}
		if(a[i] == 0)
		{
			return Integer.MAX_VALUE;
		}

		for(int j = i; j <= i; ++j)
		{
			int temp = findMin(a, i + a[j], mem);
			if(min > temp)
			{
				if(temp != Integer.MAX_VALUE)
				{
					min = temp + 1;
				}
			}
		}

		return min;
	}
}