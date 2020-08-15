package practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FindSumAtLevelK
{
    static int k = 0;
    static int sum = 0;
    static Scanner s = new Scanner(System.in);
    static class Node
    {
        int data;
        Node left;
        Node right;
        public Node(int data)
        {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    static public Node insert(Node parent)
    {

        int val = s.nextInt();
        int children = s.nextInt();

        if(parent == null)
        {
            parent = new Node(val);
        }

        if(children >= 1)
        {
            parent.left = insert(parent.left);
        }

        if(children == 2)
        {
            parent.right = insert(parent.right);
        }
        return parent;
    }

    public static void itrSum(int k, Node parent)
    {
        Queue<Node> queue = new LinkedList<>();

        queue.add(parent);
        queue.add(null);
        boolean kthLastRow = false;

        while(!queue.isEmpty())
        {
            Node temp = queue.peek();
            if(temp == null)
            {
                queue.remove();
                k--;
                if(!queue.isEmpty()) {
                    queue.add(null);
                }
                if(kthLastRow)
                {
                    break;
                }
                if(k == 0)
                {
                    kthLastRow = true;
                }

            }
            else
            {
                queue.remove();
                if (kthLastRow)
                {
                    sum += temp.data;
                }
               if(temp.left != null)
               {
                   queue.add(temp.left);
               }
                if(temp.right != null)
                {
                    queue.add(temp.right);
                }
            }
        }
    }

    public static void findSum(int k, Node parent)
    {
        if(parent == null)
        {
            return ;
        }

        if(k == 0)
        {
            sum += parent.data;
            return;
        }

        findSum(k - 1, parent.left);
        findSum(k - 1, parent.right);
    }

    public static void main(String args[])
    {
        Node node = null;
        node = insert(node);
        k = s.nextInt();
        findSum(k, node);


        System.out.print(sum);
    }
}
