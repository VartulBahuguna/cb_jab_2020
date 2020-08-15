package Assignment_6;

import java.util.Scanner;

public class Ques_3
{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        triangle(n,1);
    }

    public static void triangle( int row, int col)
    {
        if(row == 0)
            return;

        if(col > row)
        {
            System.out.println();
            triangle(row - 1, 1);
            return;
        }
        //else {
        System.out.print("*");
        triangle(row, col + 1);
        // }
    }
}
