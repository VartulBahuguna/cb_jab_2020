package practice;

import java.util.*;
public class GaneshaPattern{
    public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		for(int i = 1; i <= n; ++i)
		{
			for(int j = 1; j <= n; ++j)
			{
				if((i == 1 && j > n/2) || (i == n && j <= (n/2 + 1)))
				{
					System.out.print("*");
				}
				else if(i == n/2 + 1)
				{
					System.out.print("*");
				}
				else if((i <= n/2 && (j == 1 || j == (n/2 + 1))) || (i > n/2 +1 && (j == (n/2 + 1) || j == n)))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
    }
}