package Assignment_4;

import java.util.Scanner;

public class Ques_19 {
    public static void main(String[] args)
    {
        int[][] a = new int[3][3] ;
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a.length; j++) {

                a[i][j] = s.nextInt();
            }

        }
        int left = 0, right = a[0].length-1, top = 0, bottom = a.length-1;
        while(left<=right && top<=bottom)
        {
            for (int i = top; i <= bottom; i++)
            {
                System.out.println(a[i][left]);
            }
            left++;
            for (int i = left; i <= right; i++) {
                System.out.println(a[bottom][i]);

            }
            bottom--;
            for (int i = bottom; i >= top; i--) {

                System.out.println(a[i][right]);

            }
            right--;
            for (int i = right; i >= left; i--) {
                System.out.println(a[top][i]);

            }
            top++;
        }
    }
}
