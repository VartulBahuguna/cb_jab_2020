package lec_09_02_2020.sorting;

import java.util.Arrays;
public  class selection_sort {
    public static void main(String[] args) {

        int[] ar = {5,4,3,2,1};

     selsort(ar);
        int[] x= {6,4,2,1};
        bubble_sort.bsort(x);
        System.out.println(Arrays.toString(ar));
        System.out.println(Arrays.toString(x));
    }

    public static void selsort(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            int max = max_index(ar, 0 ,ar.length-1-i);
            bubble_sort.swap(ar, max , ar.length-i-1);

        }
    }

    public static int max_index(int[] ar,int start, int end)
    {


      int max = 0;
        for (int i = start; i <= end ; i++) {
            if(ar[i]>ar[max])
            {
                max = i;
            }
        }
        return max;
    }
}
