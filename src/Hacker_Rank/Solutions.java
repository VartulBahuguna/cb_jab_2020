package Hacker_Rank;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Solutions
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] e = new int[n];
        for (int i = 0; i < n; i++)
        {
            e[i] = s.nextInt();
        }
        int d = s.nextInt();
        System.out.println(activityNotifications(e, d));


    }
    static int activityNotifications(int[] e, int d)
    {
        int n = e.length;
        if(d>=n)
        {
            return 0;
        }
        int[] cnt = new int[201];
        int not = 0;

        for(int i = 0; i < d; ++i)
        {
            cnt[e[i]]++;
        }
        for(int i = d;i < n; ++i)
        {
            int lm = -1;
            int rm = -1;
            int acc = 0;
            for(int j = 0; j < 201; ++j)
            {
                acc += cnt[j];
                if(lm == -1 && acc >= (int)Math.floor((d+1)/2.0))
                {
                    lm = j;
                }
                if(rm == -1 && acc >= (int)Math.ceil((d+1)/2.0))
                {
                    rm = j;
                }
                if(lm != -1 && rm != -1)
                {
                    break;
                }
            }
            cnt[e[i-d]]--;
            cnt[e[i]]++;
            if((lm+rm) <= e[i])
            {
                not++;
            }
            System.out.println(lm + " " + rm);
        }
        return not;
    }
    static int activityNotifications(int[] e, int d, int x)
    {
        int not = 0;
        int n = e.length;
        if(d>= n)
        {
            return 0;
        }
        //    int[] a = Arrays.copyOfRange(e,0,n);
        // Arrays.sort(a);
        int st = 0;
//int end = d-1;

        for(int i = d; i < n; ++i)
        {
            // int[] a = Arrays.copyOfRange(e,st,end);
            // Arrays.sort(a);
            float mid = getMid(e,st,i-1);
            // if(d%2 != 0)
            // {
            //     mid = a[(st+end)/2 - 1];
            // }
            // else
            // {
            //     mid = (a[(st+end-1)/2] + a[(st+end)/2])/2 + 1;
            // }
            if(d%2 == 0 && (float)e[i] >= mid)
            {
                not++;
            }
            else if(d%2 != 0 && (float)e[i] >= 2*mid)
            {
                not++;
            }
            st++;
        }
        return not;

    }
    public static float getMid(int[] a, int i, int j)
    {
        PriorityQueue<Integer>max=new PriorityQueue<Integer>(Collections.reverseOrder());
        PriorityQueue<Integer> min =  new PriorityQueue<Integer>();
        max.add(a[i]);
        for(int k = i+1; k <= j; ++k)
        {
            if(a[k] < max.peek())
            {
                max.add(a[k]);
            }
            else
            {
                min.add(a[k]);
            }

            if(max.size() - min.size() > 1)
            {
                min.add(max.poll());
            }
            else if(min.size() - max.size() > 1)
            {
                max.add(min.poll());
            }
        }
        if(max.size() - min.size() == 1)
        {
            return max.peek();
        }
        if(min.size() - max.size() == 1)
        {
            return min.peek();
        }
        return (float)((max.peek() + min.peek()));
    }


    static int activityNotification(int[] e, int d)
    {
        int not = 0;
        int n = e.length;
        if(d>= n)
        {
            return 0;
        }
        //    int[] a = Arrays.copyOfRange(e,0,n);
        // Arrays.sort(a);
        int st = 0;
        int end = d;

        for(int i = d; i < n; ++i,end++,st++)
        {
            int[] a = Arrays.copyOfRange(e,st,end);
            Arrays.sort(a);
            int mid;
            if(d%2 != 0)
            {
                mid = a[(st+end)/2 - 1];
            }
            else
            {
                mid = (a[(st+end-1)/2] + a[(st+end)/2])/2  + 1;
            }
            if(e[i] >= 2*mid)
            {
                not++;
            }
        }
        return not;

    }

}