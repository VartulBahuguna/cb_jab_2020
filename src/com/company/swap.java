package com.company;

public class swap {
    public static void main(String[] args) {
        int a = 5 , b = 6;
        System.out.println(a+" "+b);
        swap(a,b);
        System.out.println(a+" "+b);
    }
    public  static void swap (int a, int b)
    {
        int t;
        t=a;
        a=b;
        b=t;
    }

}
