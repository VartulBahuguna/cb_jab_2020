package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class AllIndicesProblem
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] ar = new int[n];

        for(int i = 0; i < n; ++i)
        {
            ar[i] = s.nextInt();
        }

        int m = s.nextInt();


        ar = indiceAt(ar, m,0, 0);


        for (int i = 0; i < ar.length; i++)
        {
            System.out.print(ar[i] + " ");
        }
    }

    public static int[] indiceAt(int[] ar, int m, int index, int mcnt)
    {

        if(ar.length == index)
        {
            return new int[mcnt];
        }

        if(ar[index] == m)
        {
            int[] finalAr = indiceAt(ar, m, index + 1, mcnt + 1);
            finalAr[mcnt] = index;
            return finalAr;
        }

        return indiceAt(ar, m, index + 1, mcnt);

    }
}
