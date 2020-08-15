package practice;

import java.util.Scanner;

public class OptimalGameStrategyI
{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; ++i)
        {
            a[i]  =s.nextInt();
        }

        System.out.print(win(a, 0, n - 1));
    }

    public static int win(int[] a, int i, int j)
    {
        int sumMax = 0;

        if(i > j)
        {
            return 0;
        }

        int takeFirst = a[i] + Math.min(win(a, i + 2, j), win(a, i + 1, j - 1));

        int takeLast = a[j] + Math.min(win(a, i + 1, j - 1), win(a, i, j - 2));

        sumMax = Math.max(takeFirst, takeLast);

        return sumMax;
    }
}
