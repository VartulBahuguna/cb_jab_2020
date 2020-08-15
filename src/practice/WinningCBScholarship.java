package practice;

import java.util.*;
public class WinningCBScholarship
 {
    public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int m = s.nextInt();
		int x = s.nextInt();
		int y = s.nextInt();

		int stu = m / x;
		int notpassed = n - stu;
		int leftPass = m % x ;

		if(notpassed <= 0)
		{
			System.out.print(n);
		}
		else
		{
			for(int i = 1; i <= notpassed; ++i)
			{
				if(leftPass >= x)
				{
					leftPass -= x;
					stu++;
				}
				else
				{
					leftPass += y;
				}
			}
			System.out.print(stu);
		}
    }
}