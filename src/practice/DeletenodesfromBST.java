package practice;

import java.util.Scanner;

public class DeletenodesfromBST
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        while(t-- != 0)
        {
            int n = s.nextInt();

            Bst bst = new Bst();
            for(int i = 0; i < n; ++i)
            {
                bst.insert(s.nextInt());
            }

            n = s.nextInt();

            for(int i = 0; i < n; ++i)
            {
                bst.delVal(s.nextInt());
            }

            bst.display();
            System.out.println();
        }
    }

    static class Bst
    {
        Node root;

        private class Node
        {
            int data;
            Node left;
            Node right;
            Node(int data)
            {
                this.data = data;
            }
        }

        public void insert(int val)
        {
            this.root = insert(this.root, val);
        }

        public Node insert(Node parent, int val)
        {

            if(parent == null)
            {
                return new Node(val);
            }
            if(val < parent.data)
            {
                parent.left = insert(parent.left, val);
                //return parent;
            }
            else
            {
                parent.right = insert(parent.right, val);
                //return parent;
            }

            return parent;
        }

        public void display()
        {
            display(this.root);
        }

        private void display(Node node)
        {
            if(node == null)
            {
                return;
            }

            System.out.print(node.data + " ");
            display(node.left);
            display(node.right);
        }

        public void delVal(int val)
        {
            if(this.root == null)
            {
                return;
            }
            this.root = delVal(this.root, val);
        }

        private Node delVal(Node node, int val)
        {
            if(node == null)
            {
                return node;
            }

            if(node.data == val)
            {
                if(node.left == null && node.right == null)
                {
                    return null;
                }
                if(node.left == null)
                {
                    return node.right;
                }
                if(node.right == null)
                {
                    return node.left;
                }
                else
                {
                    Node temp = this.successor(node.right);

                    node.data = temp.data;
                    node.right = delVal(node.right, node.data);

                    return node;
                }
            }
            if(val < node.data)
            {
                node.left = delVal(node.left, val);
            }
            else
            {
                node.right = delVal(node.right, val);
            }

            return node;
        }

        public Node successor(Node node)
        {
            if(node.left == null)
            {
                return node;
            }
            return successor(node.left);
        }

    }
}
