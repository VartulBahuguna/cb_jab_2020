package lec_22_02_2020;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class rec_bubble_sort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
   //     int n = s.nextInt();

        int[] ar = {5,4,3,2,1};
//        for (int i = 0; i < ar.length ; i++) {
//            ar[i] = s.nextInt();
//        }
        bubble_sort1(ar,ar.length - 1,0);
        System.out.println(Arrays.toString(ar));

    }
    public static void bubble_sort1(int[] ar, int row , int col)
    {
        if(row < 1 )
            return;
        else if(col == ar.length-1)
        {
           // System.out.println();
            bubble_sort1(ar,row - 1, 0); ;
            //return;
        }
        else
        {
            if(ar[col]>ar[col+1])
                swap(ar,col,col+1);
            bubble_sort1(ar,row, col + 1);
        }
    }
    public static void bubble_sort(int[] ar, int row , int col)
    {
        if(row == 1 )
            return;
        else if(col == row)
        {

            bubble_sort(ar,row - 1, 0);
            //return;
        }
        else
        {
            if(ar[col]>ar[col+1])
                swap(ar,col,col+1);
            bubble_sort(ar,row, col + 1);
        }
    }
    public static void swap(int[] ar, int i , int j)
    {
        int t = ar[i];
        ar[i] = ar[j];
        ar[j] = t;
    }

}
