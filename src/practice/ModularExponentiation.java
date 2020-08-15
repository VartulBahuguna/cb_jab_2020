package practice;

import java.util.*;
public class ModularExponentiation
{
    public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);

		long a = s.nextLong();
		long b = s.nextLong();
		long c = s.nextLong();

		long sum = a;


		System.out.print(modExpo(a,b,c));

    }

	public static long modExpo(long a, long b, long c)
	{
		long res = 1;

		while(b != 0)
		{
			if((b&1) == 1)
			{
				res = (res*a)%c;
			}

			a = (a*a) % c;
			b = (b>>1);
		}

		return res;
	}
}