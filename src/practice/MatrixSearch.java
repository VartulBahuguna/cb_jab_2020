package practice;

import java.util.*;
public class MatrixSearch {
    public static void main(String args[]) 
	{	Scanner s = new Scanner(System.in);


		int n = s.nextInt();
		int m = s.nextInt();

		int[][] a = new int[n][m];
		for(int i = 0; i < n; ++i)
		{
			for(int j = 0; j < m; ++j)
			{
				a[i][j] = s.nextInt();
			}
		}

		int ele = s.nextInt();


		int found = 0;
		int row = 0;
		int col = m - 1;
		while(row < n && col > 0)
		{
			if(ele == a[row][col])
			{
				found = 1;
				break;
			}
			else if(ele < a[row][col])
			{
				col--;
			}
			else //if(ele > a[midR][m - 1])
			{
				row++;
			}

		}
		System.out.print(found);
    }
}