package lec_29_02_2020;

import java.util.ArrayList;

public class rec_mazepath
{
    public static void main(String[] args)
    {
        //maze_path(3,3,"");
        //System.out.println(maze_pathcnt(3,3));
        System.out.println(maze_pathlist(3,3,""));
    }


    public static int maze_path(int row, int col, String processed)
    {
        int cnt = 0;
        if(row == 1 && col == 1)
        {
            System.out.println(processed);
            return 1;
        }

        if(row > 1)
        {
            cnt += maze_path(row - 1, col, processed + "V" );
        }

        if(col > 1)
        {
            cnt += maze_path(row, col - 1 , processed + "H");
        }

        return  cnt;
    }


    public static ArrayList maze_pathlist(int row, int col, String processed)
    {

        if(row == 1 && col == 1)
        {
            ArrayList list = new ArrayList();
            list.add(processed);
            return list;
        }
        ArrayList list = new ArrayList();

        if(row > 1)
        {
            list.addAll(maze_pathlist(row - 1, col, processed + "V" ));
        }

        if(col > 1)
        {
            list.addAll(maze_pathlist(row, col - 1 , processed + "H"));
        }

        return  list;
    }


    public static int maze_pathcnt(int row, int col)
    {
        int cnt = 0;

        if(row == 1 && col == 1)
        {

            return 1;
        }

        if(row > 1)
        {
           cnt += maze_pathcnt(row - 1, col );
        }

        if(col > 1)
        {
           cnt += maze_pathcnt(row, col - 1  );
        }

        return cnt;
    }


    /*public static void maze_path(int row, int col, String processed)
    {
        if(row == 1 && col == 1)
        {
            System.out.println(processed);
            return;
        }

        if(row > 1)
        {
            maze_path(row - 1, col, processed + "V" );
        }

        if(col > 1)
        {
            maze_path(row, col - 1 , processed + "H");
        }
    }

     */

}
