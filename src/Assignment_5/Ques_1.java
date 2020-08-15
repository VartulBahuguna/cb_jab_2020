package Assignment_5;

import java.util.Scanner;

public class Ques_1
{
    public static void main(String[] args) {
        String ch;
        Scanner s = new Scanner(System.in);
        ch = s.nextLine();
        palindrom(ch);

    }
    public static void palindrom(String ch )
    {
        StringBuilder s = new StringBuilder("");

        for (int i = ch.length() -1 ; i >= 0 ; --i )
        {

            s.append(ch.substring(i,i+1));
        }
        String s1 = new String(s);
        if(s1.equals(ch))
        {
            System.out.println("Palindrome " );

        }
        else
        {
            System.out.println("Not a palindrome " + s);
        }
    }
    public static boolean pallindrome(String s)
    {
        int  i = 0, j = s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;

        }

        return true;
    }

}
