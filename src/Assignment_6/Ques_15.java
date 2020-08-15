package Assignment_6;

import java.util.Arrays;

import lec_22_02_2020.rec_bubble_sort;

public class Ques_15
{
    public static void main(String[] args) {
        int[] ar = {10, 9, 12, 45, 32};
        sel_sort(ar, 0, 1, 0);
        System.out.println(Arrays.toString(ar));
    }
    public static void sel_sort(int[] ar, int row, int col, int min)
    {
        if(row == ar.length - 1)
        {
            return;
        }
        else if (col == ar.length)
        {
            rec_bubble_sort.swap(ar, row, min);
            sel_sort(ar, row + 1 , row +  2, row + 1);
        }
        else
        {
            if(ar[min] > ar[col])
            {
                min = col;

            }
            sel_sort(ar, row, col + 1, min);

        }

    }

}
