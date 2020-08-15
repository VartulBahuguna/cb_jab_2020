package practice;

import java.util.Scanner;

public class KnapSack01
{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int S = s.nextInt();
        int[][] mem = new int[n][S];

        bag[] ks = new bag[n];

        for(int i = 0; i < n; ++i)
        {
            ks[i] = new bag();
            ks[i].size = s.nextInt();
        }
        for(int i = 0; i < n; ++i)
        {
            ks[i].value = s.nextInt();
        }

        System.out.print(findMax(ks, S, 0,mem));
    }

    public static int findMax(bag[] ks, int S, int i,int[][] mem)
    {
        int sum = 0;

        if(i == ks.length||S == 0)
        {
            return 0;
        }
        if(mem[i][S - 1] != 0)
        {
            return mem[i][S -1];
        }
        else if(ks[i].size > S)
        {
            sum = findMax(ks,S, i +1,mem);
        }
        else
        {
            int temp1 = findMax(ks, S-(ks[i].size), i + 1,mem) + ks[i].value;
            int temp2 = findMax(ks,S, i +1,mem);
            sum = Math.max(temp1,temp2);
        }
        mem[i][S-1] =  sum;
        return mem[i][S-1];
    }

    static class bag
    {
        int value;
        int size;
    }
}
