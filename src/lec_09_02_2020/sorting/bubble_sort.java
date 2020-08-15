package lec_09_02_2020.sorting;

import java.util.Arrays;

public class bubble_sort
{
    public static void main(String[] args) {
        int[] ar = {5,4,3,2,1};
        bsort(ar);
        System.out.println(Arrays.toString(ar));
        System.out.println(ar);
    }
    public static void bsort(int[] ar)
    {
        for (int i = 0; i < ar.length-1; i++)
        {
            for (int j = 0; j < ar.length-i-1; j++)
            {
                if (ar[j] > ar[j+1])
                {
                    swap(ar,j,j+1);
                }
            }

        }
    }

    public static void swap(int[] ar, int i , int j) {
        int t = ar[i];
        ar[i] = ar[j];
        ar[j] = t;
    }

}
