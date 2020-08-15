package Assignment_6;

import java.util.Scanner;

public class Ques_9 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int[] ar = {1, 2, 3, 4, 5};
        int  item = s.nextInt();
        System.out.println(item_last_index(ar, ar.length - 1, item));
    }
    public static int item_last_index(int[] ar,int n,int item)
    {
        if(ar.length == -1)
            return -1;

        if(ar[n] == item)
            return n;

        return item_last_index(ar, n - 1, item);
    }
}
