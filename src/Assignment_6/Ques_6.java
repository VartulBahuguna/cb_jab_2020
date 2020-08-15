package Assignment_6;

import java.util.Scanner;

public class Ques_6 {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 5};
        System.out.println(order_check(ar, 0));
    }

    public static boolean order_check(int[] ar, int n)
    {
        if(n == ar.length - 1)
            return true;

        else if(ar[n] < ar[n+1])
            return order_check(ar, n+1);

        return false;
    }
}
