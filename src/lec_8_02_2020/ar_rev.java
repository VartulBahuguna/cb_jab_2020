package lec_8_02_2020;

import java.util.Arrays;
import java.util.Scanner;

public class ar_rev {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] ar = {1,2,3,4,5};
        reverse(ar);
        System.out.println(Arrays.toString(ar));

    }
    public static void reverse(int[] ar)
    {
        int start = 0 , end = ar.length - 1;
        while (start < end)
        {
            swap(ar,start,end);
            start++;
            end--;
        }
    }

    public static void swap(int[] ar, int i , int j) {
        int t = ar[i];
        ar[i] = ar[j];
        ar[j] = t;
    }


}
