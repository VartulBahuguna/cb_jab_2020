package com.company;

import java.util.Scanner;

public class butterfly_pattern {
    public static void main(String[] args) {
        int i=1;
        int  row=1;
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        while (i<=2*n-1)
        {
            int col=1;
            int j=1;
            while(j<=2*n-1)
            {
                if(col<=row)
                    System.out.print("*");
                else
                    System.out.print(" ");
                if (j<n)
                    col++;
                else
                    col--;
                j++;
            }
            if(i<n)
                row++;
            else
                row--;
            i++;

            System.out.println();
        }
    }
}
