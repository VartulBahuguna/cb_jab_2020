package practice;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray
{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ar = new int[n];
        for(int i = 0; i<n; ++i) {
            ar[i] = s.nextInt();
        }
        int[] a = new int[n];
        for(int i = 0; i<n; ++i)
        {
            a[i] = ar[i];
        }
        quick(a,0,ar.length);
        int c = 0;
        System.out.println(Arrays.toString(ar));
        System.out.println(Arrays.toString(a));
        for(int i = 0; i<n; ++i)
        {
            if(ar[i] != a[i])
            {
                c = 1;
                break;
            }
        }
        if(c == 1)
        {
            System.out.print("false");
        }
        else
        {
            System.out.print("true");
        }
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
            if(ar[start] < ar[pivot])
            {
                swap_ele(ar, start, j);
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
}
