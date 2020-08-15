package practice;

import java.util.Scanner;

public class ClassAssignment
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        int i = 1;

        while(t-- != 0)
        {
            int n = s.nextInt();
            System.out.println("#" + i++ + " : " + findNum("", n));
        }
    }

    public static int findNum(String proc, int n)
    {
        int cnt = 0;
        if(proc.length() == n)
        {
            //		System.out.println(proc);
            return 1;
        }

        cnt += findNum(proc + "a", n);

        if(proc.length() == 0)
        {
            cnt += findNum(proc + "b", n);
        }
        else if(proc.charAt(proc.length() - 1) != 'b')
        {
            cnt += findNum(proc + "b", n);
        }

        return cnt;
    }
}
