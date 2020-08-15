package lec_19_04_2020;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.*;

public class BinarySearchTree
{


    private Node root;


    class Node
    {
        int value;
        Node right;
        Node left;

        public Node(int value)
        {
            this.value = value;
        }

    }

    public void insert(int value)
    {
        this.root = insert(root, value);
    }

    private Node insert(Node node, int value)
    {
        if(node == null)
        {
            return new Node(value);
        }


        if(node.value > value)
        {
            node.left = insert(node.left, value);
        }
        else
        {
            node.right = insert(node.right, value);
        }
        return node;
    }



    public void display()
    {
        display(root, "" );
    }

    private void display(Node node, String indent)
    {
        if(node == null)
        {
            return;
        }

        System.out.println(indent + node.value);
        display(node.left,indent + "\t");
        display(node.right, indent + "\t");

    }


    public void inorder()
    {
        inorder(this.root);
    }

    private void inorder(Node node)
    {
        if(node == null)
        {
            return;
        }

        inorder(node.left);
        System.out.println(node.value + " ");
        inorder(node.right);

    }

    public int successor(int value)
    {
        Node succ = null;
        Node curr = root;

        while(curr != null)
        {
            if(curr.value > value)
            {
                if(succ == null || succ.value > curr. value)
                {
                    succ = curr;
                }

                curr = curr.left;
            }

            else
            {
                curr = curr.right;
            }
        }
        return succ.value;
    }


    public void inrange(int k1, int k2)
    {
        inrange(this.root, k1, k2);
    }


    private void inrange(Node node, int k1, int k2)
    {
        if(node == null)
        {
            return;
        }

        if(node.value > k1 && node.value < k2)
        {
            System.out.println(node.value);
        }

        if(node.value > k1)
        {
            inrange(node.right,k1,k2);
        }

        if(node.value < k2)
        {
            inrange(node.left,k1,k2);
        }



    }


    public void makefromsorted(int[] ar, int start, int end) {
        if (start > end) {
            return;
        }

        int mid = (start + end) / 2;

        insert(ar[mid]);

        makefromsorted(ar, mid + 1, end);
        makefromsorted(ar, start, mid - 1);
    }




    public void levelorder()
    {
        Queue<Node> queue = new LinkedList<>();

        queue.add(root);

        while(!queue.isEmpty())
        {
            Node temp = queue.remove();
            System.out.println(temp.value);

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


    public void makefromprein(int[] pre, int[] in)
    {
        this.root = makefromprein(root,pre,in);
    }

    private Node makefromprein(Node node, int[] pre, int[] in)
    {
        if(in.length == 0)
        {
            return null;
        }

        int val = pre[0];
        int index = find(in, val);

        int[] pre_left = Arrays.copyOfRange(pre,1,index + 1);
        int[] pre_right = Arrays.copyOfRange(pre, index + 1, pre.length);

        int[] in_left = Arrays.copyOfRange(in, 0, index);
        int[] in_right = Arrays.copyOfRange(in, index + 1, in.length);

        Node node1 = new Node(val);

        node1.left = makefromprein(node1.left, pre_left, in_left);
        node1.right = makefromprein(node1.right, pre_right, in_right);

        return node1;
    }

    private int find(int[] in, int val)
    {
        for (int i = 0; i < in.length; i++)
        {
            if(in[i] == val)
            {
                return i;
            }
        }

        return -1;
    }


}
