package practice;

import java.util.*;
public class StrongestFighter {
    public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int[] a = new int[n];

		for(int i = 0; i < n; ++i)
		{
			a[i] = s.nextInt();
		}
		
		int k = s.nextInt();

		for(int i = 0; i + k <= a.length; ++i)
		{
			System.out.print(maxStrength(a, i, i + k) + " ");
		}
    }

	public static int maxStrength(int[] a, int i, int k)
	{
		int max = a[i];

		for(int j = i + 1; j < k; ++j)
		{
			if(a[j] > max)
			{
				max = a[j];
			}
		}

		return max;
	}
}