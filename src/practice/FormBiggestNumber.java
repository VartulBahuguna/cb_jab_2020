package practice;

import java.util.*;
public class FormBiggestNumber
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
			System.out.println(bigNO(a,n));
		}
    }

	public static StringBuilder bigNO(int[] a,int n)
	{
		for(int i = 0; i < n-1; ++i)
		{
			for(int j = i+1; j < n; ++j)
			{
				String str1 = a[i] + "" + a[j];
				String str2 = a[j] + "" + a[i];
				if(Integer.parseInt(str1.substring(0,str1.length())) < 
											Integer.parseInt(str2.substring(0,str2.length())))
					{
						swap(a,i,j);
					}
			}
		}

		StringBuilder st = new StringBuilder();
		for(int i = 0; i < n; ++i)
		{
			st.append(a[i]);
		}

		return st;
	}

	public static void swap(int[] a, int i, int j)
	{
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}