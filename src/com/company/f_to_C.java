package com.company;

import java.util.Scanner;

 public class f_to_C {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        System.out.print(converter(t));

    }
    static float converter(float f)
    {
       float c = ( f - 32 ) * 5 / 9 ;

       return c ;
    }
}

