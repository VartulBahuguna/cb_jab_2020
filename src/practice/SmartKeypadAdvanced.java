package practice;

import java.util.Scanner;

public class SmartKeypadAdvanced
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        String unproc = s.nextLine();
        String str[] = { " ", ".+@$", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        String[] searchIn = { "prateek", "sneha", "deepak", "arnav", "shikha", "palak", "utkarsh",
                "divyam", "vidhi", "sparsh", "akku" };
        SmartPad("",unproc,str,searchIn);
    }

    public static void SmartPad(String proc, String unproc, String[] str, String[] searchIn)
    {
        if(unproc.isEmpty())
        {
            for(int i = 0; i < searchIn.length; ++i)
            {
                if(searchIn[i].contains(proc))
                {
                    System.out.println(searchIn[i]);
                }
            }
            return;
        }

        int n = Integer.parseInt(unproc.substring(0,1));
        unproc = unproc.substring(1);
        String temp = str[n];
        for(int i = 0; i < temp.length(); ++i)
        {
            SmartPad(proc + temp.charAt(i), unproc, str, searchIn);
        }
    }

}
