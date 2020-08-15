package lec_03_05_2020;

public class EditDistance
{
    public static int EditDistance(String s1, String s2)
    {
        if(s1.length() == 0)
        {
            return s2.length();
        }

        if(s2.length() == 0)
        {
            return s1.length();
        }

        char f = s1.charAt(0);
        char s = s2.charAt(0);

        if (s == f)
        {
            return EditDistance(s1.substring(1),s2.substring(2));
        }

        else
            return 1 + Math.min(EditDistance(s1,s2.substring(1)), Math.min(EditDistance(s1.substring(1), s2), EditDistance(s1.substring(1), s2.substring(1))));
    }

}
