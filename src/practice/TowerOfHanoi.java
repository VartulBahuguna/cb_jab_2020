package practice;

import java.util.Scanner;

public class TowerOfHanoi
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        System.out.print(towerOfHnaoi(n, "T1", "T3", "T2") - 1);

    }

    public static int towerOfHnaoi(int n, String T1, String T2, String T3)
    {
        int cnt = 0;
        if(n == 0)
        {
            return 1;
        }

        cnt += towerOfHnaoi(n - 1, T1, T3, T2);

        System.out.println("Move " + n + "th disc from " +  T1 + " to " + T3);

        cnt += towerOfHnaoi(n - 1, T2, T1, T3);

        return cnt;
    }
}
