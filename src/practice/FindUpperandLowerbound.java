import java.util.*;
public class FindUpperandLowerbound{
    public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		int[] a = new int[n];
		for(int i = 0; i < n; ++i)
		{
			a[i] = s.nextInt();
		}

		int Q = s.nextInt();
		
		while(Q-- != 0)
		{
			int num = s.nextInt();

			int fo = -1;
			int lo = -1;

			for(int i = 0; i < n; ++i)
			{
				if(a[i] == num)
				{
					fo = i;
					break;
				}
			}

			if(fo == -1)
			{
				System.out.println(fo + " " + lo);
			}
			else
			{
				for(int i = n - 1; i >= 0; --i)
				{
					if(a[i] == num)
					{
						lo = i;
						break;
					}
				}
				System.out.println(fo + " " + lo);
			}
		}
    }
}