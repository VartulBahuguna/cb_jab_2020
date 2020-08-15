package lec_8_02_2020;

import java.util.Scanner;

public class desc_to_binary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int desc = s.nextInt();
        System.out.println(desc2bin(desc));

    }
    public static long desc2bin(int n)
    {
        long bin = 0;
        while(n!=0)
        {
            int rem = n % 2;
            bin = bin + rem * 10 ;
            n = n / 2;
        }
        return bin ;
    }

}
