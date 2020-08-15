package practice;

import java.util.*;
public class ExchangingCoins {
    public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		HashMap<Integer, Long> map = new HashMap<>();

		System.out.print(changeGold(n, map));


    }

	public static long changeGold(int n, HashMap<Integer, Long> map)
	{
		if(n == 0 || n == 1)
		{
			return n;
		}
		if(map.containsKey(n))
		{
			return map.get(n);
		}

		long ret = Math.max(n,changeGold(n/2, map) + changeGold(n/3, map) + changeGold(n/4, map));

		map.put(n,ret);

		return ret;
	}
}