package Assignment_7;

public class Ques_13
{
    public static void main(String[] args)
    {
        System.out.println(a_check("abbabbabb", 0));
    }


    public static boolean a_check(String str, int i)
    {
        if(str.length() <= i)
        {
            return true;
        }

        if(str.charAt(0) != 'a')
        {
            return false;
        }
        if(str.charAt(i) == 'a')
        {
            if(i == str.length() - 1)
            {
                return true;
            }
            if(str.charAt(i + 1) == 'a' || str.substring(i + 1, i + 3).equals("bb") )//||i == str.length() - 1 )
            {
                return a_check(str, i + 1);
            }
            /*else if (str.substring(i + 1, i + 3).equals("bb"))
            {
                if(str.charAt(i + 3) == 'a')
                {
                    return a_check(str, i + 4);
                }
            }*/
        }
        if(str.substring(i, i + 2).equals("bb"))
        {
            if(i == str.length() - 1)
            {
                return true;
            }
            if(str.charAt(i + 2) == 'a')// || i == str.length() - 1)
            {
                return a_check(str, i + 2);
            }
        }
        return false;
    }

}
