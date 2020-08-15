package practice;

import java.util.*;
public class CreatetreeUsingpreorderandinorder{

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		CreatetreeUsingpreorderandinorder m = new CreatetreeUsingpreorderandinorder();
		int[] pre = takeInput();
		int[] in = takeInput();
		BinaryTree bt = m.new BinaryTree(pre, in);
		bt.display();
	}

	public static int[] takeInput() {
		int n = scn.nextInt();

		int[] rv = new int[n];
		for (int i = 0; i < rv.length; i++) {
			rv[i] = scn.nextInt();
		}

		return rv;
	}

	private class BinaryTree {
		private class Node {
			int data;
			Node left;
			Node right;
		}

		private Node root;
		private int size;

		public BinaryTree(int[] pre, int[] in) {
			this.root = this.construct(pre,in);
		}

		private Node construct(int[] pre, int[] in) {

			if(in.length == 0)
			{
				return null;
			}
			Node node = new Node();
			node.data = pre[0];

			int indxIn = find(in, pre[0]);

			int[] leftPre = Arrays.copyOfRange(pre, 1, indxIn + 1);
			int[] rightPre = Arrays.copyOfRange(pre, indxIn + 1, pre.length);

			int[] leftIn = Arrays.copyOfRange(in, 0, indxIn);
			int[] rightIn = Arrays.copyOfRange(in, indxIn + 1, in.length);

			node.left = construct(leftPre, leftIn);
			node.right = construct(rightPre, rightIn);

			return node;

		}

		private int find(int[] in, int val) {

			for (int i = 0; i <in.length ; i++) {

				if(in[i]==val){
					return i;
				}
			}
			return -1;
    	}

		public void display() {
			this.display(this.root);
		}

		private void display(Node node) {
			if (node == null) {
				return;
			}

			String str = "";

			if (node.left != null) {
				str += node.left.data;
			} else {
				str += "END";
			}

			str += " => " + node.data + " <= ";

			if (node.right != null) {
				str += node.right.data;
			} else {
				str += "END";
			}

			System.out.println(str);

			this.display(node.left);
			this.display(node.right);
		}

	}

}
