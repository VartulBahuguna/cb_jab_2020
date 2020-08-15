package Test;

import java.util.Scanner;

public class ChewbaccaandNumber
{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        long  n = s.nextLong();
        long  fin = 0;
        long  pow = 1;
        while(n != 0)
        {
            int rem =(int)( n % 10);
            if(rem >= 5)
            {
                if(rem == 9 && n/10 == 0)
                {
                }
                else
                {
                    rem = 9 - rem;
                }
            }
            fin = fin + (long)(rem*pow );
            pow = pow * 10;
            n = n/10;
        }
        System.out.print(fin);
    }
}
