package Assignment_7;

public class Ques_3
{
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "lleh";
        System.out.println(str_check(str1, str2, 0));
    }

    public static boolean str_check(String str1 , String str2, int i)
    {
        if(i == str1.length())
        {
            return true;
        }
        if(str1.length() != str2.length())
        {
            return false;
        }
        if(str1.charAt(i) != str2.charAt(str1.length() - i - 1))
        {
            return false;
        }

        return(str_check(str1, str2, i+1));
    }
}
