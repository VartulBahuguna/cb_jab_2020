package CODEVITA;

import java.util.Scanner;

public class CountPalindromes
{
    public static void main(String[] args) {
        int ans = 0;

        Scanner s= new Scanner(System.in);
        
        int n1 = s.nextInt();
        int n2 = s.nextInt();

        int lo = n1 * 1000000;
        int hi = n2 * 1000000 + 235959;

        for(int i = lo; i < hi; ++i)
        {
            String k = i + "";

            int st = 0;
            int end = k.length()-1;
            boolean palin = true;
            if(k.charAt(end - 1) > '5')
            {
                continue;
            }
            if(k.charAt(end - 3) > '5')
            {
                continue;
            }
            if(k.charAt(end-4) > '3' || k.charAt(end - 5) > '2')
            {
                continue;
            }
            while(st < end)
            {
                if(k.charAt(st) != k.charAt(end))
                {
                    palin = false;
                    break;
                }
                st++;
                end--;
            }
            if(palin)
            {
                ans++;
                System.out.println(k);
            }
        }
        System.out.print(ans);
    }
}
