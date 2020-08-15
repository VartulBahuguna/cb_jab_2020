package Test;

import java.util.Scanner;

public class PhilalandCoin
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        while(t-- != 0)
        {
            int n = s.nextInt();

            int i =1;
            int sum = 0;
            for (i = 1; sum < n; i++) {
                sum += i;

            }

            System.out.println(i-1);
        }
    }
}
