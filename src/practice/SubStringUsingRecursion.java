package practice;

public class SubStringUsingRecursion {

    public static void main(String[] args)
    {
        Substring("xyz", 0,1);
    }

    public static void Substring(String s, int j)
    {
        if(j == s.length())
        {
            return;
        }
        for (int i = j+1; i <= s.length() ; i++)
        {
            System.out.println(s.substring(j,i));
        }
        Substring(s, j+1);
    }

    public static void Substring(String s, int i, int j)
    {
        if(j > s.length())
        {
            return;
        }
        if(i>=j)
        {
            return;
        }

        System.out.println(s.substring(i,j));

        Substring(s,i+1, j);
        Substring(s, i,j+1);

    }

}
