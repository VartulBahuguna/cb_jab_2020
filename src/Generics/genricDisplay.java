package Generics;

public class genricDisplay
{
    public static void main(String[] args)
    {
        Integer[] a = {5,4,3,2,1};

        String[] str = {"hello", "hi", "byebye", "chalo", "Niklo"};
        display(a);
        display(str);

        CAR[] car = new CAR[5];

        car[0] = new CAR(100, 1000, "Red");
        car[1] = new CAR(2000, 200, "Yello");
        car[2] = new CAR(500, 900, "Black");
        car[3] = new CAR(300, 30, "Grey");
        car[4] = new CAR(700, 60, "White");

        bsort(car);
        display(car);



    }

//    private static void display(int[] a)
//    {
//        for (int i : a)
//        {
//            System.out.println(i + " ");
//        }
//          System.out.println();
//    }
//
//    private static void display(String[] str)
//    {
//        for (String i : str)
//        {
//            System.out.print(i + " ");
//        }
//          System.out.println();
//    }

    private static<T> void display(T[] gern)
    {
        for (T i : gern)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static<T extends Comparable<T>> void bsort(T[] ar)
    {
        for (int i = 0; i < ar.length-1; i++)
        {
            for (int j = 0; j < ar.length-i-1; j++)
            {
                if (ar[j].compareTo(ar[j+1]) > 0)
                {
                    swap(ar,j,j+1);
                }
            }

        }
    }

    public static<T> void swap(T[] ar, int i , int j) {
        T t = ar[i];
        ar[i] = ar[j];
        ar[j] = t;
    }
}
