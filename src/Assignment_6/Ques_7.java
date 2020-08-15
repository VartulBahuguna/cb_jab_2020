package Assignment_6;

import java.util.Scanner;

public class Ques_7
{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int[] ar = {1, 2, 3, 4, 5};
        int  item = s.nextInt();
        System.out.println(item_check(ar, 0, item));
    }
    public static boolean item_check(int[] ar,int n,int item)
    {
        if(ar.length == n)
            return false;

        if(ar[n] == item)
            return true;

        return item_check(ar, n+1, item);
    }

}
