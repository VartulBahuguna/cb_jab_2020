package practice;

import java.util.*;
public class Count1
 {
    public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int k = s.nextInt();

		int[] a = new int[n];

		for(int i = 0; i < n; ++i)
		{
			a[i] = s.nextInt();
		}

		int startWin = 0;
		int endWin = 0;
		int winSize = 0;
		int kNo = 0;
		int bestL = 0;
		while(endWin < n)
		{
			if(kNo <= k)
			{
				if(a[endWin] == 0)
				{
					kNo++;
				}
				endWin++;
			}
			if(kNo > k)
			{
				if(a[startWin] == 0)
				{
					kNo--;
				}
				startWin++;
			}
			if(endWin-startWin > winSize && kNo <= k)
			{
				winSize = endWin-startWin;
				bestL = startWin;
			}
		}

		for(int i = 0; i < bestL; ++i)
		{
			System.out.print(a[i] + " ");
		}
		for(int i = bestL; i <= winSize+bestL; ++i)
		{
			System.out.print("1 ");
		}
		for(int i = bestL + winSize; i < n; ++i)
		{
			System.out.print(a[i] + " ");
		}
    }
}