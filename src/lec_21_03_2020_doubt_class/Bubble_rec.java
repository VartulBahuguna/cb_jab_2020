package lec_21_03_2020_doubt_class;


import java.util.Arrays;

public class Bubble_rec
{
    public static void main(String[] args)
    {
        int[] ar = {3,2,4,1,2};
        recbub(ar, ar.length - 1, 0);
        System.out.println(Arrays.toString(ar));
    }


    public static void recbub(int[] ar, int row, int col)
    {
        if (row == 0) {
            return;
        }

        if (col == row) {
            recbub(ar, row - 1, 0);
            return;
        }

        if (ar[col] > ar[col + 1]) {
            swap(ar, col, col + 1);
        }
        recbub(ar, row, col + 1);
    }

    public static void swap(int[] ar, int i , int j)
    {
        int k = ar[i];
        ar[i] = ar[j];
        ar[j] = k;
    }

}
