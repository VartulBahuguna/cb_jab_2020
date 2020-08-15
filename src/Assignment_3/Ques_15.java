package Assignment_3;

import java.util.Scanner;

public class Ques_15
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int c = 0;
        for(int i = 0 ; c <= n1 ; ++i)
        {
            if (check(i, n2) != -10)
            {
                System.out.println(check(i, n2));
                c++;
            }
        }
    }
    public static int check(int i, int n)
    {
        int x = 3 * i - 2 ;
        if(x % n == 0)
            return -10;
        else
            return x;
    }
}
