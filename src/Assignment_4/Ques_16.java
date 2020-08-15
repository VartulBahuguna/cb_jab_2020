package Assignment_4;



import java.util.Scanner;

public class Ques_16 {
    public static void main(String[] args) {
//        int[][] a = new int[3][3] ;
//        Scanner s = new Scanner(System.in);
//        for (int i = 0; i < a.length ; i++) {
//            for (int j = 0; j < a.length; j++) {
//
//                a[i][j] = s.nextInt();
//            }
//
//        }
        int a[] = {1,2,3};
        permute(a,a.length,a.length);
    }
    public static void permute(int a[],int l,int r)
    {
        if(r == l)
            System.out.println(a[r]);
        else
        {
            for (int i = l; i <= r  ; i++) {
                swap(a,l,i);
                permute(a,l+1,r);
                swap(a,l,i);
                
            }
        }
    }
    public static void swap(int[] ar, int i , int j) {
        int t = ar[i];
        ar[i] = ar[j];
        ar[j] = t;
    }


}
