package lec_09_02_2020.sorting;

import java.util.Scanner;

public class D2_Array
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int ar[][] = new int[3][3];

        int ar1[][]={{1,2,3},{4,5,6},{7,8,9}};
//        for (int i = 0; i <ar.length ; i++)
//        {
//            for (int j = 0; j < ar[i].length; j++)
//            {
//                ar[i][j] = s.nextInt();
//            }
//
//        }
//        for (int i = 0; i <ar1.length ; i++)
//        {
//            for (int j = 0; j < ar1[i].length; j++)
//            {
//                ar1[i][j] = s.nextInt();
//            }
//         ar[0] = new int [2]
//         ar[1] = new int [1]
//        }
       // int k = ar.length*ar.length;
        int j = 0;
        for (int i = 0; i <ar1.length ; i++)
        {
            if(j==0)
            {
                for (j = 0; j < ar1[i].length; j++)
                {
                    System.out.println(ar1[i][j]);
                }

            }
            else
            {
                for (j = ar1[i].length-1; j >= 0; j--)
                {
                    System.out.println(ar1[i][j]);
                }
            }
        }
    }
}
