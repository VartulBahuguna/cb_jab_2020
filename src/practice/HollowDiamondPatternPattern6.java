package practice;

import java.util.Scanner;

public class HollowDiamondPatternPattern6
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 5;
        int t = 1;
        for(int i = 1 ; i <= n; ++i)
        {
            int k = 1;
            for(int j = 1; j <= n; ++j)
            {
                if(k <= n/2 - t + 2)
                {
                    System.out.print("*" + "	");
                }
                else
                {
                    System.out.print("	");
                }
                if(j <= n/2)
                {
                    k++;
                }
                else
                {
                    k--;
                }
            }
            if(i <= n/2)
            {
                t++;
            }
            else
            {
                t--;
            }
            System.out.println();
        }
    }
    
}
