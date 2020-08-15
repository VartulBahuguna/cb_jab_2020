package lec_16_02_2020;

import java.lang.reflect.Array;
import java.util.Arrays;

public class array_fq
{
    public static void main(String[] args)
    {
        int [] a = new int[26];

        String s = "lalalalla";
        for (int i = 0; i <s.length() ; i++) {
            char ch = s.charAt(i);
            a[ch - 'a']++;

        }
        for (int i = 0; i < 26; i++) {
            if(a[i] > 0)
            {
                System.out.print((char)(i + 'a') + " ");
            }

        }
        System.out.println(Arrays.toString(a));
    }
}
