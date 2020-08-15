package practice;

import java.util.Scanner;

public class Rhombus
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for(int i = 1; i <= n; ++i)
        {
            for(int j = 1; j <= 2*n - i; ++j)
            {
                if(j <= n - i)
                {
                    System.out.print(" ");
                }
                else
                {
                    if(i == 1 || i == n)
                    {
                        System.out.print("*");
                    }
                    else if(j == n - i + 1 || j == 2*n - i)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
