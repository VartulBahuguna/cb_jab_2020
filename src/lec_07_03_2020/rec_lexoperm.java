package lec_07_03_2020;

public class rec_lexoperm
{
    public static void main(String[] args)
    {
        String str = "aab";
        int[] f = new int[26];
        freq(str, f);
        lexo_permute("", f, str.length());
    }

    public static void freq(String str, int[] f)
    {

        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            f[ch - 'a']++;
        }
    }

    public static void lexo_permute(String proc, int[] f, int length)
    {
        if(length == 0)
        {
            System.out.println(proc + " ");
            return;
        }
        for (int i = 0; i < 26; i++)
        {
            if(f[i] > 0)
            {
                f[i]--;
                lexo_permute(proc + (char)(i + 'a'), f, length-1);
                f[i]++;
            }

        }
    }


}
