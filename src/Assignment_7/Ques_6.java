package Assignment_7;

public class Ques_6
{
    public static void main(String[] args) {
        String str1 = "hello";

        String str2 =  str1.charAt(0) + "";
//        no_dupli(str1 , str2, 1);
        System.out.println(no_dupli(str1 , str2, 1));

    }

    public static String no_dupli(String str1, String str2, int i)
    {
        if(i == str1.length())
        {
            return(str2);
        }
        if(str1.charAt(i) != str2.charAt(str2.length() - 1))
        {
            str2 = str2 + str1.charAt(i);
            return no_dupli(str1, str2, i + 1);
        }
        else
        {
           // str2 = str2 +  "*";
            return no_dupli(str1, str2, i + 1);
        }

    }
}
