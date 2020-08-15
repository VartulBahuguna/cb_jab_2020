package practice;

import java.util.*;
public class PatternInvertedHourGlass
 {
    public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();

		int k = 1;

		for(int i = 1; i <= 2*n + 1; ++i)
		{
			int t = 1;
			for(int j = 1; j <= n*2 + 1; ++j)
			{
				if(k < t)
				{
					System.out.print("  ");
				}
				else
				{
					System.out.print(n+1 - t + " ");
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