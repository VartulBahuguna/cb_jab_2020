package Assignment_5;

import java.util.Scanner;

public class Ques_3 {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        String ch1 = s.nextLine();
        StringBuilder str = new StringBuilder(ch1);

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) ('a' + (ch - 'A'));
                str.setCharAt(i, ch);

            } else {
                ch = (char) ('A' + (ch - 'a'));
                str.setCharAt(i, ch);
            }
        }
        System.out.println(str);
    }
}
