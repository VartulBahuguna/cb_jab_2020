package Assignment_4;

import java.util.Scanner;

public class Ques_17 {
    public static void main(String[] args) {
        int[][] a = new int[3][3] ;
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a.length; j++) {

                a[i][j] = s.nextInt();
            }

        }

        for (int i = 0; i < a.length; i++)
        {
            if(i%2==0)
            { for (int j = 0; j < a[1].length; j++)
            {
                System.out.println(a[i][j]);
            }
            }
            else
            {
                for (int j = a[i].length - 1; j >= 0; j--)
                {
                    System.out.println(a[i][j]);
                }
            }

        }
    }
}

