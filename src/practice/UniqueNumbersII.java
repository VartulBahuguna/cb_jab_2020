package practice;

import java.util.Scanner;

public class UniqueNumbersII
{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int[] a = new int[n];

        for(int i = 0; i < n; ++i)
        {
            a[i] = s.nextInt();
        }

        int[] bitcnt = new int[32];
        int xorVar = 0;

        for(int i = 0; i < n; ++i)
        {
            xorVar = (a[i]^xorVar);
        }

        int maskVar = 0;
        int temp = xorVar;

        while(temp != 0)
        {
            if((temp&1) != 0)
            {
                break;
            }
            maskVar++;
            temp = temp>>1;
        }


        int mask = (1 << maskVar);
        int uniqueNo1 = 0;
        for(int i = 0; i < n; ++i)
        {
            if((mask&a[i]) != 0)
            {
                uniqueNo1 = (uniqueNo1^a[i]);
            }
        }

        int uniqueNo2 = (xorVar^uniqueNo1);

        System.out.print(uniqueNo2 + " " + uniqueNo1);
    }
}
