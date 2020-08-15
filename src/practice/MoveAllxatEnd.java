package practice;

import java.util.Scanner;

public class MoveAllxatEnd
{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        String str1 = s.nextLine();
        String str2 = "";
        String str3 = "";

        for(int i = 0; i < str1.length(); ++i)
        {
            if(str1.charAt(i) == 'x')
            {
                str2 += "x";
            }
            else
            {
                str3 += str1.charAt(i);
            }
        }

        System.out.print(str3 + str2);
    }
}
