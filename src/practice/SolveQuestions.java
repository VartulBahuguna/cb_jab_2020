package practice;

import java.util.*;
public class SolveQuestions {
    public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);

		int t = s.nextInt();

		while(t-- != 0)
		{
			int n = s.nextInt();
			int m = s.nextInt();

			int[] a = new int[n];
			int[] b = new int[m];
			int maxa = 0;
			int maxb = 0;

			for(int i = 0; i < n; ++i)
			{
				a[i] = s.nextInt();
				if(a[i] > maxa)
				{
					maxa = a[i];
				}
			}
			for(int i = 0; i < m; ++i)
			{
				b[i] = s.nextInt();
				if(b[i] > maxb)
				{
					maxb = b[i];
				}
			}

			if(maxa <= maxb)
			{
				System.out.println(maxa + " Deepak");
			}
			else
			{
				System.out.println(maxb + " Gautam");
			}
		}
    }
}