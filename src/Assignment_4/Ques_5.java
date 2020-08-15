package Assignment_4;

import lec_8_02_2020.ar_rev;

import java.util.Arrays;
import java.util.Scanner;

public class Ques_5
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int ar[] = new int[n];

        for (int i = 0; i < n; i++) {
            ar[i] = s.nextInt();
        }
        ar_mir_inv(ar);
    }
    public static void ar_mir_inv(int[] ar )
    {
        int a1[] = new int[ar.length];
        for (int i = ar.length - 1, x=1; i >= 0 ; --i,++x)
        {
            a1[ar[i]-1] = x;
        }
        ar_rev.reverse(a1);

        System.out.println(Arrays.toString(a1));


    }
}
