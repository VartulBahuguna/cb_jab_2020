package Assignment_3;

import java.util.Scanner;

public class Ques_7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        System.out.println("Mirror Inverse = " +  mirror_invese(n));

    }
    public static int mirror_invese(int n)
    {
        int m = 0;
        int place = 1;
        while (n != 0)
        {
            int rem = n % 10;
            m = m + place * (int)Math.pow(10,(rem-1)) ;
            n = n / 10 ;
            place++;
        }
        return m;
    }

}
