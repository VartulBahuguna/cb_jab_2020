package Assignment_5;

import java.util.Arrays;
import java.util.Scanner;

public class Ques_8
{
    public static void main(String[] args)
    {


        Scanner s = new Scanner(System.in);
        String str = s.nextLine();


        StringBuilder s1 = new StringBuilder(str);
        int[] ar = new int[26];

        for (int i = 0; i < s1.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch<= 'Z' && ch>= 'A')
            {
                ar[(ch - 'A')]++;
            }
            else {
                ar[(ch - 'a')]++;
            }
        }
        int max = ar[0];
        int x = 0;
        for (int i = 0; i <ar.length ; i++)
        {
            if(max<ar[i])
            {
                max = ar[i];
                x = i;
            }
        }

        System.out.println("Most occuring element is " + (char)('a' + x));
        System.out.println(Arrays.toString(ar));
    }

}
