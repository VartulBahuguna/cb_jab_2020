package practice;

import java.util.*;
public class PatternHourGlass
 {
    public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		int k = 1;

		for(int i = 1; i <= (2*n + 1); ++i)
		{
			int t = 1;
			for(int j = 1; j <= (2*n + 1) - k + 1; j++)
			{
				if(j < k)
				{
					System.out.print("  ");
				}
				else
				{
					System.out.print(n - t + 1 + " ");
				}
				if(j <= n)
				{
					t++;
				}
				else
				{
					t--;
				}
			}
			if(i <= n)
			{
				k++;
			}
			else
			{
				k--;
			}
			System.out.println();
		}
    }
}