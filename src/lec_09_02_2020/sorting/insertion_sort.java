package lec_09_02_2020.sorting;

import java.util.Arrays;

public class insertion_sort {
    public static void main(String[] args) {
        int ar[]  = {5,4,3,2,1};
       insertion(ar);
        System.out.println(Arrays.toString(ar));

    }

    private static void insertion(int[] ar) {
        for (int i = 0; i < ar.length-1 ; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if(ar[j]<ar[j-1])
                {
                    bubble_sort.swap(ar,j,j-1);
                }
                else
                    break;

            }
        }
    }
}
