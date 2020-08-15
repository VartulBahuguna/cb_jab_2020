package practice;

import java.util.*;

public class TrickyPermutations
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();
        char[] tempArray = str.toCharArray();

        Arrays.sort(tempArray);

        str = new String(tempArray);
        System.out.println(str);

        permut("", str);
    }
    static Set<String> set = new HashSet<>();
    public static void permut(String proc, String unproc)
    {

        if(unproc.isEmpty())
        {
            if(!set.contains(proc))
            {
                System.out.println(proc);
                set.add(proc);
            }
            return;
        }

        char ch = unproc.charAt(0);
        unproc = unproc.substring(1);

        for (int i = 0; i <= proc.length() ; i++)
        {
            String first = proc.substring(0 , i);
            String second = proc.substring(i);

            permut(second + ch + first, unproc);
        }
    }
}
