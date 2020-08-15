package lec_15_02_2020;

import java.util.Scanner;

public class Spiral_matrix_print
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int ar[][] = new int[3][3];
        for (int i = 0; i <ar.length ; i++)
        {
            for (int j = 0; j < ar[i].length; j++)
            {
                ar[i][j] = s.nextInt();
            }
        }
        int top = 0 , right = ar[0].length -1, left = 0 , bottom = ar.length-1;

        while(left <= right && bottom >= top)
        {
            for (int i = left; i <= right; i++)
            {
                System.out.println(ar[top][i]);

            }
            top++;

            for (int j = top; j <= bottom; j++)
            {
                System.out.println(ar[j][right]);

            }
            right--;
            for (int k = right; k >= left; k--)
            {
                System.out.println(ar[bottom][k]);

            }
            bottom--;
            for (int l = bottom; l >= top; l--)
            {
                System.out.println(ar[l][left]);

            }
            left++;
        }
    }
}
