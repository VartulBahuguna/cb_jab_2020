package lec_29_02_2020;

import java.util.ArrayList;

public class rec_nqueens
{
    public static void main(String[] args)
    {
        int n = 4;

        boolean[][] board = new boolean[n][n];

//        for (int i = 0; i < board.length ; i++) {
//            for (int j = 0; j <board[i].length ; j++) {
//                System.out.println(board[i][j]);
//            }
//
//        }
        nqueens(board, 0);
    }

  /*  public static ArrayList<String> nqueens(boolean[][] board , int row)
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

        for (int col = 0; col < board.length ; col++)
        {
            if(isSafe(board,row,col))
            {
                board[row][col] = true;
                list.addAll(nqueens(board,row + 1));
                board[row][col] = false;
            }

        }

        return list;
    }
*/
    public static void nqueens(boolean[][] board , int row)
    {
        if(row == board.length)
        {
            display(board);
            return ;
        }

        for (int col = 0; col < board.length ; col++)
        {
            if(isSafe(board,row,col))
            {
                board[row][col] = true;
                nqueens(board,row + 1);
                board[row][col] = false;
            }

        }
    }



    public static boolean isSafe(boolean[][] board, int row, int col)
    {
        for (int i = 0; i < row; i++)
        {
            if(board[i][col])
            {
                return false;
            }
        }
        int left = Math.min(row,col);

        for (int i = 1; i <= left ; i++)
        {
            if(board[row - i][col-i]){
                return false;
            }

        }
        int right = Math.min(row,board.length-1-col);

        for (int i = 1; i <= right ; i++)
        {
            if(board[row - i][col+i]){
                return false;
            }

        }
        return true;
    }


    public static void display(boolean[][] board)
    {
        for (int i = 0; i <board.length ; i++)
        {
            for (int j = 0; j <board[i].length ; j++)
            {
             if(board[i][j])
             {
                 System.out.print("Q" + " ");
             }else{
                 System.out.print("X" + " ");
             }
            }
            System.out.println();

        }
        System.out.println();
    }


}
