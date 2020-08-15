package CodeSule.July2020;

import java.util.Arrays;
import java.util.Scanner;

public class BUSANDFUEL
{
    static class Pair
    {
        int f;
        int d;
//
//        public Pair(int f, int d)
//        {
//             f = this.f;
//             d = this.d;
//        }

        @Override
        public String toString() {
            return "Pair{" +
                    "f=" + f +
                    ", d=" + d +
                    '}';
        }
    }
    public static void main (String args[])
    {
        Scanner s = new Scanner(System.in) ;

        int n = s.nextInt();

        Pair[] a = new Pair[n];

        for(int i = 0; i < n; ++i)
        {
            Pair temp = new Pair();
            temp.f = s.nextInt();
            temp.d = s.nextInt();
            a[i] = temp;
        }
        int found = -1;
        for(int i = 0; i < n; ++i)
        {
            int t = 0;
            int tank = 0;
            int start = i;
            while(t<n)
            {
                tank += a[i].f;
                int dist = a[i].d;
                if(tank >= dist)
                {
                    tank -= dist;
                }
                else
                {
                    break;
                }
                start = (start+1) % n;
                t++;
            }

            if(t >= n)
            {
                found = i;
                break;
            }
        }

        System.out.print(found);
        System.out.println(Arrays.toString(a));
    }
}
