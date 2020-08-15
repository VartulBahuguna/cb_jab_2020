package practice;

import java.util.Scanner;

public class DivisibleSubarrays{
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
		int test_case = s.nextInt();

		while(test_case-- != 0)
		{
			int n = s.nextInt();
			int[] ar = new int[n];

			for(int i = 0; i < n; ++i)	
			{
				ar[i] = s.nextInt();
			}	

			int cnt = 0;

			for(int i = 0; i < n; ++i)
			{
				int sum = 0;
				for(int j = i; j < n; ++j)
				{
					sum = sum + ar[j];
					if(sum % n == 0)
					{
						cnt++;
					}
				}
			}

			System.out.println(cnt);
		}
    }
}
