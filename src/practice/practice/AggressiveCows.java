package practice;
import java.util.*;
public class AggressiveCows
{
    public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);

		int N = s.nextInt();

		int C = s.nextInt();

		int[] stalls = new int[N];

		for(int i = 0; i < N; ++i)
		{
			stalls[i] = s.nextInt();
		}

		Arrays.sort(stalls);

		System.out.print(minDist(stalls, C , N));


    }

	public static int minDist(int[] stalls, int C, int N)
	{
		int s = stalls[0];
		int e = stalls[N - 1];

		

		while(s + 1< e)
		{
			int mid = (s + e)/ 2;

			if(isValid(stalls, N, C, mid))
			{
				s = mid;
			}
			else
			{
				e = mid;
			}
			
		}

		return s;
	}

	public static boolean isValid(int[] stalls, int N, int C, int mid)
	{
		int j = 0;
		for(int i = 1; i < N; ++i)
		{
			if(stalls[i] - stalls[j] >= mid)
			{
				C --;
				if(C == 1)
				{
					return true;
				}
				j = i;
			}
		
		}

		return false;
	
	}
}