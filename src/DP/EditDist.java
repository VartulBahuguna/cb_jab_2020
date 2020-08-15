package DP;

public class EditDist
{
    public static void main(String[] args)
    {
        System.out.println(mindist("agbg", "acgb"));
        System.out.println(mindistitrdp("agbg", ""));
        int[][] mem = new int[4+1][4+1];
        System.out.println(mindistrecdp("agbg", "acgb", mem, 0, 0));
    }

    public static int mindistrecdp(String s1, String s2, int[][] mem, int i, int j)
    {

        if(s1.length()==0)
        {
            mem[i][j] = s2.length();
            return s2.length();
        }
        if(s2.length() == 0)
        {
            mem[i][j] = s1.length();
            return s1.length();
        }

        String ros1 = s1.substring(1);
        String ros2 = s2.substring(1);

        if(s1.charAt(0) == s2.charAt(0))
        {
            mem[i][j] = mindistrecdp(ros1,ros2,mem,i+1,j+1);
        }

        else
        {
            int f1 = 1 + mindistrecdp(ros1,ros2,mem,i+1,j+1);
            int f2 = 1 + mindistrecdp(s1,ros2,mem,i,j+1);
            int f3 = 1 + mindistrecdp(ros1,s2, mem,i+1, j);
            mem[i][j] = Math.min(f1, Math.min(f2,f3));
        }

        return mem[i][j];
    }

    public static int mindistitrdp(String s1, String s2)
    {
        int[][] mem = new int[s1.length()+1][s2.length()+1];

        for (int i = 0; i <= s1.length() ; i++)
        {
            for (int j = 0; j <= s2.length() ; j++)
            {
                if(0 == i)
                {
                    mem[i][j] = j;
                    continue;
                }
                if(0 == j)
                {
                    mem[i][j] = i;
                    continue;
                }
                if(s1.charAt(i-1) == s2.charAt(j-1))
                {
                    mem[i][j] = mem[i-1][j-1];
                }
                else
                {
                    mem[i][j] = 1+Math.min(mem[i-1][j-1],Math.min(mem[i-1][j],mem[i][j-1]));
                }
            }
        }

        return mem[s1.length()][s2.length()];
    }

    public static int mindist(String str1, String str2)
    {
        int ans = 0;

        if(str1.length() == 0)
        {
            return str2.length();
        }

        if(str2.length() == 0)
        {
            return str1.length();
        }

        String ros1 = str1.substring(1);
        String ros2 = str2.substring(1);

        if(str1.charAt(0) == str2.charAt(0))
        {
            ans = mindist(ros1,ros2);
        }
        else
        {
            int f1 = 1 + mindist(ros1,ros2);
            int f2 = 1 + mindist(str1,ros2);
            int f3 = 1 + mindist(ros1, str2);

            ans = Math.min(f1, Math.min(f2,f3));
        }

        return ans;
    }


}
