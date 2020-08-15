package practice;

import java.util.Scanner;

public class SortingInLinearTime
{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int[] a = new int[n];

        for(int i = 0; i < n; ++i)
        {
            a[i] = s.nextInt();
        }

        int low = 0;
        int mid = 0;
        int hi = n - 1;

        while(mid <= hi)
        {
            if(a[mid] == 0)
            {
                swap(a, mid, low);
                low++;
                mid++;
            }
            else if(a[mid] == 1)
            {
                mid++;
            }
            else
            {
                swap(a,mid,hi);
                hi--;
            }
        }

        for(int i = 0; i < n; ++i)
        {
            System.out.println(a[i]);
        }

    }

    public static void swap(int[] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
