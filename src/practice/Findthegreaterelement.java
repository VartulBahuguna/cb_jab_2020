package practice;

import java.util.*;
public class Findthegreaterelement{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		int[] a = new int[n];

		for(int i = 0; i < n; ++i)
		{
			a[i] = s.nextInt();
		}

		
		int num = a[0];
		for(int i = 0; i < n; ++i)
		{
			if(a[i] < num)
			{
				num = a[i];
			}
		}
	//	int i = 0 ;
	//	int minNumIndex = 1;
		boolean moreMax = true;
		while(moreMax)
		{
			boolean gnumFound = false;
			for(int i = 0; i < n; ++i)
			{
				if(a[i] > num)
				{
					gnumFound = true;
				//	minNumIndex = i;
					num = a[i];
					break;
				}
			}
			if(gnumFound)
			{
				System.out.print(num + " ");
			}
			else
			{
				System.out.print("-1");
				moreMax = false;
			}
		}
    }
}
