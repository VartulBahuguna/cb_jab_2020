package lec_05_04_2020;

public class DynamicQueueEgClient
{
    public static void main(String[] args)
    {

        DynamicQueueEg queue = new DynamicQueueEg();

        for (int i = 0; i <100 ; i++)
        {
            queue.enqueue(i);
        }

        for (int i = 0; i < 100; i++) {
            System.out.println(queue.dqueue());
        }
    }
}
