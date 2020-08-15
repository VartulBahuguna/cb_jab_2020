package practice;

import java.util.Scanner;

public class CoverThemAll
{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t != 0) {
            int n = s.nextInt();
            long[] pos = new long[n];
            long[] bomb = new long[n];
            for (int i = 0; i < n; i++) {
                pos[i] = s.nextInt();
            }
            for (int i = 0; i < n; i++) {
                bomb[i] = s.nextInt();
            }
            soldier(n, pos, bomb);
            t--;
        }
    }

    private static void soldier(int n, long[] pos, long[] bomb) {
        long sum=0;
        for (int i = 0; i<n-1 ; i++) {
            for (int j = i+1; j<n ; j++) {
                long y=Math.abs(pos[j]-pos[i]);
                long  x=(Math.max(bomb[i],bomb[j]))*y;
                sum=(sum+x);
            }
        }
        System.out.println(sum%1000000007);
    }
}
