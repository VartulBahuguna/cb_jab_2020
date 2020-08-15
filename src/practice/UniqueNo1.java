package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class UniqueNo1
{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        ArrayList list = new ArrayList();
        list.add(5);
        int n = s.nextInt();

        int[] a = new int[n];

        for(int i = 0; i < n; ++i)
        {
            a[i] = s.nextInt();
        }

        int[] bitcnt = new int[32];

        for(int i = 0; i < n; ++i)
        {
            int num = a[i];

            int j = 0;
            while(num != 0)
            {
                bitcnt[j] += (num & 1);
                num >>= 1;
                j++;
            }
        }

        int uniqueNo = 0;
        int pow = 1;
        for(int i = 0; i < 32; ++i)
        {
            bitcnt[i] %= 2;
            uniqueNo += bitcnt[i]*pow;
            pow <<= 1;
        }
        System.out.print(uniqueNo);
    }
}
