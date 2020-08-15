package lec_22_02_2020;

import java.util.Arrays;

public class rec_sel_sort
{
    public static void main(String[] args)
    {
        int[] ar = {5,1,9,10,7};
        sel_sort(ar, 0, 0, 0);
        System.out.println(Arrays.toString(ar));
    }
    public static void sel_sort(int[] ar, int row, int col, int max)
    {
        if(row == ar.length)
        {
            return;
        }
        if(col == ar.length - row )
        {
            rec_revar.swap(ar , max , ar.length - 1 - row);
            sel_sort(ar, row + 1 , 0, 0);
        }
        else
        {
            if(ar[max] < ar[col])
            {
                max = col ;
            }
            sel_sort(ar , row , col + 1 , max);
        }

    }



}
