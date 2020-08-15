package practice;

import java.util.*;

public class MaximumCircles
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        BegEnd[] circles = new BegEnd[n];
        for(int i = 0; i < n; ++i)
        {
            int pt = s.nextInt();
            int rad = s.nextInt();
            circles[i] = new BegEnd();
            circles[i].beg = pt - rad;
            circles[i].end = pt + rad;
        }

        Arrays.sort(circles);

        int maxCircl = 1;

        int cur = circles[0].end;

    //    display(circles);

        for (int i = 1; i < circles.length ; i++) {
            if(cur <= circles[i].beg)
            {
                maxCircl++;
                cur = circles[i].end;
            }
        }

        System.out.println(n - maxCircl);
    }


    public static void display(BegEnd[] a)
    {
        for (int i = 0; i < a.length ; i++)
        {
            System.out.println(a[i].beg + " " + a[i].end);
        }
    }


    static class BegEnd implements Comparable<BegEnd>
    {
        int beg;
        int end;

        @Override
        public int compareTo(BegEnd o) {
            if(o.end == this.end)
            {
                return (o.beg - this.beg);
            }
            return (this.end - o.end);
        }
    }
}
