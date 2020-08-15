package practice;

import java.util.Scanner;

public class LinkedListCBMergeSort
{
    private class Node {

        int data;
        Node next;
    }

    private Node head;
    private Node tail;
    private int size;

    public int getFirst() throws Exception {
        if (this.size == 0)
            throw new Exception("linked list is empty");

        return head.data;
    }

    public int getLast() throws Exception {
        if (this.size == 0)
            throw new Exception("linked list is empty");

        return tail.data;
    }

    public void addLast(int item) {
        // create a new node
        Node nn = new Node();

        nn.data = item;
        nn.next = null;

        // update summary
        if (size == 0) {
            this.head = nn;
            this.tail = nn;
            size++;
        } else

        {
            this.tail.next = nn;
            this.tail = nn;

            size++;
        }

    }

    public void addFirst(int item) {
        Node nn = new Node();
        nn.data = item;
        nn.next = null;

        if (size == 0) {
            this.head = nn;
            this.tail = nn;
            size++;
        } else {
            nn.next = this.head;
            this.head = nn;
            size++;
        }

    }

    public int removeFirst() throws Exception {
        Node fn = this.head;

        if (this.size == 0)
            throw new Exception("linked list is empty");

        if (this.size == 1) {
            this.head = null;
            this.tail = null;
            size = 0;
        } else {
            Node np1 = this.head.next;
            this.head = np1;
            size--;
        }

        return fn.data;
    }

    public void merge_sorted_list(LinkedListCBMergeSort other) throws Exception
    {
        if(this.head == null)
        {
            other.display();
            return;
        }

        if(other.head == null)
        {
            this.display();
            return;
        }
        Node l1 = this.head;
        Node l2 = other.head;
        LinkedListCBMergeSort l3 = new LinkedListCBMergeSort();

        while(l1 != null && l2 != null)
        {
            if(l1.data < l2.data)
            {
                l3.addLast(l1.data);
                l1 = l1.next;
            }
            else
            {
                l3.addLast(l2.data);
                l2 = l2.next;
            }
        }

        if(l2 != null)
        {
            l3.tail.next = l2;
        }

        if(l1 != null)
        {
            l3.tail.next = l1;
        }

        l3.display();
    }

    public void display() {

        Node temp = this.head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();

    }


    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub

        int t = scn.nextInt();

        while(t > 0){

            LinkedListCBMergeSort list1 = new LinkedListCBMergeSort();
            int n1 = scn.nextInt();

            for (int j = 0; j < n1; j++) {
                int item = scn.nextInt();
                list1.addLast(item);
            }

            LinkedListCBMergeSort list2 = new LinkedListCBMergeSort();
            int n2 = scn.nextInt();

            for (int j = 0; j < n2; j++) {
                int item = scn.nextInt();
                list2.addLast(item);
            }
            list1.merge_sorted_list(list2);

            t--;
        }

    }
}
