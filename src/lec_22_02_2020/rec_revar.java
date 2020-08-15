package lec_22_02_2020;

import com.company.swap;

import java.util.Scanner;

public class rec_revar
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = s.nextInt();

        }
        revar(ar,0,n-1);

    }

    public static void revar(int[] ar, int start, int end)
    {
        if(start>end)
            return;

        swap(ar,start,end);
        revar(ar, start+1, end -1);


    }
    public static void swap(int[] ar, int i , int j)
    {
        int t = ar[i];
        ar[i] = ar[j];
        ar[j] = t;
    }

}
