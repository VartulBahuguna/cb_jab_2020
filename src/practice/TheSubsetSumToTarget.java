package practice;

import java.util.*;
public class TheSubsetSumToTarget
 {
    public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int target = s.nextInt();

		int[] a = new int[n];

		for(int i = 0; i < n; ++i)
		{
			a[i] = s.nextInt();
		}
		// int j = 0;
		// int sum = 0;


		boolean[][] mem =new boolean[n+1][target + 1];
		

		for(int i = 0; i <= n; ++i)
		{
			mem[i][0] = true;
		}

		for(int i = 1; i <= n; ++i)
		{
			for(int j = 1; j <= target; ++j)
			{
				if(a[i - 1] > j)
				{
					mem[i][j] = mem[i - 1][j];
				}
				else
				{
					mem[i][j] = (mem[i-1][j-a[i-1]] || mem[i-1][j]);
				}
			}
		}

		if(mem[n][target])
		{
			System.out.print("Yes");
		}
		else
		{
			System.out.print("No");
		}

	//	System.out.print();

		// boolean found = false;
		// if(target != 0)
		// {
		// 	for(int i = 0; i < n; ++i)
		// 	{
		// 		sum += a[i];
		// 		if(sum == target)
		// 		{
		// 			found = true;
		// 		}
		// 		if(sum > target)
		// 		{
		// 			sum = a[i];
		// 			j = i;
		// 		}
		// 	}
		// }	

		
    }
}