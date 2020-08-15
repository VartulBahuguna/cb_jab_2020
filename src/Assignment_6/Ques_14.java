package Assignment_6;

import lec_22_02_2020.rec_bubble_sort;

import java.util.Arrays;

public class Ques_14
{
    public static void main(String[] args) {
        int[] ar = {5, 3, 2, 3, 1};
        bubble_sort(ar, ar.length - 1, 0);
        System.out.println(Arrays.toString(ar));

    }

    public static void bubble_sort(int[] ar, int row, int col)
    {
        if(row == 0)
        {
            return ;
        }
        if(col == row)
        {
            bubble_sort(ar, row - 1, 0);
        }
        else
        {
            if (ar[col] > ar[col + 1]) {
                rec_bubble_sort.swap(ar, col, col + 1);

            }
            bubble_sort(ar, row, col + 1);
        }
    }

}
