package DP;


public class LCS
{
    public static void main(String[] args) {
        int[][] mem = new int[4+1][5+1];
        System.out.println(lcs("abbg","agbga"));
        System.out.println(lcsitrdp("abbg","agbga"));
        System.out.println(lcsrecdp("abbg","agbga", mem, 1, 1));
    }

    public static int lcsrecdp(String str1, String str2, int[][] mem, int i, int j)
    {
        if(str1.isEmpty()||str2.isEmpty())
        {
            return 0;
        }

        if(mem[i][j]!=0)
        {
            return mem[i][j];
        }
        if(str1.charAt(0) == str2.charAt(0))
        {
            mem[i][j] = 1 + lcsrecdp(str1.substring(1),str2.substring(1), mem,i+1,j+1) + mem[i-1][j-1];
        }
        else
        {
            mem[i][j] += Math.max(lcsrecdp(str1.substring(1),str2, mem,i+1,j),lcsrecdp(str1,str2.substring(1), mem,i,j+1));
        }
        return mem[i][j];
    }

    public static int lcsitrdp(String str1, String str2)
    {
        int[][] mem = new int[str1.length()+1][str2.length()+1];

        for (int i = 0; i <= str1.length() ; i++)
        {
            for (int j = 0; j <= str2.length() ; j++)
            {
                if(i == 0 || j == 0)
                {
                    mem[i][j] =  0;
                }
                else
                {
                    if(str1.charAt(i-1) == str2.charAt(j-1))
                    {
                        mem[i][j] = 1+ mem[i-1][j-1];
                    }
                    else
                    {
                        mem[i][j] += Math.max(mem[i-1][j], mem[i][j-1]);
                    }
                }
            }
        }
        return mem[str1.length()][str2.length()];

    }



    public static int lcs(String str1, String str2)
    {
        int cnt = 0;
        if(str1.isEmpty() || str2.isEmpty())
        {
            return 0;
        }
        if(str1.charAt(0) == str2.charAt(0))
        {
            cnt += 1 + lcs(str1.substring(1), str2.substring(1));
        }
        else
        {
            int lcs1 = lcs(str1.substring(1), str2);
            int lcs2 = lcs(str1, str2.substring(1));

            cnt = Math.max(lcs1, lcs2);
        }

        return cnt;
    }

}
