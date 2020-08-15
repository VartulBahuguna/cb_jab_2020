package lec_22_02_2020;

import java.util.Scanner;

public class rec_fact
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(rec_fact(n));
    }
    public static int rec_fact(int n)
    {
        if(n == 0)
            return 1;
        return n * rec_fact(n-1);
    }

}
