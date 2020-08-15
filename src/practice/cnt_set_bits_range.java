package practice;

public class cnt_set_bits_range
{
    public static void main(String[] args)
    {
        int a = -2;
        int b = 0;
        int cnt = 0;
        for(int i = a; i <= b; i++)
        {
            int k = i;
            int set_bit = 0;
            if(k>=0)
            {
               set_bit += cnt_bit(k);
            }
            else
            {
               k = ~k;
               set_bit += 32 - cnt_bit(k);
            }

            cnt = cnt + set_bit;
        }

        System.out.println(cnt);
    }

    public static int cnt_bit(int i)
    {
        int cnt = 0;
        while(i != 0)
        {
            if((i&1) == 1)
            {
                cnt++;
            }
            i = i>>1;
        }
        return cnt;
    }

}
