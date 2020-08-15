package lec_22_02_2020;

import java.util.Scanner;

public class rec_pattern
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        pat(5);
        pattern(5,0);
    }
    public static void pat(int n)
    {
        if (n==0)
        {
            return;
        }
        else {
            pattern1(n);
            System.out.println();
            pat(n-1);
        }
    }

    public static void pattern1(int n)
    {
        if(n >= 1)
        {
            System.out.print("*");
            pattern1(n-1);
        }
    }


    public static void pattern(int row, int col)
    {
        if(row == 0 )
            return;
        else if(col == row)
        {
            System.out.println();
            pattern(row - 1, 0) ;
            //return;
        }
        else
        {
            System.out.print("*");
            pattern(row, col + 1);
        }
    }



}
