package practice;

import java.util.*;

public class PrimeVisits
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

		boolean[] primes = new boolean[1000000];

	    int[] primeNo = new int[500000];

		
		
		Arrays.fill(primes, true);

		primes[0] = false;
		primes[1] = false;

		for (int table = 2; table * table <1000000; table++) {
			if (primes[table]) {
				for (int mult = 2; table * mult <1000000; mult++) {
					primes[table * mult] = false;
				}
			}
		}
				
       
        while(n-- != 0)
        {
            long a = s.nextLong();
            long b = s.nextLong();
            long cont = 0;

            for(long i = a; i <= b; ++i)
            {
				if(primes[(int)i])
				{
					cont++;
				}	
            }
            System.out.println(cont);
        }
    }
}
