package DP;

public class COUNTPATH
{
    public static void main(String[] args)
    {
        
        System.out.println(cdp( 4));
        System.out.println(cdpItr(4));
        int[] a = new int[4+1];
        System.out.println(cdpdp(4, a));
    }

    public  static  int cdp( int total)
    {
        int sum = 0;

        if(0 == total)
        {
            return 1;
        }
        for (int dice = 1; dice < 7 && dice <= total ; dice++)
        {
            sum += cdp( total - dice);
        }
        return sum;
    }

    public static int cdpdp(int total, int[] a)
    {
        if(total == 0)
        {
            return 1;
        }

        int cnt = 0;

        if(a[total] != 0)
        {
            return a[total];
        }

        for (int i = 1; i <= 6 ; i++)
        {
            if(total - i >= 0)
            {
                cnt += cdpdp(total-i,a);
            }
            else
            {
                break;
            }
        }

        a[total] = cnt;

        return cnt;
    }


    public static int cdpItr(int end)
    {
        int[] a = new int[end + 1];

        a[end] = 1;

        for (int i = end-1; i >= 0 ; i--)
        {
            int cnt = 0;
            for (int j = 1; j <= 6 && j + i <=  end; j++) {
                cnt += a[j+i];
            }
            a[i] = cnt;
        }

        return a[0];
    }


}
