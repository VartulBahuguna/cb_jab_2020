package Hacker_Rank;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.*;

public class LilysHomework
{
    static int lilysHomework(int[] a)
    {
        int n = a.length;

        int minSwap = 0;
        int maxSwap = 0;

        int[] min = Arrays.copyOfRange(a,0,n);
        int[] max = Arrays.copyOfRange(a,0,n);
        int[] tmin = Arrays.copyOfRange(a,0,n);
        int[] tmax = Arrays.copyOfRange(a,0,n);
        HashMap<Integer,Integer> minmap = new HashMap<>();
        HashMap<Integer,Integer> maxmap = new HashMap<>();
        // minmap.put(a[0],0);
        // maxmap.put(a[0],0);
        Arrays.sort(tmin);
        Arrays.sort(tmax);
        int x  = 0;
        int y = n-1;
        while(x<y)
        {
            int temp = tmax[x];
            tmax[x] = tmax[y];
            tmax[y] = temp;
            x++;
            y--;
        }
        System.out.println(Arrays.toString(tmax));
        for(int i = 0; i < n; ++i)
        {
            minmap.put(a[i],i);
            maxmap.put(a[i],i);
        }

        for(int i = 0; i < n; ++i)
        {
            if(min[i] != tmin[i])
            {
                int tempidx = minmap.get(tmin[i]);
                int temp = min[i];
                min[i] = min[tempidx];
                min[tempidx] = temp;
                minmap.put(min[tempidx],tempidx);
                minmap.put(min[i],i);
                minSwap++;
            }
        }
        for(int i = 0; i < n; ++i)
        {
            if(max[i] != tmax[i])
            {
                int tempidx = maxmap.get(tmax[i]);
                int temp = max[i];
                max[i] = max[tempidx];
                max[tempidx] = temp;
                maxmap.put(max[tempidx],tempidx);
                maxmap.put(max[i],i);
                maxSwap++;
            }
        }

        return Math.min(maxSwap, minSwap);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i <n ; i++) {
            a[i] = s.nextInt();
        }

        System.out.println(lilysHomework(a));
    }

}
