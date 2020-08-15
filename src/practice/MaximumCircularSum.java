package practice;

import java.util.*;
public class MaximumCircularSum
 {
    public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);

		int t = s.nextInt();

		while(t-- != 0)
		{
			int n = s.nextInt();

			int[] a = new int[n];

			int sum = 0;
			for(int i = 0 ; i < n; ++i)
			{
				a[i] = s.nextInt();
				sum += a[i];
			}
			int j = 0;
			int ssf = a[0];
			int max_no = a[0];
			int st = 0;
			for(int i = 1 ; i < n; ++i)
			{
				ssf += a[i];
				if(ssf < a[i])
				{
					ssf = a[i];
				}
				if(max_no < ssf)
				{
					max_no = ssf;
				}
				//System.out.println(ssf + " " + j + " " + st + " " + max_no);
			}
			ssf = a[0];
			int min_no = a[0];
			for(int i = 1 ; i < n; ++i)
			{
				ssf += a[i];
				if(ssf > a[i])
				{
					ssf = a[i];
				}
				if(min_no > ssf)
				{
					min_no = ssf;
				}
				//System.out.println(ssf + " " + j + " " + st + " " + max_no);
			}
			int tot = max_no >= (sum - min_no) ? max_no : sum-min_no;
		//	System.out.println(sum + " " + min_no + " " + max_no);
			System.out.println(tot);

		}
    }
}