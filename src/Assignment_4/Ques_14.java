package Assignment_4;

//import java.util.ArrayList;
import java.util.*;

public class Ques_14
{
    public static void main (String args[])
    {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] a1 = new int[n];
        for(int i = 0; i < n; ++i)
        {
            a1[i] = s.nextInt();
        }

        int m = s.nextInt();
        int[] a2 = new int[m];
        for(int i = 0; i < m; ++i)
        {
            a2[i] = s.nextInt();
        }

        if(n < m)
        {
            int[] tempAr = a1;
            a1 = a2;
            a2 = tempAr;
            int temp = m;
            m = n;
            n = temp;
        }

        ArrayList<Integer> sum = new ArrayList<Integer>(0);
        int i = n - 1;
        //int[] sum = new int[m];
        int j = m - 1;
        int carry = 0;
        while(j >= 0)
        {
            int sumint = 0;
            sumint = a1[i] + a2[j] + carry;

            sum.add(0, sumint % 10);
            carry = sumint / 10;
            i--;
            j--;
        }
        while(i >= 0)
        {
            int sumint = 0;
            sumint = a1[i] + carry;
            sum.add(0, sumint % 10);
            carry = sumint / 10;
            i--;
        }
        if(carry == 1)
        {
            sum.add(0, carry);
        }

        for(int k = 0; k < sum.size(); ++k)
        {
            System.out.print(sum.get(k) + ", ");
        }
        System.out.print("End");
    }
}
