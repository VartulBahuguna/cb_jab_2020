package springseg;

import java.util.Scanner;

public class rec_prime
{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        if(isPrime(n, 2))
        {
            System.out.println("Number is prime");
        }
        else
        {
            System.out.println("Number is not prime");
        }
    }


    public static boolean isPrime(int n, int i)
    {
        if(i > Math.sqrt(n))
        {
            return true;          // base case
        }

        if(n % i == 0)
        {
            return false;
        }

        return  isPrime(n,i + 1);
    }

}
