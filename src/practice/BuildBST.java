package practice;

import java.util.*;
public class BuildBST
 {
    public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);

		int t = s.nextInt();

		while(t-- != 0)
		{
			int n = s.nextInt();

			int[] a = new int[n];

			for(int i = 0; i < n; ++i)
			{
				a[i] = s.nextInt();
			}

			Bst bst = new Bst();
			bst.buildBst(a);
			bst.Disp();
			System.out.println();
		}
    }

	static class Bst
	{
		Node root;

		class Node
		{
			int data;
			Node left;
			Node rigth;
			Node(int data)
			{
				this.data = data;
			}
		}

		public void buildBst(int[] ar)
		{
			this.root = buildBst(this.root, ar, 0, ar.length-1);
		}
		public Node buildBst(Node node, int[] ar, int i, int j)
		{
			if(i>j)
			{
				return null;
			}
			int mid = (i+j)/2;

			node = new Node(ar[mid]);

			node.left = buildBst(node.left, ar, i, mid-1);
			node.rigth = buildBst(node.rigth, ar, mid+1, j);

			return node;
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
            Disp(node.rigth);
        }
	}
}