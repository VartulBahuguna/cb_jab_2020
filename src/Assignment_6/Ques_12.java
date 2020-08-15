package Assignment_6;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import lec_22_02_2020.rec_bubble_sort;

//import static com.sun.tools.javac.jvm.ByteCodes.swap;

public class Ques_12
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int[] ar = {1, 2, 3, 3, 2, 2};
        int n = s.nextInt();
        rev_aray(ar, 0);
        System.out.println(Arrays.toString(ar));

    }


    public static void rev_aray(int[] ar, int i)
    {
        if(i == ar.length / 2)
        {
            return;
        }

        rec_bubble_sort.swap(ar, i, ar.length -1 -i);
        rev_aray(ar,i + 1);
    }
}
