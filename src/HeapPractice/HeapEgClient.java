package HeapPractice;

public class HeapEgClient
{
    public static void main(String[] args)
    {
        Heapeg<Integer> heap = new Heapeg();

        heap.add(10);
        heap.display();
        heap.add(20);
        heap.display();
        heap.add(30);
        heap.display();
        heap.add(40);
        heap.display();
        heap.add(5);
        heap.display();
        heap.add(3);
        heap.display();

        System.out.println(heap.rem());
        heap.display();
        System.out.println(heap.rem());
        heap.display();
        System.out.println(heap.rem());
        heap.display();

    }
}
