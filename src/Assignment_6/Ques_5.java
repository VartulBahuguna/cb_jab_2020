package Assignment_6;

import java.util.Scanner;

public class Ques_5
{
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(nth_tri(n));
    }
    public static int nth_tri(int n)
    {
        if(n == 1)
            return n;
        return(n + nth_tri(n - 1));

    }

}
