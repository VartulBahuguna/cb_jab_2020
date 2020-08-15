package Assignment_7;

public class Ques_10
{
    public static void main(String[] args)
    {
        System.out.println(twincnt("AxAxA", 0));
    }



    public static int twincnt(String str, int i)
    {
        int cnt = 0;
        if(i == str.length() - 2)
        {
            return cnt ;
        }
        if(str.charAt(i) == str.charAt(i + 2))
        {
            return 1 + twincnt(str,  i  + 1);
        }
        return twincnt(str, i + 1);

    }

}
