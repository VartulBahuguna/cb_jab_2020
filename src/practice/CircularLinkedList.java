package practice;

import java.util.HashMap;
import java.util.Scanner;

public class CircularLinkedList
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        LinkedListt list = new LinkedListt();
//		int val = s.nextInt();
//Set unique = new HashSet();
        // while(val != -1)
        // {
        // 	list.addLast(val);
        // 	unique.put(val);
        // }

        list.makelist();
        list.detectLoop();
    //    list.display();

    }

    static class LinkedListt
    {
        private class Node
        {

            int data;
            Node next;
        }

        private Node head = new Node();
        private Node tail = new Node();
        private int size;



        public void detectLoop()
        {
            Node fast = this.head;
            Node slow = this.head;

            while ((fast != null && fast.next != null))
            {
                fast = fast.next.next;
                slow = slow.next;
                if(slow == fast)
                {
                    break;
                }
            }

            Node start = this.head;
            Node end = slow;

            if(slow == fast) {
                while (start.next != end.next) {
                    start = start.next;
                    end = end.next;
                }
            }
            if(end == head)
            {
                this.tail.next = null;
            }
            else
            {
                end.next = null;
                this.tail = end;
            }
            Node go = this.head;

            while(go != null)
            {
                System.out.print(go.data + " ");
                go = go.next;
            }
        }

        public void display()
        {

            Node go = this.head;

            while(go != null)
            {
                System.out.print(go.data + " ");
                go = go.next;
            }
        }


        public void makelist()
        {
            Scanner scn = new Scanner(System.in);
            HashMap<Integer, Node> unique = new HashMap<Integer, Node>();
//LinkedListt retList = new LinkedListt();

            //		Node start = new Node();
            //	Node end = new Node();
            int val = scn.nextInt();
            //	start.data = val;
            //	start.next = null;
            boolean isfirst = true;
            boolean circularQueue = false;
            while(val != -1)
            {
                if(isfirst)
                {
                    this.head.data = val;
                    this.head.next = null;
                    this.tail = head;
                    isfirst = false;
                    unique.put(val, this.head);
                }
                else if(!circularQueue)
                {
                    if(unique.containsKey(val))
                    {
                        tail.next = unique.get(val);
                        circularQueue = true;
                    }
                    else
                    {
                        Node temp = new Node();
                        temp.data = val;
                        temp.next = null;
                        this.tail.next= temp;
                        this.tail = temp;
                        unique.put(val, tail);
                    }
                }
                val = scn.nextInt();
            }

//            for (Node node: unique.values())
//            {
//                System.out.println(node.data + " " + node.next.data);
//            }
        }
    }
}
