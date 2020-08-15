package lec_04_04_2020;

public class CircularQueueClient
{
    public static void main(String[] args)
    {
        Circular_queue queue = new Circular_queue();

        for (int i = 0; i < 10 ; i++) {
            queue.enqueue(i);
        }
        queue.dqueue();
        queue.enqueue(21);
        for (int i = 0; i < 10 ; i++)
        {
            System.out.println(queue.dqueue());
        }
    }
}

