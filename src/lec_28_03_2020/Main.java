package lec_28_03_2020;

public class Main
{
    public static class Simple
    {
        int a, b , c;
        void simple()
        {
            a = 20;
            b = 10;
            c = 40;
        }
        void add()
        {
            c = a + b;
            System.out.println("sum = " + c);
        }
    }

    public static void main(String[] args)
    {
        Simple obj = new Simple();
       // obj.a = 10;
        //obj.b = 20;

        obj.add();
        System.out.println("Sum = " + obj.c);
        Simple obj1 = new Simple();
        System.out.println(obj1.a);
        //System.out.println();
    }

}
