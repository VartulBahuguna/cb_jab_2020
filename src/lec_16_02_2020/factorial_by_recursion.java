package lec_16_02_2020;

import java.util.Scanner;

public class factorial_by_recursion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =  s.nextInt();

       System.out.println(fact(n));


    }
    public static int fact(int n)
    {
        if (n==0)
            return 1;
        return n*fact(n-1);

    }
}
