package practice;

import java.util.*;
public class HighestfrequencyHashing{
    public static void main (String args[]) 
	{
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		Map<Integer, Integer> fq = new HashMap<>();

		for(int i = 0; i < n; ++i)
		{
			int num = s.nextInt();
			if(fq.containsKey(num))
			{
				fq.replace(num, fq.get(num) + 1);
			}
			else
			{
				fq.put(num, 1);
			}
		}
		int maxVal = 0;
		int maxKey = 0;
		for(Map.Entry<Integer, Integer> key : fq.entrySet())
		{
			if(maxVal < fq.get(key.getKey()))
			{
				maxKey = key.getKey();
				maxVal = key.getValue();
			}
		}
		System.out.print(maxKey);

    }
}