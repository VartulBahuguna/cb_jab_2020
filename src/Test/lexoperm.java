package Test;

import java.util.Scanner;

public class lexoperm
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
      //  int n = s.nextInt();
      // while(n-- != 0)
      //  {
            String str = s.nextLine();
            int[] fq = new int[26];
            fqar(str,fq);
            lecperm("", fq, str.length());
       // }

    }

    public static void fqar(String str, int[] fq)
    {
        int m = 0;
        for(int i = 0; i < str.length(); ++i)
        {
            fq[str.charAt(i) - 'a']++;
        }
    }

    public static void lecperm(String proc, int[] fq, int length)
    {
        if(length == 0)
        {
            System.out.println(proc +  " ");
            return;
        }

        for(int i = 0; i < 26; ++i)
        {
            if(fq[i]>0)
            {
                fq[i]--;
                lecperm(proc, fq, length - 1);
                lecperm(proc + (char)('a' + i), fq, length - 1);
                fq[i]++;
            }
        }
    }
}
