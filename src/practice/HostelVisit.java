package practice;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class HostelVisit
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        int q = s.nextInt();

        int k = s.nextInt();

        PriorityQueue<Long> list = new PriorityQueue<>(Collections.reverseOrder());
        while(q-- != 0)
        {
            int type = s.nextInt();

            if(type == 1)
            {
                long a =s.nextLong();
                long b = s.nextLong();

                long dist = (a*a) + (b*b);

                if(list.size() == k)
                {
                    if(list.peek() > dist)
                    {
                        list.poll();
                        list.add(dist);
                    }
                }
                else
                {
                    list.add(dist);
                }
            }
            else
            {
                System.out.println(list.peek());
            }
        }
    }
}
