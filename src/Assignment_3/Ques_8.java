package Assignment_3;

import java.util.Scanner;

public class Ques_8
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        //int k = mirror_inverse_check(n);
        if(mirror_inverse_check(n) == 1)
            System.out.println("Mirror Inverse ");
        else
            System.out.println("Not a Mirror Inverse");
    }

        public static int mirror_inverse_check(int n)
        {
            int m = 0;
            int s1 = 1;
            int n1 = n ;
            while (n != 0)
            {
                int rem = n % 10;
                m = m + s1 * (int) Math.pow(10, (rem - 1));
                n = n / 10;
                s1++;
            }
            if(m == n1)
                return 1;
            else
                return 0;
        }


}
