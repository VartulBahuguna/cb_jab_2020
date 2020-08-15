package practice;

import java.util.Arrays;
import java.util.Scanner;

import static lec_07_03_2020.rec_lexoperm.lexo_permute;

public class DictionaryOrderLarger
{
    public static void main(String[] args)
    {
        String str = "2134";
        int[] f = new int[26];
        freq(str, f);
        lexo_permute("", f, str.length(), str);
    }

    public static void freq(String str, int[] f)
    {

        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            f[ch - 'a']++;
        }
    }

    public static void lexo_permute(String proc, int[] f, int length, String unproc)
    {
        if(length == 0)
        {
            if(proc.compareTo(unproc) < 0)
                System.out.println(proc + " ");
            return;
        }
        for (int i = 0; i < 26; i++)
        {
            if(f[i] > 0)
            {
                f[i]--;
                lexo_permute(proc + (char)(i + 'a'), f, length-1,unproc);
                f[i]++;
            }

        }
    }
}
