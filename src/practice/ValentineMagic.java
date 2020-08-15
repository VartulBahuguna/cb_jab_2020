package practice;

import java.util.Arrays;
import java.util.Scanner;

public class ValentineMagic
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        int boys = s.nextInt();
        int girls = s.nextInt();

        int[] choco = new int[boys];
        int[] candy = new int[girls];

        int[][] mem = new int[boys][girls];

        for(int i = 0; i < boys; ++i)
        {
            choco[i] = s.nextInt();
        }
        for(int i = 0; i < girls; ++i)
        {
            candy[i] = s.nextInt();
        }
        Arrays.sort(choco);
        Arrays.sort(candy);

        System.out.print(Valentine(choco, candy, 0, 0,mem));

    }

    public static int Valentine(int[] choco, int[] candy,int boy, int girl,int[][] mem)
    {
        if(boy == choco.length)
        {
            return 0;
        }
        if(girl == candy.length)
        {
            return 100000000;
        }
        if(mem[boy][girl] != 0)
        {
            return mem[boy][girl];
        }

        int pair = Math.abs(choco[boy] - candy[girl]);

        mem[boy][girl] = Math.min(Valentine(choco,candy,boy + 1, girl + 1,mem) + pair,
                Valentine(choco,candy,boy, girl + 1,mem));
        return mem[boy][girl];

    }
}
