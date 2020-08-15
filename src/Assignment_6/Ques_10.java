package Assignment_6;

import java.util.Scanner;

public class Ques_10
{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int[] ar = {1, 2, 4, 4, 5}; // 6, 8, 4, 5 ,45, 61, 3, 36, 45, 75, 95, 45};
      //  int  item = s.nextInt();
        System.out.println(indices(ar,4,0,0));

    }

    public static int indices(int[] ar, int n, int i, int c)
    {
        if(i == ar.length)
        {
            return c;
        }
        else if (ar[i] == n)
        {
            return(indices(ar, n, i+1, c+1));
        }

        return(indices(ar, n , i +1,c ));
    }

}
