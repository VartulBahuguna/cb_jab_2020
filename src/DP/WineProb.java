package DP;

public class WineProb
{
    public static void main(String[] args)
    {
        int[] prices = {2,3,5,1,4};

        System.out.println(rec(prices, 0, prices.length-1,1));
    }

    public static int rec(int[] a, int i, int j, int y)
    {
        //int tot = 0;
        if(i>j)
        {
            return 0;
        }

//        int t1 = a[i]*y + rec(a, i + 1, j , y +1);
//        int t2 = a[j]*y + rec(a, i, j - 1 , y +1);
         return Math.max(a[i]*y + rec(a, i + 1, j , y +1),a[j]*y + rec(a, i, j - 1 , y +1));
//        if(t1 > t2)
//        {
//            tot += (y*t1) + rec(a, i + 1, j , y +1);
//        }
//        else if(t1 < t2)
//        {
//            tot += (y*t2) + rec(a, i, j - 1 , y +1);
//        }
//        else
//        {
//            tot += (y*t2) + Math.max(rec(a, i + 1, j , y +1), rec(a, i, j - 1 , y +1));
//        }

      //  return tot;
    }

}
