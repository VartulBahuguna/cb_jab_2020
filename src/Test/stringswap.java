package Test;

public class stringswap
{
    public static void main(String[] args)
    {
        String str1 = "bat";
        String str2 = "apple";
        String str3 = "batman";
        System.out.println(str1 + "\n" + str3);
        int k = 0;
        int check = 0;
        while(k < str1.length() && k < str3.length())
        {
            if(str1.charAt(k) != str3.charAt(k))
            {
                check = 1;
            }
            if(str1.charAt(k) > str3.charAt(k))
            {
                String temp = str1;
                str1 = str3;
                str3 = temp;
                check = 1;
                break;
            }
            k++;
        }
        if(str1.length() < str3.length() && check == 0)
        {
            String temp = str1;
            str1 = str3;
            str3 = temp;
        }
        System.out.println(str1);
        System.out.println(str3);
    }
}
