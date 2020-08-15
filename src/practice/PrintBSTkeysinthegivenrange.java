package practice;

import java.util.*;

public class PrintBSTkeysinthegivenrange
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        while(t-- != 0)
        {
            Bst bst = new Bst();
            int n = s.nextInt();

            for(int i= 0; i < n; ++i)
            {
                int val = s.nextInt();
                bst.insert(val);
            }

            int start = s.nextInt();
            int end = s.nextInt();
            System.out.print("# Preorder : ");
            bst.Disp();
            System.out.println();
            System.out.print("# Nodes within range are : ");
            bst.display(start, end);
            System.out.println();
        }

    }

    static class Bst
    {
        class Node
        {
            int data;
            Node left;
            Node right;

            public Node(int data) {
                this.data = data;
            }
        }

        Node root;

        public void insert(int val)
        {
            root = insert(this.root,val);
        }

        private Node insert(Node node, int val)
        {
            //Scanner s = new Scanner(System.in);

            if(node == null)
            {
                return new Node(val);
            }

            if(val < node.data)
            {
                node.left =  insert(node.left,val);
            }
            else
            {
                node.right =   insert(node.right, val);
            }

            return  node;

        }

        public  void Disp()
        {
           // System.out.println(this.root.data);
            Disp(this.root);
        }

        private void Disp(Node node)
        {
            if(node == null)
            {
                return;
            }

            System.out.print(node.data + " ");
            Disp(node.left);
            Disp(node.right);
        }

        private void display(Node node, int start, int end)
        {
            if(node == null)
            {
                return ;
            }

            if(node.left != null)
            {
                display(node.left, start, end);
            }

			if(node.data <= end && node.data >= start)
            {
				System.out.print(node.data + " ");
			}

            if(node.right != null )
            {
                display(node.right, start, end);
            }

        }




        public void display(int start, int end)
        {
            display(this.root,start,end);
        }

        private void dis(Node node, int start, int end)
        {
            Stack<Node> q = new Stack<>();

            q.push(node);

            while(!q.isEmpty())
            {
                Node temp = q.pop();

                if(temp == null)
                {
                    continue;
                }
                if(temp.left == null)
                {
                    if(temp.data >= start && temp.data <= end)
                    {
                        System.out.print(temp.data + " ");
                    }
                }
                if(temp.right == null)
                {
                    if(temp.data >= start && temp.data <= end)
                    {
                        System.out.print(temp.data + " ");
                    }
                }

                if(temp.right != null)
                {
                    q.push(temp.right);
                }
                if(temp.left != null)
                {
                    q.push(temp.left);
                }

            }
        }
    }
}
