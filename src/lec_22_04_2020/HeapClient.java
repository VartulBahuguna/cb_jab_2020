package lec_22_04_2020;

import main.java.hello.HelloWorld;

import java.util.PriorityQueue;

public class HeapClient
{
    public static void main(String[] args) throws Exception
    {

        Heap heap = new Heap();
        heap.insert(5);
        heap.insert(2);
        heap.insert(1);

        heap.display();
        System.out.println(heap.remove());
        heap.display();
        System.out.println(heap.remove());
        heap.display();
        System.out.println(heap.remove());
        heap.display();
        System.out.println(heap.remove());

    }
}
