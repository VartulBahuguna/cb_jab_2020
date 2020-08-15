package Assignment_4;

import java.util.Scanner;

public class Ques_15
{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length ; i++) {
            a[i] = s.nextInt();
        }
        subset(a);
    }
    public static void subset(int[] ar)
    {
        for (int i = 0; i <ar.length -1 ; i++) {
            for (int j = i+1; j < ar.length ; j++) {
                for (int k = i; k < j; k++) {
                    System.out.print(ar[i] + " ");
                }
                System.out.println();
            }
        }
    }

}
