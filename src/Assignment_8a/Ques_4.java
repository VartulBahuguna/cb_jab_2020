package Assignment_8a;

import java.util.ArrayList;

public class Ques_4
{
    public static void main(String[] args)
    {
        System.out.println(perm("", "abc"));
        System.out.println(perm_Array("", "abc"));
    }


    public static int perm(String proc, String unproc)
    {
        int cnt = 0;
        if(unproc.isEmpty())
        {
            System.out.println(proc);
            return 1;
        }

        char ch = unproc.charAt(0);
        unproc = unproc.substring(1);
        for (int i = 0; i <= proc.length() ; i++) {
            String first = proc.substring(0, i);
            String second = proc.substring(i);
            cnt += perm(first + ch + second, unproc);
        }
        return cnt;
    }


    public static ArrayList perm_Array(String proc, String unproc)
    {
        ArrayList list = new ArrayList();
        if(unproc.isEmpty())
        {
            list.add(proc);
            return list;
        }

        char ch = unproc.charAt(0);
        unproc = unproc.substring(1);
        for (int i = 0; i <= proc.length() ; i++) {
            String first = proc.substring(0, i);
            String second = proc.substring(i);
            list.addAll(perm_Array(first + ch + second, unproc));
        }
        return list;
    }

}
