package Assignment_3;

import java.util.Scanner;

public class Ques_5 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int min = s.nextInt();
        int max = s.nextInt();
        int step = s.nextInt();
        converter(min , max, step);

    }
    public static void converter(int min, int max, int step)
    {
    //    int i ;
        for(int i = min ; i<=max ; i += step)
        {
            float c = (i - 32) *(float) 5 / 9;
            System.out.println(i + " " +  c );

        }
    }

}
