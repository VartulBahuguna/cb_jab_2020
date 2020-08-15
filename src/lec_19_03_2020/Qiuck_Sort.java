package lec_19_03_2020;

import java.util.Arrays;

public class Qiuck_Sort
{
    public static void main(String[] args) {
        int[] ar = {20,10,50,30,60,90,40,70};
        int[] a = {45,95,15,55,25,75,5,65};
        quick(ar, 0, ar.length);
        quickSort(a,0,ar.length - 1);

        System.out.println(Arrays.toString(ar));
        System.out.println(Arrays.toString(a));
    }

    public static void quick(int[] ar, int start, int end)
    {
        if(end <= start)
        {
            return ;
        }

        int pivot = end - 1;

        pivot = pivotupdte(ar,start, pivot);

        quick(ar, start, pivot);
        quick(ar, pivot + 1, end);
    }


    public static int pivotupdte(int[] ar, int start, int pivot)
    {
        int j = start;
        for (int i = start; i < pivot ; i++)
        {
            if(ar[i] < ar[pivot])
            {
                swap_ele(ar, i, j);
                j++;
            }
        }
        swap_ele(ar, j, pivot);

        return j;
    }


    public static void swap_ele(int[] ar, int i , int j)
    {
        int k = ar[i];
        ar[i] = ar[j];
        ar[j] = k;
    }

    public  static void quickSort(int[] a, int start, int end)
    {
        if(start >= end)
        {
            return;
        }
        int left = start;
        int right = end;

        int pivot = (start+end)/2;

        while(left <= right)
        {
            while(a[left] < a[pivot])
            {
                left++;
            }

            while(a[right] > a[pivot])
            {
                right--;
            }

            if(left <= right)
            {
                swap_ele(a,left,right);
                left++;
                right--;
            }
        }

        quickSort(a,start, right);
        quickSort(a,left,end);
    }



}
