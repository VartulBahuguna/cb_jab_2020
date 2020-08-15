package lec_02_05_2020;

public class DPFibo
{
    public static void main(String[] args) {
        int n = 5;
        Integer[] mem = new Integer[n + 1];
        Integer[] itrfibodp = new Integer[n + 1];
        System.out.println(recfibo(n));
        System.out.println(recDpFibo(n, mem));
        System.out.println(itrDpFibo(n, itrfibodp));
    }


    private static int recfibo(int n)
    {
        if(n < 2)
        {
            return  n;
        }

        return recfibo(n - 1) + recfibo(n - 2);
    }

    private static int recDpFibo(int n, Integer[] mem) {
        if(n < 2)
        {
            return n;
        }

        if(mem[n] != null)
        {
            return mem[n];
        }

        mem[n] = recDpFibo(n - 1, mem) + recDpFibo(n - 2, mem);

        return mem[n];
    }


    private static int itrDpFibo(int n, Integer[] mem)
    {
        mem[0] = 0;
        mem[1] = 1;

        for (int i = 2; i <= n ; i++)
        {
            mem[i] = mem[i - 1] + mem[i - 2];
        }

        return mem[n];
    }


}
