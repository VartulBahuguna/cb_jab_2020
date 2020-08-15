package Assignment_5;

import java.util.Scanner;

public class Ques_4 {
    public static void main(String[] args) {


        Scanner s = new Scanner((System.in));
        String str = s.nextLine();

        StringBuilder s1 = new StringBuilder(str);

        update(s1);
        //StringBuilder s2 = new StringBuilder();

      /*  for (int i = 0; i < s1.length() ; i++) {
            if(i%2 == 0)
                s1.replace(i,i+1, String.valueOf((char)(str.charAt(i) + 1))) ;
                //s2.append((char)(str.charAt(i) + 1));
                else
                //s2.append((char)(str.charAt(i) - 1));
                s1.replace(i,i+1, String.valueOf((char)(str.charAt(i) - 1))) ;
        }*/

        System.out.println(s1);
    }
    public static void update(StringBuilder s1)
    {
        for (int i = 0; i < s1.length() ; i++) {
            if(i%2 == 0)
                s1.replace(i,i+1, String.valueOf((char)(s1.charAt(i) + 1))) ;
                //s2.append((char)(str.charAt(i) + 1));
            else
                //s2.append((char)(str.charAt(i) - 1));
                s1.replace(i,i+1, String.valueOf((char)(s1.charAt(i) - 1))) ;
        }

    }



}
