package practice;

import java.util.*;
public class CountSubsequences
 {
    public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);

		int t =s.nextInt();

		while(t-- != 0)
		{
			String str = s.next();
			HashSet<String> set = new HashSet<>();
			System.out.println(count("", str,set)%1000000007);
		}

    }

	public static int count(String proc, String unproc, HashSet<String> set)
	{
		int cnt = 0;
		if(unproc.isEmpty())
		{
			if(!set.contains(proc))
			{
				set.add(proc);
				return 1;
			}
			return 0;
		}

		cnt += count(proc + unproc.charAt(0), unproc.substring(1), set);
		cnt += count(proc, unproc.substring(1), set);

		return cnt;
	}
}