package CODEVITA;

import java.util.Scanner;

public class EvenOdd
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int low = s.nextInt();
        int hi = s.nextInt();
        int k = s.nextInt();

        System.out.println(findP(low, hi, k, 0));

    }

    public static int findP(int lo, int hi, int k, int sum)
    {
        int ans = 0;
        if(sum%2 == 0 && k == 0)
        {
            return 1;
        }

        for(int i = lo; i <= hi; i++) {
            if(k>0)
            {
                ans += findP(lo, hi, k-1,sum + i);
            }
            else
            {
                break;
            }
        }

        return ans%1000000007;
    }
}
