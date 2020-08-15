package practice;

import java.util.*;
public class SnakeandLaddersBoardBFS
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        while(t-- != 0)
        {
            HashMap<Integer, sedi> l = new HashMap<>();
            HashMap<Integer, sanp> sn = new HashMap<>();
            int cell = s.nextInt();
            int ladder = s.nextInt();
            int snake = s.nextInt();


            for(int i =0; i < ladder; ++i)
            {
                int start = s.nextInt();
                int end = s.nextInt();

                l.put(start, new sedi(start, end));
            }

            for(int i = 0; i < snake; ++i)
            {
                int start = s.nextInt();
                int end = s.nextInt();
                sn.put(start, new sanp(start, end));
            }

            int pos = 1;
            int minCnt = 0;
            while(pos < cell)
            {
                int maxlad = 0;
                for(int i = 1; i <= 6; ++i)
                {
                    if(l.containsKey(pos + i))
                    {
                        maxlad = pos + i;
                    }
                }
                if(maxlad == 0)
                {
                    for(int i = 6; i >= 1; --i)
                    {
                        if(!sn.containsKey(pos + i))
                        {
                            pos = pos + i;
                            minCnt++;
                            break;
                        }
                    }
                }
                else
                {
                    pos = l.get(maxlad).dest;
                    minCnt++;
                }
            }

            System.out.println(minCnt);

        }
    }

    static class sedi
    {
        int start;
        int dest;
        int steps;
        sedi(int start, int dest)
        {
            this.start = start;
            this.dest = dest;
            this.steps = dest - start;
        }
    }

    static class sanp
    {
        int beg;
        int end;
        int down;
        sanp(int beg, int end)
        {
            this.beg = beg;
            this.end = end;
            this.down = beg - end;
        }
    }
}