package Assignment_7;

public class Ques_9
{
    public static void main(String[] args)
    {
        System.out.println(hitcnt("hi hi hihithithiihiti", 0));
        System.out.println(hitrem("", "hi hi hihithithiihiti", 0));
        System.out.println(hitrep("", "hi hi hihithithiihiti", 0));
    }

    public static int hitcnt(String str, int i)
    {
        int cnt = 0;
        if(i >= str.length() - 1)
        {
            return cnt;
        }
        if(i <= str.length() - 3 && str.substring(i,i+3).equals("hit") )
        {
            return hitcnt(str, i + 3);
        }
        if(i <= str.length() - 2 && str.substring(i,i+2).equals("hi") )
        {
            return 1 +  hitcnt(str, i + 2);

        }
        return hitcnt(str, i + 1);

    }


    public static String hitrem(String str1, String str2, int i)
    {
       if(i > str2.length() - 1)
       {
           return str1;
       }
       if(i <= str2.length() - 3 && str2.substring(i,i + 3).equals("hit"))
       {
           return hitrem(str1= str1 + str2.substring(i, i + 3), str2, i + 3);
       }
       if(i <= str2.length() - 2 && str2.substring(i, i + 2).equals("hi"))
       {
           return hitrem(str1, str2, i + 2);
       }

       return hitrem(str1 = str1 + str2.charAt(i) , str2, i+ 1);

    }


    public static String hitrep(String str1, String str2, int i)
    {
        if(i > str2.length() - 1)
        {
            return str1;
        }
        if(i <= str2.length() - 3 && str2.substring(i,i + 3).equals("hit"))
        {
            return hitrep(str1= str1 + str2.substring(i, i + 3), str2, i + 3);
        }
        if(i <= str2.length() - 2 && str2.substring(i, i + 2).equals("hi"))
        {
            return hitrep(str1 = str1 + "bye", str2, i + 2);
        }

        return hitrep(str1 = str1 + str2.charAt(i) , str2, i+ 1);

    }

}
