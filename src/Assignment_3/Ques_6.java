package Assignment_3;

import java.util.Scanner;

public class Ques_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int dig = s.nextInt();
        System.out.println("No. of times digit occured = " + dig_count(num , dig));
    }
    public static int dig_count(int num , int dig)
    {
        int c = 0;
        while (num!=0)
        {
            int rem = num % 10 ;
            if(rem == dig)
                c++;
            num = num / 10;


        }
        return c ;
    }

}
