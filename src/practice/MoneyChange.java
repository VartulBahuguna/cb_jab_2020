package practice;

import java.util.*;
public class MoneyChange
 {
    public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);

		int t = s.nextInt();

		while(t-- != 0)
		{
			int n = s.nextInt();

			int[] a = new int[n];

			for(int i = 0; i < n; ++i)
			{
				a[i] = s.nextInt();
			}

			int coin = s.nextInt();
			int[] mem = new int[coin+1];
			mem[0] = 1;
			for(int i = 0; i < a.length; ++i)
			{
				for(int j = 0; j <=coin; ++j)
				{
					if(j >= a[i])
					{
						mem[j] += mem[j - a[i]];
					}
				}
			}
			System.out.println(mem[coin]);
		}
    }

	public static int findWay(int[] a, int i, int coin, int[] mem)
	{
		//int sum = 0;
		if(coin == 0)
		{
			return 1;
		}
		if(coin < 0)
		{
			return 0;
		}
		if(mem[i] != 0)
		{
			return mem[i];
		}

		for(int j = i; j < a.length; ++j)
		{
			if(a[j] == 0)
			{
				continue;
			}
			mem[j] += findWay(a,j,coin - a[j],mem);

			mem[j] %= 1000000007; 
		}
		

		return mem[coin - 1];
	}
}