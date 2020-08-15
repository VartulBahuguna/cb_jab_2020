package practice;

import java.util.Scanner;

public class IsArraySorted
{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        StringBuilder str = new StringBuilder();

        int n = s.nextInt();
        int[] ar = new int[n];
        for(int i = 0; i < n; ++i)
        {
            ar[i] = s.nextInt();
        }

        System.out.print(ascCheck(ar, 0));
    }

    public static boolean ascCheck(int[] ar, int i)
    {
        if(i == ar.length - 1)
        {
            return true;
        }

        if(ar[i] > ar[i + 1])
        {
            return false;
        }

        return ascCheck(ar, i  + 1);
    }

}
