package practice;

import java.util.Scanner;

public class MaximumXORSubarray
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int temp = s.nextInt();
        int xorsf = temp;
        int max_xor = temp;
        for(int i = 1; i < n; ++i)
        {
            temp = s.nextInt();

            xorsf = (xorsf^temp);
            if(xorsf < temp)
            {
                xorsf = temp;
            }
            if(xorsf > max_xor)
            {
                max_xor = xorsf;
            }
        }

        System.out.print(max_xor);
    }
}
