package lec_18_04_2020;

import java.util.Scanner;

public class BinaryTree
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

    public void insert(Scanner s)
    {
        this.root = insert(root, s);
    }
    private Node insert(Node node, Scanner s)
    {

        if(node == null)
        {
            int val = s.nextInt();
            return new Node(val);
        }

        System.out.println("Enter the direction : ");
        String str = s.next();

        if(str.equals("l"))
        {
            node.left = insert(node.left, s);
        }
        else
        {
            node.right = insert(node.right, s);
        }

        return node;
    }

    public void display()
    {
        display(this.root,"");
    }

    private void display(Node node,String indent) {

        if(node == null)
        {
            return;
        }

        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");

    }

    public void postOrder()
    {
        postOrder(this.root, "");
    }

    private void postOrder(Node node, String indent)
    {
        if(node == null)
        {
            return;
        }

        postOrder(node.left, indent + "\t");
        postOrder(node.right, indent + "\t");
        System.out.println(indent + node.value);
    }
    public int height()
    {
        return height(this.root);
    }

    private int height(Node node)
    {
        if(node == null)
        {
            return 0;
        }

        return 1 + Math.max(height(node.left),height(node.right));
    }


    public boolean find(int value)
    {
        return find(this.root, value);
    }

    private boolean find(Node node, int value)
    {
        if(node == null)
        {
            return false;
        }

        else if(node.value == value)
        {
            return true;
        }

        return find(node.left,value) || find(node.right,value);
    }

    public int diameter()
    {
        return diameter(this.root);
    }

    private int diameter(Node node)
    {
        if(node == null)

        {
            return 0;
        }

        int current = 1 + height(node.left) + height(node.right);

        int max = Math.max(diameter(node.left),diameter(node.right));


        return Math.max(max,current);
    }

    public void mirror()
    {
        mirror(this.root);
    }

    private void mirror(Node node)
    {
        if(node == null)
        {
            return;
        }

        Node TempNode = node.left;
        node.left = node.right;
        node.right = TempNode;
        mirror(node.left);
        mirror(node.right);
    }
}
