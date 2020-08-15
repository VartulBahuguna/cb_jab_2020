package lec_30_03_2020;


public class QueueClientEg {

    public static void main(String[] args) {

        QueueEg queue = new QueueEg();

        for (int i = 1; i <10 ; i++) {

            queue.enqueue(i);
        }

        System.out.println(queue.dequeue());

        System.out.println(queue.dequeue());
    }
}
