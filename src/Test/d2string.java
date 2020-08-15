package Test;

import java.util.Scanner;

public class d2string
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        String[] str = new String[4];
        for (int i = 0; i <4 ; i++)
        {
            str[i] = s.nextLine();
        }
        for (int i = 0; i <4 ; i++)
        {
            System.out.println(str[i]);
        }
    }
}
