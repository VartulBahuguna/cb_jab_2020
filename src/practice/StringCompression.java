package practice;

import java.util.Scanner;

public class StringCompression
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        String unproc = s.nextLine();
        concat(unproc.substring(0,1),unproc.substring(1),1);
    }

    public static void concat(String proc, String unproc, int cnt)
    {
        if(unproc.isEmpty())
        {
            System.out.print(proc + cnt);
            return;
        }
        if(unproc.charAt(0) == proc.charAt(proc.length() - 1))
        {
            concat(proc, unproc.substring(1),cnt + 1);
        }
        else
        {
            concat(proc + cnt + unproc.charAt(0),unproc.substring(1),1);
        }
    }
}
