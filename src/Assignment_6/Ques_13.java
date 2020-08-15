package Assignment_6;

import java.util.Arrays;

public class Ques_13
{
    public static void main(String[] args) {
        int[] ar = {3, 2, 1, 4, 5};
        int[] a = new int[ar.length];
        inv_ar(ar, 0, a);
        Ques_12.rev_aray(a ,0);
        System.out.println(Arrays.toString(a));

    }


    public static void inv_ar(int[] ar, int i, int[] a)
    {
        if(i == ar.length)
        {
            return;
        }

        a[ar[i] - 1] = ar.length - i ;
        inv_ar(ar, i + 1, a);
    }

}
