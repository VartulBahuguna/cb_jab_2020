package Test;

import java.util.Scanner;

public class ques1 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ar = new int[n];
        int target = s.nextInt();
        for(int i = 0 ; i < n ; ++i)
        {
            ar[i] = s.nextInt();
        }

        for(int i = 0; i < n - 1 ; ++i)
        {
            for(int j = i + 1; j < n ; ++j)
            {
                if(sum(ar, i ,j) == target)
                {
                    print(ar, i, j);
                }
            }
        }

    }

    public static int sum(int[] ar,int i , int j)
    {
        int s = 0 ;
        for(int n = i; n <= j; ++n)
        {
            s = s + ar[n];
        }
        System.out.println(s);
        return s;
    }

    public static void print(int[] ar, int i , int j)
    {
        for(int n = i; n <= j; ++j)
        {
            System.out.print(ar[n] + " ");
        }
        System.out.println();
    }
}
