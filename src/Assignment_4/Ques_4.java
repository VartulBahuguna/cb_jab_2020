package Assignment_4;

import java.util.Arrays;
import java.util.Scanner;

public class Ques_4 {

    public static void main(String[] args)
    {
        Scanner s =new Scanner(System.in);
        int n = s.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < n; i++)
        {
            ar[i] = s.nextInt();

        }
        int start = 0;
        int end = n-1;
        for (int i = 0; i < n/2 ; i++)
        {
            swap(ar,start++,end--);

        }
        System.out.println(Arrays.toString(ar));
    }
    public static void swap(int[] ar, int i , int j) {
        int t = ar[i];
        ar[i] = ar[j];
        ar[j] = t;
    }
}
