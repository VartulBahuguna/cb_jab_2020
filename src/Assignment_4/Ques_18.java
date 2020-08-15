package Assignment_4;

import javax.swing.*;
import java.util.Scanner;

public class Ques_18 {
    public static void main(String[] args) {
        int[][] a = new int[3][3] ;
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a.length; j++) {

                a[i][j] = s.nextInt();
            }

        }

        for (int j = 0; j < a.length; j++)
        {
            if(j%2==0)
            { for (int i = 0; i < a[j].length; i++)
                {
                System.out.println(a[i][j]);
                }
            }
            else
            {
                for (int i = a[j].length - 1; i >= 0; i--)
                {
                    System.out.println(a[i][j]);
                }
            }

        }
    }
}
