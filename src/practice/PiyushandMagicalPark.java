package practice;

import java.util.Scanner;

public class PiyushandMagicalPark
{
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();
        int k = scn.nextInt();
        int s = scn.nextInt();

        char[][] park = new char[n][m];

        for(int i = 0; i < n; ++i)
        {
            for(int j = 0; j < m; ++j)
            {
                park[i][j] = scn.next().charAt(0);
            }
        }

        boolean strengthCheck = false;

        for(int i = 0; i < n; ++i)
        {
            for(int j = 0; j < m; ++j)
            {
                if(s < k)
                {
                    strengthCheck = true;
                    break;
                }
                char ch = park[i][j];
                if(ch == '#')
                {
                    break;
                }
                else if(ch == '.')
                {
                    s -= 2;
                }
                else if(ch == '*')
                {
                    s += 5;
                }

                if(j != park[i].length - 1)
                {
                    s--;
                }
            }

        }

        if(strengthCheck)
        {
            System.out.print("No");
        }
        else
        {
            System.out.print("Yes\n" + s);
        }
    }
}
