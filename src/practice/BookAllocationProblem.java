package practice;

import java.util.*;
public class BookAllocationProblem
 {
    public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);

		int t = s.nextInt();

		while(t-- != 0)
		{
			int books = s.nextInt();
			int stu = s.nextInt();

			int[] a = new int[books];
			int hi = 0;
			int lo = 0;
			for(int i = 0; i < books; ++i)
			{
				a[i] = s.nextInt();
				if(a[i] > lo)
				{
					lo = a[i];
				}
				hi += a[i];
			}
			int mid = 0;
			while(lo <= hi)
			{
				mid = (lo + hi)/ 2;

				if(stu < stuReq(a, mid))
				{
					lo = mid + 1 ;
				}
				else
				{
					hi = mid - 1;
				}
			}
			System.out.println(lo);
		}
    }

	public static int stuReq(int[] a, int mid)
	{
		int rq = 1;
		int pg = 0;
		for(int i = 0; i < a.length; ++i)
		{
			pg += a[i];
			if(pg > mid)
			{
				rq++;
				pg = a[i];
			}
		}

		return rq;
	}
}