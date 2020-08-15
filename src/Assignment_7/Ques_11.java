package Assignment_7;

public class Ques_11
{
    public static void main(String[] args)
    {
        System.out.println(cntaaa("aaaa", 0));
        System.out.println(cntaaaovlap("aa", 0));
    }


    public static int cntaaa(String str, int i)
    {
        int cnt = 0 ;
        if(i > str.length() - 3)
        {
            return cnt;
        }
        if(str.substring(i, i +3).equals("aaa"))
        {
            return  1 + cntaaa(str, i + 1);
        }
        return cntaaa(str , i+1);
    }


    public static int cntaaaovlap(String str, int i)
    {
        int cnt = 0 ;
        if(i > str.length() - 3)
        {
            return cnt;
        }
        if(str.substring(i, i +3).equals("aaa"))
        {
            return  1 + cntaaaovlap(str, i + 3);
        }
        return cntaaaovlap(str , i+1);
    }


}
