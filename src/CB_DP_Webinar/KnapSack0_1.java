package CB_DP_Webinar;

public class KnapSack0_1
{
    public static void main(String[] args) {
        int[] wts = {2, 7, 3, 4};
        int[] prices = {5, 20, 20, 10};
        int N = 4;
        int W = 11;
        System.out.println(knapsack(wts, prices, W, 0));
    }

    private static int knapsack(int[] wts, int[] prices, int w, int i)
    {
        int inc = 0;
        int exc ;
        if(i == wts.length || w < 0)
        {
            return 0;
        }

        if(w-wts[i] >= 0)
        {
            inc = prices[i] + knapsack(wts, prices,  w-wts[i], i+1);
        }

        exc = knapsack(wts, prices, w, i+1);

        return Math.max(inc, exc);
    }


}
