import java.util.*;
public class RatChasesitscheese{
  public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int m = s.nextInt();

        char[][] board = new char[n][m];

        for(int i = 0; i < n; ++i)
        {
            String str = s.next();
            for(int j = 0; j < str.length(); ++j)
            {

                char ch = str.charAt(j);
                if(ch == 'O')
                {
                    board[i][j] = ch;
                }
                else
                {
                    board[i][j] = ch;
                }
            }
        }



        if(!maze(board,0,0,n,m))
        {
            System.out.println("NO PATH FOUND");
        }
    }


    public static boolean maze(char[][] board, int row, int col, int n, int m)
    {

        if((row == n - 1  && col == m - 1 ))
        {
                board[n - 1][m - 1] = 'Y';
                display(board, n, m);
                return true;
        }

        if( row == n || col == m || row < 0 || col < 0)
        {
            return false;
        }
        if(board[row][col] == 'O')
        {
            board[row][col] = 'Y';
            if(maze(board, row, col + 1, n, m))
            {
                return true;
            }

            if(maze(board, row + 1, col, n, m))
            {
                return true;
            }
			if(maze(board, row, col - 1, n, m))
            {
                return true;
            }

            if(maze(board, row - 1, col, n, m))
            {
                return true;
            }
            board[row][col] = 'O';
        }
        return false;
    }

    private static void display(char[][] board,int n, int m)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(board[i][j] == 'Y')
                {
                    System.out.print("1 ");
                }
                else
                {
                    System.out.print("0 ");
                }

            }

            System.out.println();
        }
        System.out.println();
    }
}