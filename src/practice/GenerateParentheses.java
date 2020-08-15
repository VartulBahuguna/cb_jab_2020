package practice;

import java.util.*;
public class GenerateParentheses {
    public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		balancedP(n, "", 0 ,0);

    }

	public static void balancedP(int n, String proc, int open, int close)
	{
		if(proc.length() >= 2 * n)
		{
			System.out.println(proc);
		}

		if(close < open)
		{
			balancedP(n, proc + ")", open, close + 1);
		//	o = true;
		}
		if(open < n)
		{
			balancedP(n, proc + "(", open + 1, close);
		//	o = false;
		}
	
	}
}