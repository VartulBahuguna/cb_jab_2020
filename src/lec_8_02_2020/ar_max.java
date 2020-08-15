package lec_8_02_2020;

import java.util.Scanner;

public class ar_max {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] ar = new int[5];
        for (int i = 0; i < 5; i++) {
            ar[i] = s.nextInt();
        }
//        int max = ar[0];
//        int j = 0;
//        for(int i = 1 ; i < 5 ; ++i)
//        {
//            if(ar[i] > max) {
//                max = ar[i];
//                j = i;
//            }
//        }
//        System.out.println(max);
//        System.out.println(j);
        System.out.println(maxElement(ar));
    }
    public static int maxElement(int[] ar)
    {
        int max = ar[0];
        for (int i = 1; i < ar.length; i++) {
            if(ar[i]>max)
                max = ar[i];

        }
        return max;
    }
    public static int maxIndex(int[] ar)
    {
        int maxindex = 0;
        for (int i = 1; i < ar.length; i++) {
            if (ar[i] > ar[maxindex]) {
                maxindex = i;
            }

        }
        return maxindex;

    }
    public static void swap(int[] ar) {
        int t = ar[0];
        ar[0] = ar[1];
        ar[1] = t;
    }

}
