package Assignment_5;

import java.util.Scanner;


public class Ques_2
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String ch = s.nextLine();
        System.out.println(substring(ch));

    }
    public static int substring(String s) {
        int c = 0;
        for (int j = 0; j < s.length(); j++) {
            for (int l = j + 1; l < s.length() + 1; l++) {
                if(Ques_1.pallindrome(s.substring(j, l)))
                {
                    c++;
                }

            }
        }
        return c;
    }


}
