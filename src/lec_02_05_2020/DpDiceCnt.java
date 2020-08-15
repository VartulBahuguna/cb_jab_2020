package lec_02_05_2020;

public class DpDiceCnt
{
    public static void main(String[] args)
    {
        int n = 4;
        int[] mem = new int[n + 1];
        int[] meme = new int[n + 1];

        System.out.println(dicecnt(4));
        System.out.println(dpitrdicecnt(4, meme));
        System.out.println(recdpdicecnt(4, mem));


    }

    public static int recdpdicecnt(int target, int[] mem)
    {

        if(target==0)
        {
            return 1;
        }

        if(mem[target]!=0)
        {
            return mem[target];
        }

        int cnt = 0;

        for (int i = 1; i <=6 && i<=target ; i++)
        {
            cnt += recdpdicecnt(target-i,mem);
        }

        mem[target] = cnt;

        return mem[target];
    }

    public static int dicecnt(int target)
    {
        int cnt = 0;

        if(target == 0)
        {
            return  1;
        }

        for (int i = 1; i <= target && i <= 6 ; i++)
        {
            cnt += dicecnt(target - i);
        }

        return cnt;
    }


    public static int dpitrdicecnt(int target,int[] mem)
    {

        mem[0] = 1;

        for (int i = 1; i <= target; i++)
        {
            for (int j = 1; j <=i && j<=target ; j++)
            {
                mem[i] = mem[i] + mem[i - j];
            }
        }

        return mem[target];
    }


}
