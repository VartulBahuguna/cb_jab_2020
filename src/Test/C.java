package Test;

import java.util.Scanner;

public class C
{
    public static void main(String[] args) {
        Scanner  s = new Scanner(System.in);
        A a = new B();
        a.fun();
        a.hlo();
        String str = s.nextLine();
        String str2 = s.nextLine();
        System.out.println(str.length());
        System.out.println((str2.length()));
    }

}
