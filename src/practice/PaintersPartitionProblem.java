package practice;

import java.util.Arrays;
import java.util.Scanner;

public class PaintersPartitionProblem
{
    public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);

		int painters = s.nextInt();

		int boards = s.nextInt();

		int[] boardLen = new int[boards];

		int low = 0;
		int high = 0;
		for(int i = 0; i < boards; ++i)
		{
			boardLen[i] = s.nextInt();
			if(boardLen[i] > low)
			{
				low = boardLen[i];
			}
			high += boardLen[i];
		}

		int mid = 0;

		while(low <= high)
		{
			mid = (low + high) / 2;

			if(numPainter(boardLen, painters, mid) > painters)
			{
				low = mid + 1;
			}
			else
			{
				high = mid - 1;
			}
		}


		System.out.print(mid);
	}

	public static int numPainter(int[] boardLen, int painters, int mid)
	{
		int paintersReq = 1;

		int paintSum = 0;

		for(int i = 0; i < boardLen.length; ++i)
		{
			paintSum += boardLen[i];
			if(paintSum > mid)
			{
				paintersReq++;
				paintSum = boardLen[i];
			}
		}

		return paintersReq;
	}
}
