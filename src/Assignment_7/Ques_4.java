package Assignment_7;

public class Ques_4
{
    public static void main(String[] args) {
        String str = "aabbaa";
        System.out.println(palin_check(str, 0));
    }

    public static boolean palin_check(String str, int i)
    {
        if(i == str.length()/2)
        {
            return true;
        }
        if(str.charAt(i) != str.charAt(str.length() - i - 1))
        {
            return false;
        }
         return palin_check(str , i + 1);
    }

}
