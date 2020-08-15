package practice;

import java.util.*;
public class Medianinastreamofrunningintegers
 {
    public static void main(String args[]) 
    {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        while(t-- != 0)
        {
            int n = s.nextInt();

            int[] a = new int[n];

            PriorityQueue<Integer> minH = new PriorityQueue<Integer>();
            PriorityQueue<Integer> maxH = new PriorityQueue<Integer>(Collections.reverseOrder());
            int median = 0;
            for (int i = 0; i < a.length; i++) {
                a[i] = s.nextInt();
            }
		
		printMedian(a);
            // for(int i = 0; i < n; ++i)
            // {
                
            //     a[i] = s.nextInt();
            //     if(i == 0)
            //     {
            //         median = a[i];
            //         minH.add(a[i]);
            //     }
            //     else
            //     {
            //         if(a[i] >= minH.peek())
            //         {
            //             minH.add(a[i]);
            //         }
            //         else if(a[i] <= maxH.peek())
            //         {
            //             maxH.add(a[i]);
            //         }

            //         if(maxH.size() - minH.size() > 1)
            //         {
                        
            //             int x = maxH.remove();
            //             minH.add(x);
            //         }
            //         else if (minH.size() - maxH.size() > 1)
            //         {
                        
            //             int y = minH.remove();
            //             maxH.add(y);
            //         }
            //         if(maxH.size() > minH.size())
            //         {
            //             median = maxH.peek();
            //         }
            //         else if(minH.size() > maxH.size())
            //         {
            //             median = minH.peek();
            //         }
            //         else if(minH.size() == maxH.size())
            //         {
            //             median = (minH.peek() + maxH.peek()) / 2;
            //         }
            //     }

            //     System.out.print(median + " ");
            // }
            // int[] b = new int[n];
            // int k = 0;
            // int median = 0;
            // for(int i = 0; i < n; ++i)
            // {
            //     a[i] = s.nextInt();
                
            //     if(i == 0)
            //     {
            //         median = a[i];
            //     }
            //     else
            //     {
            //         for(int j = i; j > 0; --j)
            //         {
            //             if(a[j] < a[j-1])
            //             {
            //                 swap(a,j,j-1);
            //             }
            //             else
            //             {
            //                 break;
            //             }
            //         }

            //         if(i%2 == 0)
            //         {
            //             median = a[i/2];
            //         }
            //         else
            //         {
            //             median = (a[i/2] + a[(i/2) + 1])/2;
            //         }
            //     }
            //     System.out.print(median + " ");
            // }

            System.out.println();
        }
    }

     public static void swap(int[] ar, int i , int j) 
     {
        int t = ar[i];
        ar[i] = ar[j];
        ar[j] = t;
    }

    public static void printMedian(int[] a) {

        int med = a[0];

        // max heap to store the smaller half elements
        PriorityQueue<Integer> smaller = new PriorityQueue<>(Collections.reverseOrder());

        // min heap to store the greater half elements
        PriorityQueue<Integer> greater = new PriorityQueue<>();

        smaller.add(a[0]);
        System.out.print(med + " ");

        // reading elements of stream one by one
        /*
         * At any time we try to make heaps balanced and their sizes differ by at-most
         * 1. If heaps are balanced,then we declare median as average of
         * min_heap_right.top() and max_heap_left.top() If heaps are unbalanced,then
         * median is defined as the top element of heap of larger size
         */
        for (int i = 1; i < a.length; i++) {

            int x = a[i];

            // case1(left side heap has more elements)
            if (smaller.size() > greater.size()) {
                if (x < med) {
                    greater.add(smaller.remove());
                    smaller.add(x);
                } else
                    greater.add(x);
                med = (smaller.peek() + greater.peek()) / 2;
            }

            // case2(both heaps are balanced)
            else if (smaller.size() == greater.size()) {
                if (x < med) {
                    smaller.add(x);
                    med = smaller.peek();
                } else {
                    greater.add(x);
                    med = greater.peek();
                }
            }

            // case3(right side heap has more elements)
            else {
                if (x > med) {
                    smaller.add(greater.remove());
                    greater.add(x);
                } else
                    smaller.add(x);
                med = (smaller.peek() + greater.peek()) / 2;

            }
            System.out.print(med + " ");
        }
    }
}