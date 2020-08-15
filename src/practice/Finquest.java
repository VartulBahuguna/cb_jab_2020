import java.util.*;
public class Finquest{
    public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);

		int t = s.nextInt();

		while(t-- != 0)
		{
			int n = s.nextInt();

			int[] a = new int[n];
			
			int ans = 0;

			for(int i = 0; i < n; ++i)
			{
				a[i] = s.nextInt();
			}
			int max = 0;
			int start = 0;

			while(max < n)
			{
				for(int i = start; i < n; ++i)
				{
					if(a[i] > a[max])
					{
						max = i;
					}
				}

				for(int i = start; i<=max ; ++i)
				{
					ans += a[max]-a[i];
				}
				start = max+1;
				max++;
			}

			System.out.println(ans);
		}
    }
}