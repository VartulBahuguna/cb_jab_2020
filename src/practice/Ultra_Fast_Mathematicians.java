package practice;

import java.util.Scanner;

public class Ultra_Fast_Mathematicians
{

    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- != 0)
        {
            String str1 = s.next();
            String str2 = s.next();
            //str1 = s.nextLine();
            String str = "";
            //long pow = 1;
            int i = 0;
            while(i != str1.length())
            {
                //int rem1 = (int)(str1 % 10);
                //int rem2 = (int)(str2 % 10);
                if((int)(str1.charAt(i)) == (int)(str2.charAt(i)))
                {
                    str =  str + '0' ;
                }
                else
                {
                    str =  str + '1' ;
                }
                //pow = pow * 10;
                i++;
            }
            System.out.println(str);
        }

    }

}
