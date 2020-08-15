package practice;

import java.util.Scanner;

public class RecursionLexicographicalOrder
{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        printLex(0, n);

    }

    public static void printLex(int num, int n)
    {
        if(num > n)
        {
            return;
        }


        System.out.print(num + " ");

        int i = 0;

        if(num == 0)
        {
            i = 1;
        }

        for(; i <= 9; ++i)
        {
            printLex(num * 10 + i, n);
        }
    }
}

