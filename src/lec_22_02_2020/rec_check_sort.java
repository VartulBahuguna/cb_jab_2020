package lec_22_02_2020;

import java.util.Scanner;

public class rec_check_sort
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < ar.length ; i++) {
            ar[i] = s.nextInt();
        }
        System.out.println(check_sort(ar,n-1));

    }
    public static boolean check_sort(int[] ar, int n)
    {
        if(n==0)
        {
            return true;
        }
        if(ar[n] >= ar[n-1])
        {
            return check_sort(ar,n-1);
        }
        return false;
    }
}
