package practice;

import java.util.*;
public class MaximumSumSubarray
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
			int st = 0;
			int end = 0;
			int start = 0;
		
			int meh = a[0];
			int mesf = Integer.MIN_VALUE;
			for(int i = 1; i < n; ++i)
			{
				meh = meh + a[i];
				if(meh < a[i])
				{
					meh = a[i];
					st = i;
				}
				if(mesf < meh)
				{
					mesf = meh;
					end = i;
				}
				 
			}

			System.out.println(mesf);
			//System.out.println(maxSubArraySum(a,n));
		}
    }

	static int maxSubArraySum(int a[], int size) 
    { 
        int max_so_far = Integer.MIN_VALUE, 
        max_ending_here = 0,start = 0, 
        end = 0, s = 0; 

        for (int i = 0; i < size; i++)  
        { 
            max_ending_here += a[i]; 

            if (max_so_far < max_ending_here)  
            { 
                max_so_far = max_ending_here; 
                start = s; 
                end = i; 
            } 

            if (max_ending_here < 0)  
            { 
                max_ending_here = 0; 
                s = i + 1; 
            } 
        } 
		System.out.println(s + " " + end);
        return max_so_far;
    } 
}