package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
       // int n=  s.nextInt();
        int year = 1920;
        if(year%4==0)
        {
            System.out.println("leap year");
        }
        else
        {
            System.out.println("Not a leap year");
        }



    }
}
