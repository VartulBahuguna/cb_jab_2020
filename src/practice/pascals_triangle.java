package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class pascals_triangle
{
    public static void main(String[] args)
    {
        /*Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for(int i = 1; i <= n; ++i)
        {
            int a = 1;
            int KotlinPrograms.getC = 1;
            int k = 1;
            for(int j = 1; j <= 2*n - 1; ++j)
            {
                if(j <= n - i || k > i)
                {
                    System.out.print(" ");
                }
                else
                {
                    if(KotlinPrograms.getC == 1)
                    {
                        if(j == 1 || j == 2*n-1)
                        {
                            System.out.print("1");
                        }
                        else
                        {
                            System.out.print(a);
                            a = a*(int)((i - k)/k);
                            k++;
                        }
                        KotlinPrograms.getC = 0;
                    }
                    else
                    {
                        System.out.print(" ");
                        KotlinPrograms.getC = 1;
                    }
                }
            }
            System.out.println();
        }*/
        // Java code to demonstrate how to
// extract minimum and maximum number
// in 1 line.


                // Initializing array of integ1ers
        Scanner s = new Scanner(System.in);
      /*  Integer[] num = new Integer[5];
        for (int i = 0; i < 5; i++) {
            num[i] = s.nextInt();
        }
                // using Collections.min() to find minimum element
                // using only 1 line.
                int min = Collections.min(Arrays.asList(num));

                // using Collections.max() to find maximum element
                // using only 1 line.
                int max = Collections.max(Arrays.asList(num));

                // printing minimum and maximum numbers
                System.out.println("Minimum number of array is : " + min);
                System.out.println("Maximum number of array is : " + max);

*/
  /*      int n = s.nextInt();
        Integer[] ar = new Integer[n];
        int h = 1;
        for(int i = 0; i < n; ++i)
        {
            ar[i] = s.nextInt();
        }
        int hcf = 1;
        while(h <= Collections.min(Arrays.asList(ar)))
        {
            int k = 0;
            for(int i = 0; i < n; ++i)
            {
                if(ar[i] % h == 0)
                {
                    k++;
                }
            }
            if(k == 3)
            {
                hcf = h;
            }
            h++;
        }
        System.out.print(hcf);
           */
       // Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int k = s.nextInt();
        int st = s.nextInt();
        String[] str = new String[n];

        for(int i = 0; i < n; ++i)
        {
            str[i] = s.nextLine();
        }

        for(int i = 0; i < n; ++i)
        {
            for(int j = 0; j < str[i].length(); ++j)
            {
                char ch = str[i].charAt(j);
                if(ch == '.')
                {
                    st -= 2;
                }
                else if(ch == '#')
                {
                    break;
                }
                else
                {
                    st += 5;
                }
                st--;
                if(st < 0 ||  st < k)
                {
                    break;
                }
            }
            if(st < 0 || st < k)
            {
                break;
            }
        }

        if(st < 0 || st < k)
        {
            System.out.println("NO");
        }
        else
        {
            System.out.println("Yes");
            System.out.print(st);
        }
    }

}
