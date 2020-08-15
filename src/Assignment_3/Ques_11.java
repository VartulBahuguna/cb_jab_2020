package Assignment_3;

import java.util.Scanner;

public class Ques_11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        System.out.println("GCD = " + GCD(n1, n2));
    }
    public static int GCD(int n1, int n2)
    {
        if(n2 > n1)
        {
            int c = n1;
            n1 = n2;
            n2 = c;

        }
        while( n2 != 0)
        {
            int k = n1 % n2;
            n1 = n2;
            n2 = k;

        }
        return n1;
    }
}
