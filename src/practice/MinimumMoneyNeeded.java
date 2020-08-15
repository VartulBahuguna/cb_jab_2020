package practice;

import java.util.*;
public class MinimumMoneyNeeded
 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int maxWt = s.nextInt();
		int[][] mem = new int[maxWt+1][maxWt + 1];

		int[] a = new int[maxWt];
		for(int i = 0; i < maxWt; ++i)
		{
			a[i] = s.nextInt();
		}

		System.out.print(findMin(a, maxWt, 0,mem));
    }

	public static int findMin(int[] a, int maxWt, int i,int[][] mem)
	{
		int sum = 0;

		if(maxWt == 0)
		{
			return 0;
		}
		else if(i == a.length)
		{
			return 1000000;
		}
		if(mem[i][maxWt] != 0)
		{
			return mem[i][maxWt];
		}

		if(maxWt  >=  i+1 && a[i] != -1)
		{
			sum += Math.min(findMin(a, maxWt - i - 1, i , mem) + a[i],
											findMin(a, maxWt, i + 1, mem));
		}
		else
		{
			sum += findMin(a, maxWt, i + 1, mem);			
		}
		return mem[i][maxWt] = sum;
	}
	
}
