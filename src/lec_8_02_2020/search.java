package lec_8_02_2020;

public class search {
    public static void main(String[] args) {
        int [] ar = {1,2,3,4,5};
        System.out.println(lsearch(ar, 3));

    }
    public static int lsearch(int[] ar, int item )
    {
        for (int i = 0; i < ar.length-1; i++) {
            if(ar[i] == item)
            {
                return i;
            }

        }
        return -1;
    }
    public static int bsearch(int[] ar , int item)
    {
        int start = 0 , end = ar.length-1;
        int mid = (start + end) / 2;
        while(start <= end)
        {
            if( ar[mid] == item)
            {
                return mid;
            }
            else if(ar[mid] >item)
            {
                start = mid + 1;

            }
            else
            {
                end = mid -1;

            }
            mid = (start + end) / 2;
        }
        return -1;
    }

}
