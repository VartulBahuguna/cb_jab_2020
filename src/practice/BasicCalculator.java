package practice;

import java.util.Scanner;

public class BasicCalculator
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int check = 1;
        char ch ;
        do
        {
            ch = s.next().charAt(0);
            if(ch == '+')
            {
                int a = s.nextInt();
                int b = s.nextInt();
                System.out.println(a + b);
            }
            else if(ch == '-')
            {
                int a = s.nextInt();
                int b = s.nextInt();
                System.out.println(a - b);
            }
            else if(ch == '/')
            {
                int a = s.nextInt();
                int b = s.nextInt();
                System.out.println(a / b);
            }
            else if(ch == '*')
            {
                int a = s.nextInt();
                int b = s.nextInt();
                System.out.println(a * b);
            }
            else if(ch == '%')
            {
                int a = s.nextInt();
                int b = s.nextInt();
                System.out.println(a % b);
            }
            else if(ch == 'x' || ch == 'X')
            {
                check = 0;
            }
            else
            {
                System.out.println("Invalid operation. Try again.");
            }
        }while(check == 1);
    }
}
