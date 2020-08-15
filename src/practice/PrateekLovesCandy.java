package practice;

import java.util.*;
public class PrateekLovesCandy {
    public static void main(String args[])
    {
      Scanner s = new Scanner(System.in);

        int n = s.nextInt();

       boolean[] primes = new boolean[1000000];

	   int[] primeNo = new int[500000];

		
	//	boolean[] primes = new boolean[2000000000];
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

		
		long cnt = 0;
		for (int i = 2; i < primes.length; i++) {

			if (primes[i]) {
				
				primeNo[(int)cnt++] = i;
			}
		}

		while(n-- != 0)
		{
			int q = s.nextInt();
			System.out.println(primeNo[q - 1]);

		}
        
        
    

    }
}