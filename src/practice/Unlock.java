package practice;

import java.util.*;

public class Unlock
{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int k = s.nextInt();

        int[] a = new int[n];

        for(int i = 0; i<n; ++i)
        {
            a[i] = s.nextInt();
        }
        Integer[] t = new Integer[n];

        for(int i = 0; i<n; ++i)
        {
            t[i] = a[i];
        }

        Arrays.sort(t, Collections.reverseOrder());
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<n; ++i)
        {
            map.put(a[i],i);
        }
        int j = 0;
        while(k-- != 0)
        {
            if(j >= n)
            {
                break;
            }

            if(a[j] != t[j])
            {
                int temp = a[j];
                a[j] = a[map.get(t[j])];
                a[map.get(t[j])] = temp;

                map.put(temp, map.get(t[j]));
                map.put(a[j], j);
            }
            else
            {
                k++;
            }
            j++;
        }

        for(int i = 0; i < n; ++i)
        {
            System.out.print(a[i]  + " ");
        }
    }
}
