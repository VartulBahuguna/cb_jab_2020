package lec_15_03_2020;

public class unique_2
{
    public static void main(String[] args)
    {

    }


    public static void unique2(int[] ar)
    {
        int res = 0;
        for (int i = 0; i < ar.length; i++)
        {
            res = res ^ ar[i];

        }

    }

}
