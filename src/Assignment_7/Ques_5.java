package Assignment_7;

public class Ques_5
{
    public static void main(String[] args) {
        String str1 = "hello";

        String str2 =  str1.charAt(0) + "";
//        no_dupli(str1 , str2, 1);
        System.out.println(rep_dupli(str1 , str2, 1));

    }


    public static String rep_dupli(String str1, String str2, int i)
    {
        if(i == str1.length())
        {
            return(str2);
        }
        if(str1.charAt(i) != str2.charAt(str2.length() - 1))
        {
            str2 = str2 + str1.charAt(i);
            return rep_dupli(str1, str2, i + 1);
        }
        else
        {
            str2 = str2 +  "*";
            return rep_dupli(str1, str2, i);
        }

    }

}
