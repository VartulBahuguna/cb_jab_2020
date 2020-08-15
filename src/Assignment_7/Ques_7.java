package Assignment_7;

public class Ques_7
{
    public static void main(String[] args)
    {
        String str2 = "abexexdexed";
        String str1 = "";
        String str3 = "";
        System.out.println(xend(str1, str2,0, str3));
    }


    public static String xend(String str1, String str2, int i, String str3)
    {
        if(i == str2.length())
        {
            str1 = str1 + str3 ;
            return str1;
        }
        if(str2.charAt(i) == 'x')
        {
            str3 = str3 + "x";
            return(xend(str1, str2,i+1, str3)) ;
        }
        else
        {
            str1 = str1 + str2.charAt(i);
          //  str2 = str2.substring(i + 1);
            return(xend(str1, str2 ,i + 1, str3));
        }

    }

}
