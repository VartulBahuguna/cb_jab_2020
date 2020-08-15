package practice;

import java.util.Arrays;
import java.util.Scanner;

public class FindingCBNumbers
{
//    public static void KotlinPrograms.main(String args[])
//    {
//        Scanner s = new Scanner(System.in);
//        String s1 = s.next();
//        String str = s.next();
//        int cnt = 0;
//        for(int i = 0; i < str.length() - 1; ++i)
//        {
//            for(int j = i + 1; j <= str.length(); ++j)
//            {
//                int t = Integer.parseInt(str.substring(i,j));
//                int check = 0;
//                for(int k = 2; k <= Math.sqrt(t); ++k)
//                {
//                    if(t % k == 0)
//                    {
//                        check = 1;
//                        break;
//                    }
//                }
//                if(check == 1)
//                {
//                    cnt++;
//                    i = j - 1;
//                    break;
//                }
//            }
//        }
//        System.out.print(cnt);
//    }
//}
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        boolean[] CBno = new boolean[1000000];

        Arrays.fill(CBno, true);
        CBno[0] = false;
        CBno[1] = false;

        for(int i = 2; i <=29; ++i)
        {
            if(CBno[i])
            {
                for(int multi = 2; i*multi <1000000; ++i)
                {
                    CBno[i*multi] = false;
                }
            }
        }
        String num = s.next();

        int j = 0;
        int cnt = 0;
//        for(int i = 1; i <= n; ++i)
//        {
//            int x = Integer.parseInt(num.substring(j,i));
//
//            if(CBno[x])
//            {
//                cnt++;
//                j = i + 1;
//                i =i+1;
//            }
//        }
        System.out.print(cnt);
    }
}