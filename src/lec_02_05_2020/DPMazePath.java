package lec_02_05_2020;

public class DPMazePath
{
    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        int[][] mem = new int[row + 1][col + 1];
        int[][] meme = new int[row + 1][col + 1];

        System.out.println(MazePAth(2 ,2));
        System.out.println(MazepathRecDP(row, col ,mem));
        System.out.println(MazePathitrDp(row,col,meme));

    }

    public static int MazePAth(int row, int  col)
    {
        if(row == 0 && col == 0)
        {
            return 1;
        }

        int cnt = 0;
        if(row != 0)
        {
            cnt += MazePAth(row - 1, col);
        }
        if(col != 0)
        {
            cnt += MazePAth(row, col - 1);
        }

        return cnt;


        // Alternate sol.
//        if(row == 0 || col == 0)
//        {
//            return 1;
//        }
//
//        return MazePAth(row - 1, col) + MazePAth(row, col - 1);
    }


    public static int MazepathRecDP(int row, int col, int[][] mem)
    {
        if(row == 1 || col == 1)
        {
            return 1;
        }

        if(mem[row][col] != 0)
        {
            return mem[row][col];
        }

        mem[row][col] = MazepathRecDP(row - 1, col, mem) + MazepathRecDP(row, col - 1, mem);

        return mem[row][col];
    }

    public static int MazePathitrDp(int row, int col, int[][] mem)
    {

        for (int i = 1; i <= row ; i++)
        {
            for (int j = 1; j <= col ; j++)
            {
                if(i == 1 || j == 1)
                {
                    mem[i][j] = 1;
                }
                else
                {
                    mem[i][j] = mem[i - 1][j] + mem[i][j - 1];
                }
            }
        }

        return mem[row][col];
    }


}
