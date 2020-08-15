package FANG_DP;

public class BitonicSubSeq
{
    public static void main(String[] args)
    {
        int[] a = {4, 5, 6, 3, 2, 7, 8, 5, 4, 6, 3};
        System.out.println(Bitonic_SubSeq(a));
    }

    public static int Bitonic_SubSeq(int[] a)
    {
        int n = a.length;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = 1;
        right[n-1] = 1;
        for (int i = 1; i < n; i++)
        {
            int x = 1;
            for (int j = i-1; j >= 0; j--)
            {
                if(a[j]<a[i])
                {
                    x = Math.max(x,left[j] + 1);
                }
            }
            left[i] = x;
        }

        for (int i = n-2; i >=0 ; i--)
        {
            int x = 1;
            for (int j = i+1; j < n; j++)
            {
                if(a[j]<a[i])
                {
                    x = Math.max(x,right[j] + 1);
                }
            }
            right[i] = x;
        }

        int ans = 1;
        for (int i = 0; i < n; i++)
        {
            ans = Math.max(ans, left[i]+right[i]-1);
        }

        return  ans;
    }

}




