package practice;

import java.util.*;
public class ExistORNot
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

			Arrays.sort(a);

			int q = s.nextInt();
		//	System.out.println(Arrays.toString(a));
			while(q-- != 0)
			{
				int ele = s.nextInt();;

				int lo = 0;
				int hi = a.length - 1;
				boolean found = false;

				while(lo <= hi)
				{
					int mid = (lo + hi) / 2;
					if(a[mid] == ele)
					{
						found = true;
						break;
					}
					else if(a[mid] < ele)
					{
						lo = mid + 1;
					}
					else
					{
						hi = mid - 1;
					}
				}

				if(found)
				{
					System.out.println("Yes");
				}
				else
				{
					System.out.println("No");
				}
			}
		}

    }
}