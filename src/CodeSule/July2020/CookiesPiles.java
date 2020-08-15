package CodeSule.July2020;

import java.util.Scanner;

public class CookiesPiles
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        while(t-- != 0)
        {
            int n = s.nextInt();
            n++;
            int a = s.nextInt();
            int d = s.nextInt();
            int ans = 0;

            // for(int i = 0; i < n-1; ++i)
            // {
            //     a = a + d;
            //     ans += a;
            // }
            ans = (n/2)*((2*a) + ((n-1)*d));
            System.out.println(ans);
        }
    }
}
