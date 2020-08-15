package Assignment_6;

import java.util.Scanner;

public class Ques_1
{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        inc_dec(n - 1);
    }
    public static void inc_dec(int n)
    {
        if(n <= 0)
            return;
        else if (n % 2 != 0)
        {
            System.out.println(n);
            inc_dec(n - 1);

        }
        else {
            inc_dec(n - 1);
            System.out.println(n);
        }
    }
}
