package AVLTRee;

import java.util.concurrent.LinkedBlockingDeque;

public class AvlTree
{
    private class Node
    {
        int data;
        Node left;
        Node right;
        int height;

        Node(int data)
        {
            this.data = data;
            this.height = 1;
        }
    }


    private Node root;


    private int height(Node node)
    {
        if(node == null)
        {
            return 0;
        }

        return node.height;
    }



    private int bf(Node node)
    {
        if(node == null)
        {
            return 0;
        }

        return height(node.left) - height(node.right);
    }



    public void insert(int value)
    {
        this.root = insert(this.root, value);
    }


    private Node insert(Node node, int value)
    {
        if(node == null)
        {
            Node nn = new Node(value);
            return nn;
        }

        if(node.data < value)
        {
            node.right = insert(node.right, value);
        }

        else if(node.data > value)
        {
            node.left = insert(node.left, value);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;

        int bf = bf(node);

        //LL case
        if(bf > 1 && value < node.left.data)
        {
            return rightRotate(node);
        }

        //RR case
        if(bf < -1 && value > node.right.data)
        {
            return  leftRotate(node);
        }

        //LR case
        if(bf > 1 && value > node.left.data)
        {
            node.left = leftRotate(node.left);

            return rightRotate(node);
        }

        //RL case
        if(bf < -1 && value < node.right.data)
        {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }


    public void display() throws Exception
    {
        display(this.root,"");
    }


    private void display(Node node, String indent) throws Exception
    {
        if(this.root == null)
        {
            throw new Exception("khali hai bhai");
        }

        if(node == null)
        {
            return;
        }

        System.out.println(indent + node.data);

        display(node.left, indent + "\t");
        display(node.right, indent + "\t");

    }



    private Node rightRotate(Node c)
    {
        Node b = c.left;
        Node T3 = b.right;

        //rotate
        b.right = c;
        c.left = T3;

        //ht update
        c.height = Math.max(height(c.left), height(c.right)) + 1;
        b.height = Math.max(height(b.left), height(b.right)) + 1;

        return b;
    }



    private Node leftRotate(Node c)
    {
        Node b = c.right;
        Node T2 = b.left;

        //rotate
        b.left = c;
        c.right = T2;

        //height update
        c.height = Math.max(height(c.left), height(c.right)) + 1;
        b.height = Math.max(height(b.left), height(b.right))  + 1;

        return  b;
    }

}
