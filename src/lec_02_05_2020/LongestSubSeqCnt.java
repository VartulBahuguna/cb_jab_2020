package lec_02_05_2020;

public class LongestSubSeqCnt {
    public static void main(String[] args) {

        int[][] mem = new int[5][5];
        int[][] meme = new int[5][5];
        System.out.println(lcs("abec", "abcd"));
        System.out.println(lcsitrdp("abec", "abcd", mem));
        System.out.println(lcsrecdp("abec", "abcd", meme, 4, 4));
    }

    public static int lcs(String str1, String str2) {

        if (str1.length() == 0 || str2.length() == 0)
        {
            return 0;
        }

        else if (str1.charAt(0) == str2.charAt(0))
        {
            return 1 + lcs(str1.substring(1), str2.substring(1));
        }

        else
        {
            return Math.max(lcs(str1, str2.substring(1)), lcs(str1.substring(1), str2));
        }
    }

    public static int lcsrecdp(String str1, String str2, int[][] mem, int i, int j)
    {
        if (str1.length() == 0 || str2.length() == 0)
        {
            return 0;
        }

        else if (str1.charAt(0) == str2.charAt(0)) {
            mem[i][j] = 1 + lcsrecdp(str1.substring(1), str2.substring(1), mem, i - 1, j - 1);
        }

        else
        {
                mem[i][j] =  Math.max(lcsrecdp(str1, str2.substring(1), mem, i, j - 1), lcsrecdp(str1.substring(1), str2, mem, i - 1, j));
        }

        return mem[i][j];
    }

    public static int lcsitrdp(String s1, String s2, int[][] mem) {

        for (int i = 0; i <= s1.length(); i++)
        {
            for (int j = 0; j <= s2.length(); j++)
            {
                if (i == 0 || j == 0)
                {
                    mem[i][j] = 0;
                }
                else
                {
                    if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    {
                        mem[i][j] = 1 + mem[i - 1][j - 1];
                    }
                    else
                    {
                        mem[i][j] = Math.max(mem[i - 1][j], mem[i][j - 1]);
                    }
                }
            }
        }

        return mem[s1.length()][s2.length()];
    }
}
