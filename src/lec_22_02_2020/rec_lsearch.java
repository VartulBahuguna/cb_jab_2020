package lec_22_02_2020;

import java.util.Scanner;

public class rec_lsearch
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i <ar.length; i++) {
            ar[i] = s.nextInt();
        }
        int item = s.nextInt();

        System.out.println(lsearch_rec(ar,item,n));


    }
    public static int lsearch_rec(int[] ar , int item , int n)
    {
        if (n<0)
            return -1;
        if(ar[n] == item)
            return n;
        return(lsearch_rec(ar , item , n-1));
    }


}
