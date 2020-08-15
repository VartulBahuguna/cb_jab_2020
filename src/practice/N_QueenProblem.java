package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class N_QueenProblem
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        boolean[][] board = new boolean[n][n];

        System.out.println(nQueen(board, 0));
    }

    public static ArrayList<String> nQueen(boolean[][] board, int row)
    {
        ArrayList<String> list = new ArrayList<>();

        if(row == board.length)
        {
            for (int i = 0; i < board.length ; i++)
            {
                for (int j = 0; j < board.length; j++)
                {
                    if(board[i][j])
                    {
                        list.add("{" + i + "-" + j + "}");
                    }
                }

            }

            return list;
        }


        for (int col = 0; col < board[row].length; col++)
        {

            if(isSafe(board, row ,col))
            {
                board[row][col] = true;
                list.addAll(nQueen(board, row + 1));
                board[row][col] = false;
            }
        }

        return list;
    }

    private static boolean isSafe(boolean[][] board, int row, int col)
    {

        for (int i = 0; i < row; i++)
        {
            if(board[i][col])
            {
                return false;
            }
        }

        int left = Math.min(row,col);

        for (int i = 1; i <= left; i++)
        {
            if(board[row - i][col - i])
            {
                return false;
            }
        }

        int right = Math.min(row, board.length- 1 - col);

        for (int i = 1; i <=  right; i++)
        {
            if(board[row - i][col + i])
            {
                return false;
            }
        }

        return true;
    }

}
