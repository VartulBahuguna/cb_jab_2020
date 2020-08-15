package practice;

import java.util.*;
import java.util.Queue;
import java.util.Scanner;

public class Treetopview
{

    public static void main(String[] args)
    {
        BTree tree = new BTree();
        tree.insert();
        HashMap<Integer,Integer> map = tree.topDisplay();
        //tree.topDisplay(map);

        ArrayList<Integer> list = new ArrayList<>(map.keySet());

        Collections.sort(list);

        for(int key : list)
        {
            System.out.print(map.get(key) + " ");
        }
    }

    static class BTree
    {
        Node root;
        private static class Node
        {
            int data;
            Node left;
            Node right;
            public Node(int data)
            {
                this.data = data;
                left = null;
                right = null;
            }
        }

        public void insert()
        {
            Scanner s = new Scanner(System.in);

            int val = s.nextInt();
            root = new Node(val);

            Queue<Node> queue = new LinkedList<>();

            queue.add(root);

            while(!queue.isEmpty())
            {
                int valLeft = s.nextInt();
                int valRight = s.nextInt();
                Node temp = queue.remove();

                if(valLeft != -1)
                {
                    temp.left = new Node(valLeft);
                    queue.add(temp.left);
                }
                if(valRight != -1)
                {
                    temp.right = new Node(valRight);
                    queue.add(temp.right);
                }
            }
        }

        public HashMap<Integer,Integer> topDisplay()
        {
            HashMap<Integer,Integer> map = new HashMap<>();
            topDisplay(this.root,map,0);
            //	System.out.println(map);
            return map;

        }

        private void topDisplay(Node node,HashMap<Integer,Integer> map, int d)
        {
            if(node == null)
            {
                return;
            }

            if(!map.containsKey(d))
            {
                map.put(d, node.data);
            }

            topDisplay(node.left, map, d-1);
            topDisplay(node.right, map, d+1);
        }

        private void topDisplayRight(Node node)
        {
            if(node.right != null)
            {
                topDisplayRight(node.right);
            }

            System.out.print(node.data + " ");
        }





        public void display()
        {
            display(this.root,"");
        }

        private void display(Node node,String indent)
        {
            System.out.println(indent + node.data);
            if (node.left != null)
            {
                //  System.out.println(node.left.data);
                display(node.left, indent + " ");
            }
            if(node.right != null)
            {
                //       System.out.println(node.right.data);
                display(node.right,  indent + " ");
            }
        }
    }

 /*   static class Tree
    {
        private Node root ;
        private int size;

        private static class Node
        {
            int data;
            Node left;
            Node right;
        }

//        public void insert()
//        {
//            this.insert(this.root);
//        }

        private void insert()
        {

            Scanner s = new Scanner(System.in);

            Queue<Node> queue = new Queue<>();
            this.root.data = s.nextInt();
            this.size++;
            queue.add(this.root);

            while(!queue.isEmpty())
            {
                Node temp = queue.remove();

                int leftVal = s.nextInt();

                if(leftVal != -1)
                {
                    temp.left.data = leftVal;
                    queue.add(temp.left);
                }

                int rightVal = s.nextInt();

                if(rightVal != -1)
                {
                    temp.right.data = rightVal;
                    queue.add(temp.right);
                }
            }
        }

        public void display()
        {
            display(this.root);
        }

        private void display(Node node)
        {
            System.out.println(node.data);
            if (node.left != null)
            {
                System.out.println(node.left.data);
                display(node.left);
            }
            if(node.right != null)
            {
                System.out.println(node.right.data);
                display(node.right);
            }
        }


    }


  /*  static class Queue<T>
    {
        QNode head ;
        QNode tail ;

        int size = 0;
        private class QNode
        {
            T data;
            QNode next;
//            public QNode()
//            {
//                this.data = null;
//                this.next = null;
//            }
        }

        public void add(T val)
        {
            if(head == null)
            {
                head.data = val;
                head.next = null;
                tail = head;
            }
            else
            {
                QNode temp = new QNode();
                temp.data = val;
                temp.next = null;
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        public T remove()
        {
            QNode temp;

            temp = head;

            head = head.next;
            size--;
            return temp.data;
        }

        public boolean isEmpty()
        {
            return size == 0;
        }
    }*/
}
