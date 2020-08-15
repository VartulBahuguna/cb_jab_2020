package Assignment_8a;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Ques_7
{
    public static void main(String[] args)
    {
        int[] ar = {1, 3, 5, 7, 0};
        int[] proc = {};
        ar_tar(proc,ar,0);
    }

    public static void ar_tar(int[] proc, int[] unproc, int i)
    {
        if(arsum(proc,unproc))
        {
            System.out.println(Arrays.toString(proc) + Arrays.toString(unproc));
        }
        if(i >= unproc.length)
        {
            if(arsum(proc,unproc))
            {
                System.out.println(Arrays.toString(proc) + Arrays.toString(unproc));
            }
            return;
        }
        ar_tar(proc,unproc,i + 1);
        int[] proc1 = Arrays.copyOfRange(unproc,0,i + 1);
        int[] unproc2 = Arrays.copyOfRange(unproc,i,unproc.length);
        ar_tar(proc1,unproc2,i + 1);

    }

    public static boolean arsum(int[] ar1, int[] ar2)
    {
        int s1 = 0;
        int s2 =  0;
        for (int i = 0; i <ar1.length ; i++) {
            s1 += ar1[i];
        }
        for (int i = 0; i <ar2.length ; i++) {
            s2 += ar2[i];
        }
        return s1 == s2 ;
    }


}
