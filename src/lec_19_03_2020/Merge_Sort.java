package lec_19_03_2020;

import java.util.Arrays;

public class Merge_Sort
{
    public static void main(String[] args)
    {
        int[] ar = {3,2,6,4,8};

        System.out.println(Arrays.toString(divide(ar)));
        System.out.println(Arrays.toString(ar));

    }

    public static int[] divide(int[] ar)
    {
        if(ar.length == 1)
        {
            return ar;
        }

        int mid = ar.length / 2;

        int[] first = divide(Arrays.copyOfRange(ar, 0, mid));
        int[] second = divide(Arrays.copyOfRange(ar, mid, ar.length));

        return merge(first, second);
    }

    public static int[] merge(int[] first, int[] second)
    {
        int mix[] = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < first.length && j < second.length)
        {
            if(first[i] < second[j])
            {
                mix[k++] = first[i++];
            }

            else
            {
                mix[k++] = second[j++];
            }
        }
        while(i < first.length)
        {
            mix[k++] = first[i++];
        }
        while(i < second.length)
        {
            mix[k++] = second[j++];
        }

        return mix;
    }


}
