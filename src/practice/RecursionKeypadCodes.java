package practice;

import java.util.Scanner;

public class RecursionKeypadCodes
{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        String num = s.nextLine();
        keppad("", num);

    }

    public static void keppad(String proc, String unproc)
    {
        if(unproc.length() == 0)
        {
            System.out.println(proc);
            return;
        }


        int num = Integer.parseInt(unproc.substring(0,1));

        unproc = unproc.substring(1);

        for(int i = (num - 1) * 3; i < num * 3; ++i)
        {
            if(i > 25)
            {
                continue;
            }

            keppad(proc + (char)('a' + i), unproc);
        }
    }

}
