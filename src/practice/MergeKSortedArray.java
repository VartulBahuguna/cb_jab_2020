package practice;

import java.util.*;

public class MergeKSortedArray
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        int k = s.nextInt();
        int n = s.nextInt();
        //	ArrayList<Integer> list = new ArrayList<>();
        // for(int i = 0; i < k*n; ++i)
        // {
        //     list.add(s.nextInt());
        // }
        int[][] a = new int[k][n];
        for(int i = 0; i < k; ++i)
        {
            for(int j = 0; j < n; ++j)
            {
                a[i][j] = s.nextInt();
            }
        }

        int[] ar = divMer(a);

        // Collections.sort(list);

        // for(int i = 0; i < list.size(); ++i)
        // {
        // 	System.out.print(list.get(i) + " ");
        // }
        for(int i = 0; i < ar.length; ++i)
        {
            System.out.print(ar[i] + " ");
        }

    }

    public static int[] divMer(int[][]a)
    {
        if(a.length == 1)
        {
            return a[0];
        }

        int mid = a.length / 2;

        int[] b = divMer(Arrays.copyOfRange(a,0,mid));
        int[] c = divMer(Arrays.copyOfRange(a,mid,a.length));

        return merge(b,c);
    }

    public static int[] merge(int[] b, int[] c)
    {
        int[] d = new int[b.length + c.length];

        int k = 0;
        int i = 0;
        int j = 0;

        while(i < b.length && j < c.length)
        {
            if(b[i] < c[j])
            {
                d[k++] = b[i++];
            }
            else
            {
                d[k++] = c[j++];
            }
        }

        while(i < b.length)
        {
            d[k++] = b[i++];
        }
        while(j < c.length)
        {
            d[k++] = c[j++];
        }

        return d;
    }
}
