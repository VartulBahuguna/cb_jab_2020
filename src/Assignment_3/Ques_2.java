package Assignment_3;

import java.util.Scanner;

public class Ques_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int  n = s.nextInt();
        int oct = 0;
        int x = 1 ;
        while(n!=0)
        {
            int rem = n % 8;
            oct = oct + rem * x ;
            n = n / 8;
            x = x * 10;
        }
        System.out.println(oct);
    }
}
