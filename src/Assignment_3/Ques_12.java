package Assignment_3;

import java.util.Scanner;

public class Ques_12
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n1 =s.nextInt();
        int n2 = s.nextInt();
        System.out.print("LCM = " + LCM(n1,n2));

    }
    public static int LCM(int n1, int n2)
    {
        if(n2 > n1)
        {
            int c = n1;
            n1 = n2;
            n2 = c;

        }
        int i = n2;
        while(true)
        {
            if((i % n1 == 0) && (i % n2 == 0))
            {
                return i ;
            }
            i++;
        }

    }
}
