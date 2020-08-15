package Assignment_3;

import java.util.Scanner;

public class Ques_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int  n = s.nextInt();
        //int oct = 0;
        //int x = 1 ;
        long desc = 0;
        int y = 1;
        while(n!=0)
        {
            int rem = n % 8;

        while(rem!=0)
        {
            int rem1 = rem % 2 ;
            desc = desc + y * rem1;
            y = y * 10;
            rem = rem / 2;
        }
            //oct = oct + rem * x ;
            n = n / 8;
            //x = x * 10;
        }

        System.out.println(desc);
    }
}
