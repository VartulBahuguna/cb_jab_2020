package Assignment_7;

public class Ques_8
{
    public static void main(String[] args)
    {
        System.out.println(hicnt("hi ksfsdhhu uhuhi dihihdfiifhihii dhi", 0));
        System.out.println(hirem("hi ksfsdhhu uhuhi dihihdfiifhihii dhi","", 0));
        System.out.println(hirep("hi ksfsdhhu uhuhi dihihdfiifhihii dhi","", 0));
    }


    public static int hicnt(String str, int i)
    {
        int cnt = 0;
        if(i > str.length() - 1)
        {
            return cnt;
        }
        if(str.substring(i,i+2).equals("hi") )
        {
            return 1 +  hicnt(str, i + 2);

        }
        return hicnt(str, i + 1);

    }


    public static  String hirem(String str1, String str2, int i)
    {
        if(i > str1.length() - 1)
        {
            return str2;

        }
        if(str1.substring(i, i + 2).equals("hi"))
        {
            return hirem(str1, str2, i + 2);
        }

        str2 = str2 + str1.charAt(i);
        return hirem(str1, str2 ,i + 1);

    }


    public static  String hirep(String str1, String str2, int i)
    {
        if(i > str1.length() - 1)
        {
            return str2;

        }
        if(str1.substring(i, i + 2).equals("hi"))
        {
            str2 = str2 + "bye";
            return hirep(str1, str2, i + 2);
        }

        str2 = str2 + str1.charAt(i);
        return hirep(str1, str2 ,i + 1);

    }

}
