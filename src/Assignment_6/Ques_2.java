package Assignment_6;

import java.util.Scanner;

public class Ques_2
{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

       // int n = s.nextInt();
        triangle(5,0,0);
    }

    public static void triangle(int n, int row, int col)
    {
        if(row == n)
            return;

        if(col > row)
        {
            System.out.println();
            triangle(n, row + 1, 0 );
            return;
        }
        //else {
            System.out.print("*");
            triangle(n, row, col + 1);
       // }
    }
}
