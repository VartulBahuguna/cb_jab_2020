package practice;

import java.util.Scanner;

public class Printreverse
{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long rev = 0;
        while(n != 0)
        {
            int temp = (int)(n % 10);
            rev = 10*rev + temp;
            n = n/10;
        }
        System.out.print(rev);
    }
}
