package Assignment_3;

import java.util.Scanner;

public class Ques_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        for(int i = n1; i <= n2; i++)
        {
            int n = Armstrong(i);
            if (n == i)
                System.out.println(i);
        }
    }
    public static int Armstrong (int num)
    {
        int n = num ;
        int x = 0;
        int c = 0;
        while(n!=0)
        {
            n = n / 10;
            c++;
        }

        while(num!=0)
        {
            int rem = num % 10 ;
            x = x + (int)Math.pow(rem , c);
            num = num / 10 ;
        }
        return x;
    }
}
