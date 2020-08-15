package practice;

import java.util.*;
public class Deepakandhisjourney
 {
    public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);

		int t = s.nextInt();

		while(t-- != 0)
		{
			int n = s.nextInt();

			int[] C = new int[n];
			int[] L = new int[n];

			for(int i = 0; i < n; ++i)
			{
				C[i] = s.nextInt();
			}
			for(int i = 0; i < n; ++i)
			{
				L[i] = s.nextInt();
			}
			int petrol = L[0];
			int cost = 0;
			for(int i = 0; i < n; ++i)
			{
				//int temp = a[i+1];
				if(petrol < L[i])
				{
					int xtrafule = L[i] - petrol;

					cost += C[i]*(xtrafule);
					petrol += xtrafule;

				}
				if(i < n-1 && petrol < L[i+1])
				{
					int xtrafule = L[i+1] - petrol;

					cost += C[i]*(xtrafule);
					petrol += xtrafule;
				}
				if( i < n-1)
				{
					petrol -= L[i+1];
				}
			}

			System.out.println(cost);
		}
    }
}