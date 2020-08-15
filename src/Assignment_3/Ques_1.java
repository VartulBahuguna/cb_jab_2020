package Assignment_3;

import java.util.Scanner;



public class Ques_1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long  n = s.nextInt();
        /*long desc = 0 ;
        long x = 1;
        while(n!=0)
        {
            long rem;
            rem = n % 10 ;
            n = n / 10;
            desc = desc + rem * x;
            x = x * 2 ;
        }*/
        System.out.println(b_d(n));

    }
    public static long b_d(long n )
    {
        long desc = 0 ;
        long x = 1;
        while(n!=0)
        {
            long rem;
            rem = n % 10 ;
            n = n / 10;
            desc = desc + rem * x;
            x = x * 2 ;
        }
        return desc;

    }

}
