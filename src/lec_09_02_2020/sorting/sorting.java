package lec_09_02_2020.sorting;

public class sorting {

    public static void main(String[] args)
    {
        int ar[] = {5,4,3,2,1};
        int a[] = {5,4,3,2,1};
        int x[] = {5,4,3,2,1};
        bsort(ar);
        selsort(a);
        insertion(x);
    }
    public static void bsort(int[] ar)
    {
        for (int i = 0; i < ar.length-1; i++)
        {
            for (int j = 0; j < ar.length-i-1; j++)
            {
                if (ar[j] > ar[j+1])
                {
                    swap(ar,j,j+1);
                }
            }

        }
    }
    public static void swap(int[] ar, int i , int j)
    {
        int t = ar[i];
        ar[i] = ar[j];
        ar[j] = t;
    }
    private static void selsort(int[] ar)
    {
        for (int i = 0; i < ar.length; i++)
        {
            int max = max_index(ar, 0 ,ar.length-1-i);
            swap(ar, max , ar.length-i-1);

        }
    }
    public static int max_index(int[] ar,int start, int end)
    {


        int max = 0;
        for (int i = start; i <= end ; i++)
        {
            if(ar[i]>ar[max])
            {
                max = i;
            }
        }
        return max;
    }
    private static void insertion(int[] ar)
    {
        for (int i = 0; i <ar.length-1 ; i++)
        {
            for (int j = i+1; j > 0 ; j--)
            {
                if(ar[j]<ar[j-1])
                {
                    swap(ar,j,j-1);
                }
                else
                    break;

            }


        }
    }
}
