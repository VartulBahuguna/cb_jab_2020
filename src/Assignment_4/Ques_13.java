package Assignment_4;

import java.util.Scanner;

public class Ques_13 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner((System.in));
        int  n = s.nextInt();
        int[] ar = new int[n] ;
        for (int i = 0; i < n; i++)
        {
            ar[i] = s.nextInt();

        }
        int target = s.nextInt();
        print_pairs(ar, target);
    }
    public static void print_pairs(int[] ar, int n)
    {
        System.out.print("[");
        for (int i = 0; i < ar.length-2; i++) {
            for (int j = i+1; j < ar.length-1 ; j++) {
                for (int k = j+1; k < ar.length ; k++) {
                    if ((ar[i] + ar[j] + ar[k]) == n) {
                        System.out.print(" (" + ar[i] + ", " + ar[j] + ", " + ar[k] +  "),");
                    }
                }
            }
        }
        System.out.println(" ]");
    }
}
