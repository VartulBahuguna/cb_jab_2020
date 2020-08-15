package lec_08_04_2020;

public class linked_list {
    private Node head;
    private Node tail;
    private int size = 0;

    static class Node {
        int value;
        Node next;

        public Node(int x) {
            this.value = x;
        }
    }

    public void insertfirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size++;
    }

    public void insertbetween(int val, int index) {
        if (index == 0) {
            insertfirst(val);
            return;
        }

        if (index == size - 1) {
            insertlast(val);
            return;
        }

        Node node = new Node(val);
        Node prev = get(index - 1);
        node.next = prev.next;
        prev.next = node;
        size++;
    }

    public void insertlast(int value) {
        if (size == 0) {
            insertfirst(value);
            return;
        }
        Node node = new Node(value);


//        *Second method, time complexity = n
//        Node temp = head;
//        while(temp.next != null)
//        {
//           temp = temp.next;
//        }
//        temp.next = node;


        tail.next = node;
        tail = node;
        size++;
    }

    public int deletefirst() {
        if (size == 0) {
            System.out.println("Khali hai be");
            return -1;
        }

        int value = head.value;
        head = head.next;

        if (head == null) {
            tail = null;
        }

        size--;
        return value;
    }

    public int deletemiddle(int index) {
        if (index == 0) {
            return deletefirst();
        } else if (index == size - 1) {
            return deletelast();
        }
        Node temp = get(index);
        temp.next = temp.next.next;
        size--;
        return temp.value;
    }

    public int deletelast() {
        if (size < 1) {
            return deletefirst();
        }

        Node temp = head;

        while (temp.next != tail) {
            temp = temp.next;
        }

        int value = temp.next.value;
        temp.next = null;
        size--;
        return value;
    }

    public Node get(int index) {
        if (index >= size) {
            System.out.println("Iitni jgh nahi hai be");
            return null;
        }
        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp;
    }

    public void removecontdupli() {
        Node temp = head;
        while (temp.next != null) {
            if (temp.value == temp.next.value) {
                temp.next = temp.next.next;
                size--;
            } else {
                temp = temp.next;
            }
        }
    }

    public void reverse() {
        revlist(this.head);
    }

    private void revlist(Node temp) {
        if (temp == tail) {
            head = tail;
        }

        revlist(temp.next);

        tail.next = temp;
        tail = temp;
        tail.next = null;
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }


    public static linked_list merge_sort(linked_list list)
    {
        if(list.size == 1)
        {
            return list;
        }

        Node mid = list.mid();

        linked_list first = new linked_list();
        first.head = list.head;
        first.tail = mid;
        first.size = (list.size + 1) / 2;

        linked_list second = new linked_list();
        second.head = mid.next;
        second.tail = list.tail;
        second.size = list.size / 2;

        mid.next = null;

        first = merge_sort(first);
        second = merge_sort(second);

        return merge(first,second);
    }

    public Node mid()
    {
        Node slow = head;
        Node fast = head;

        while(fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static linked_list merge(linked_list first, linked_list second){

        linked_list list = new linked_list();

        Node f =first.head;
        Node s= second.head;

        while(f!=null && s!=null){

            if(f.value<s.value){
                list.insertlast(f.value);
                f=f.next;
            }
            else{
                list.insertlast(s.value);
                s=s.next;
            }
        }

        while(f!=null){
            list.insertlast(f.value);
            f=f.next;
        }

        while(s!=null){
            list.insertlast(s.value);
            s=s.next;
        }

        return list;
    }

/*    public static linked_list merge(linked_list list1, linked_list list2)
    {
        linked_list result = new linked_list();
        Node temp1 = list1.head;
        Node temp2 = list2.head;
        while(temp1 != null && temp2 != null)
        {
            if(temp1.value < temp2.value)
            {
                result.insertlast(temp1.value);
                temp1 = temp1.next;
            }
            else if(temp2.value <= temp1.value)
            {
                result.insertlast(temp2.value);
                temp2 = temp2.next;
            }
        }

        if(temp1 != null)
        {
            result.tail.next = temp1;
            result.tail = list1.tail;
        }

        if(temp2 != null)
        {
            result.tail.next = temp2;
            result.tail = list2.tail;
        }

        return result;
    }
*/
    public  void oddeve()
    {
        Node eve_head = null;
        Node eve_tail = null;
        Node odd_head = null;
        Node odd_tail = null;
        Node temp = this.head;

        while(temp != null)
        {
            if(temp.value % 2 != 0)
            {
                if(odd_head == null)
                {
                    odd_head = temp;
                    odd_tail = temp;
                }
                else
                {
                    odd_tail.next = temp;
                    odd_tail = temp;
                }
            }

            else
            {
                if(eve_head == null)
                {
                    eve_head = temp;
                    eve_tail = temp;
                }
                else
                {
                        eve_tail.next = temp;
                        eve_tail = temp;
                }
            }
            temp = temp.next;
        }

        odd_tail.next = eve_head;
        this.head = odd_head;
        this.tail = eve_tail;
        this.tail.next = null;
    }

}