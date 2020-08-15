package lec_14_03_2020;

public class bitmasking_odev
{
    public static void main(String[] args) {

        int[] ar ={1,1,2,2,3,4,3};
        System.out.println(unique(ar));
        odev(5);
        System.out.println(cntbits(5));
    }


    public static void odev(int n)
    {
        if((n & 1) == 1)
        {
            System.out.println("Odd");
        }
        else
        {
            System.out.println("Even");
        }
    }

    public static int unique(int[] ar)
    {
        int res = 0;
        for (int i = 0; i < ar.length; i++)
        {
            res = res ^ ar[i];
        }
        return res;
    }


    public static int cntbits(int n)
    {
        int cnt = 0;
        while(n != 0)
        {
            if((n&1) == 1)
            {
                cnt = cnt + 1;
            }
            n = n >> 1;

        }
        return cnt;
    }



}
