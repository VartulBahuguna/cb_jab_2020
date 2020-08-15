package lec_22_02_2020;

import java.util.Scanner;

public class rec_find_last_occurance_of_element {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] ar = new int[n];

        for (int i = 0; i <ar.length; i++) {
            ar[i] = s.nextInt();
        }

        int item = s.nextInt();

        System.out.println(last_search(ar, ar.length-1, item));

    }


    public static int last_search(int[] ar, int n, int item)
    {
        if (n<0)
            return -1;
        if(ar[n] == item)
            return n;
        return(last_search(ar , item , n-1));
    }

}
