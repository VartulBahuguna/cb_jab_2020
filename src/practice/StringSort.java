package practice;

import java.util.Scanner;

public class StringSort
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String[] str = new String[n];
        for(int i = 0; i < n; ++i)
        {
            str[i] = s.next();
        }
        for(int i = 0; i < str.length - 1; ++i)
        {
            for(int j = 0; j < str.length - i - 1; ++j)
            {
                int k = 0;
                int check = 0;
                while(k < str[j].length() && k < str[j+1].length())
                {
                    if(str[j].charAt(k) != str[j+1].charAt(k))
                    {
                        check = 1;
                    }
                    if(str[j].charAt(k) < str[j+1].charAt(k))
                    {
                        break;
                    }
                    if(str[j].charAt(k) > str[j+1].charAt(k))
                    {
                        String temp = str[j];
                        str[j] = str[j+1];
                        str[j+1] = temp;
                        check = 1;
                        break;
                    }
                    k++;
                }
                if(str[j].length() < str[j+1].length() && check == 0)
                {
                    String temp = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = temp;
                }
            }
        }
        for(int i = 0; i < n; ++i)
        {
            System.out.println(str[i]);
        }
    }
}
