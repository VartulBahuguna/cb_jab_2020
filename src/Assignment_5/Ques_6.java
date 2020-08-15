package Assignment_5;

import java.util.Scanner;

public class Ques_6 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();

        StringBuilder str = new StringBuilder(s1);

        substrings(str);



    }
    public static void substrings(StringBuilder str)
    {
        for (int i = 0; i <str.length() ; i++) {
            for (int j = i+1; j <str.length()+1 ; j++) {
                System.out.println(str.substring(i,j));

            }

        }
    }

}
