package lec_05_04_2020;

import lec_04_04_2020.Circular_queue;

public class DynamicQueueEg extends Circular_queue
{
    public void enqueue(int element)
    {
        System.out.println("Mai badh gya");
        int[] ar = new int[2 * data.length];
        if(this.isFull())
        {
            for (int i = 0; i < size; i++)
            {
                ar[i] = data[(front + i) % data.length];
            }
            front = 0;
            end = data.length;
            data = ar;
        }
        super.enqueue(element);
    }
}
