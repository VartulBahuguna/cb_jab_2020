package practice;

import java.util.Arrays;
import java.util.Scanner;

public class DeepakandPrimes
{
    public static void main(String args[])
    {
      Scanner s = new Scanner(System.in);

        int n = s.nextInt();

       boolean[] primes = new boolean[1000000];

	   int[] primeNo = new int[500000];

		long cnt = 0;
		while(true)
		{
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

		

			for (int i = 2; i < primes.length; i++) {

				if (primes[i]) {
					
					primeNo[(int)cnt++] = i;
				}
			}
			break;
		}	
        System.out.println(primeNo[n - 1]);
        
    

    }
}
