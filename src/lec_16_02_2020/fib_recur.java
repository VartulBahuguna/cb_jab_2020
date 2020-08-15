package lec_16_02_2020;

import java.util.Scanner;

public class fib_recur {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
         int n = s.nextInt();
         System.out.println(fibo(n ));
         System.out.println(fibo(4));
    }
    public static int fibo(int n )
    {
        if(n<2)
            return n;

        return(fibo(n - 1) + fibo(n -2));
    }

}
