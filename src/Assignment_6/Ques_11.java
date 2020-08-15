package Assignment_6;

import java.util.Scanner;

public class Ques_11
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int[] ar = {1, 2, 3, 3, 2, 2};
       // int n = s.nextInt();
        System.out.println(palin_check(ar, 0));

    }


    public static boolean palin_check(int[] ar, int i)
    {
        if(i == ar.length / 2)
        {
            return true;
        }

        else if (ar[i] != ar[ar.length - i - 1])
        {
            return false;
        }

        return palin_check(ar,i + 1);
    }


}
