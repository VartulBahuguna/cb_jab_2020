package practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StructurallyIdenticalBinaryTree {

//    static Scanner scn = new Scanner(System.in);
//
//    public static void KotlinPrograms.main(String[] args) {
////        StructurallyIdenticalBinaryTree m = new StructurallyIdenticalBinaryTree();
////        BinaryTree bt1 = m.new BinaryTree();
////        BinaryTree bt2 = m.new BinaryTree();
////        System.out.println(bt1.structurallyIdentical(bt2));
//        Integer temp1 = new Integer(4);
//        boolean t1 = (temp1 == null);
//        System.out.println(t1);
//    }
//
//    private class BinaryTree {
//        private class Node {
//            int data;
//            Node left;
//            Node right;
//        }
//
//        private Node root;
//        private int size;
//
//        public BinaryTree() {
//            this.root = this.takeInput(null, false);
//        }
//
//        public Node takeInput(Node parent, boolean ilc) {
//
//            int cdata = scn.nextInt();
//            Node child = new Node();
//            child.data = cdata;
//            this.size++;
//
//            // left
//            boolean hlc = scn.nextBoolean();
//
//            if (hlc) {
//                child.left = this.takeInput(child, true);
//            }
//
//            // right
//            boolean hrc = scn.nextBoolean();
//
//            if (hrc) {
//                child.right = this.takeInput(child, false);
//            }
//
//            // return
//            return child;
//        }
//
//        public boolean structurallyIdentical(BinaryTree other) {
//            return this.structurallyIdentical(this.root, other.root);
//        }
//
//        private boolean structurallyIdentical(Node tnode, Node onode) {
//            Queue<Node> queue1 = new LinkedList<>();
//            Queue<Node> queue2 = new LinkedList<>();
//
//            queue1.add(tnode);
//            queue2.add(onode);
//
//            while (!queue1.isEmpty() && !queue2.isEmpty()) {
//                if (tnode == null && onode == null) {
//                    return true;
//                }
//                if (tnode != null && onode == null || tnode == null && onode != null) {
//                    return false;
//                }
//                boolean tr = structurallyIdentical(tnode.right, onode.right);
//                if (!tr) {
//                    return false;
//                }
//                boolean tf = structurallyIdentical(tnode.left, onode.left);
//                if (!tf) {
//                    return false;
//                }
//
//                return true;
//            }
//        }
}
                //  Queue<Node> queue1 = new LinkedList<>();
                //     Queue<Node> queue2 = new LinkedList<>();

                //     queue1.add(tnode);
                //     queue2.add(onode);

                //     while(!queue1.isEmpty() && !queue2.isEmpty())
                //     {
                // 		Node temp1 = new Node();
                // 		Node temp2 = new Node();
                //          temp1 = queue1.remove();
                //          temp2 = queue2.remove();
                //         boolean t1 = false;
                //         boolean t2 = false;
                //         if(temp1.left == null)
                //         {
                //             t1 = true;
                //         }
                //         else
                //         {
                //             t1 = false;
                //         }
                //         if(temp2.left == null)
                //         {
                //             t2 = true;
                //         }
                //         else
                //         {
                //             t2 = false;
                //         }

                //         if(t1^t2)
                //         {
                //             return false;
                //         }
                //         queue1.add(temp1.left);
                //         queue2.add(temp2.left);

                //         if(temp1.left == null)
                //         {
                //             t1 = true;
                //         }
                //         else
                //         {
                //             t1 = false;
                //         }
                //         if(temp2.left == null)
                //         {
                //             t2 = true;
                //         }
                //         else
                //         {
                //             t2 = false;
                //         }
                //         if(t1^t2)
                //         {
                //             return false;
                //         }
                //         queue1.add(temp1.right);
                //         queue2.add(temp2.right);
                //     }

                //     return true;




