package Assignment_3;

import java.util.Scanner;

public class Ques_13
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
        System.out.println("x to th pow n = " + power(x,n));


    }
    public static int power(int x, int n)
    {
        int p = 1;
        for (int i = 1; i <= n; i++)
        {
            p = p * x;
        }
        return p;
    }

}
