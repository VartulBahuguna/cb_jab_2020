package practice;

import java.util.Scanner;

public class SmartKeypadI
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        String unproc = s.nextLine();
        String table[] = { " ", ".+@$", "abc", "def", "ghi", "jkl" , "mno", "pqrs" , "tuv", "wxyz" };
        Smartkeypad("",unproc,table);
    }

    public static void Smartkeypad(String proc, String unproc,String[] table)
    {
        if(unproc.isEmpty())
        {
            System.out.println(proc);
            return;
        }

        int n = Integer.parseInt(unproc.substring(0,1));
        String temp = table[n];
        unproc = unproc.substring(1);
        for(int i = 0; i < temp.length(); ++i)
        {
            Smartkeypad(proc + temp.charAt(i), unproc,table);
        }
    }
}
