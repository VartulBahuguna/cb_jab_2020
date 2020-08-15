package practice;

import java.util.Scanner;

public class Kthelementfromlastinlinkedlist
{
    static class ll
    {
        static Node head = null;
        static Node tail = null;
        public static class Node
        {
            int data;
            Node next;
            public Node(int data)
            {
                this.data = data;
                this.next = null;
            }
        }

        public static void insert(int val)
        {
            Node node = new Node(val);
            if(head == null)
            {
                head = node;
                tail = node;
                return;
            }

            tail.next = node;
            tail = node;
        }

        public static void findK(int k)
        {
            Node fast = ll.head;
            for(int i = 1; i <= k; ++i)
            {
                fast = fast.next;
            }

            Node slow = ll.head;

            while(fast != null)
            {
                fast = fast.next;
                slow = slow.next;
            }

            System.out.print(slow.data);
        }
    }

    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        ll list = new ll();

        int val = s.nextInt();

        while(val != -1)
        {
            ll.insert(val);
            val = s.nextInt();
        }

        int k = s.nextInt();

        ll.findK(k);
    }
}
