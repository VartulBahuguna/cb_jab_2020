package practice;

import java.util.Scanner;

public class StringsStringCompression
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        String unproc = s.nextLine();
//        int cnt = 1;
//        String proc = unproc.substring(0,1);
//        int j = 0;
//        for (int i = 1; i < unproc.length(); i++) {
//            if(proc.charAt(proc.length() - 1) == unproc.charAt(i))
//            {
//                cnt++;
//            }
//            else
//            {
//                if(cnt == 1)
//                {
//                    proc += unproc.charAt(i);
//
//                }
//                else
//                {
//                    proc += cnt + unproc.charAt(i);
//
//                }
//                cnt = 1;
//            }
//        }
//        if(cnt != 1)
//        {
//            proc += unproc.charAt(unproc.length() - 1);
//        }
//        System.out.println(proc);
        concat(unproc.substring(0,1),unproc.substring(1),1);
    }

    public static void concat(String proc, String unproc, int cnt)
    {
        if(unproc.isEmpty())
        {
            if(cnt != 1)
            {
                System.out.print(proc + cnt);
            }
            else
            {
                System.out.print(proc);
            }

            return;
        }
        if(unproc.charAt(0) == proc.charAt(proc.length() - 1))
        {
            concat(proc, unproc.substring(1),cnt + 1);
        }
        else
        {
            if(cnt != 1)
            {
                concat(proc + cnt + unproc.charAt(0),unproc.substring(1),1);
            }
            else
            {
                concat(proc + unproc.charAt(0),unproc.substring(1),1);
            }
        }
    }
}
