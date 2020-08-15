package lec_15_03_2020;

public class magic_no
{
    public static void main(String[] args)
    {
        System.out.println(magicno(7));
    }


    public static int magicno(int n)
    {
        int pow = 1;
        int ans = 0;
        while(n != 0)
        {
            pow = pow * 5;
            if((n&1) == 1)
            {
                ans = ans + pow;
            }
            n = n >> 1;

        }
        return ans;

    }

}
