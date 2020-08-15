package practice;

import java.util.*;

public class LevelOrderZigzagBinaryTree
{
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

        LevelOrderZigzagBinaryTree  m = new LevelOrderZigzagBinaryTree ();
        BinaryTree bt = m.new BinaryTree();
        bt.levelOrderZZ();

    }

    private class BinaryTree
    {
        private class Node {
            int data;
            Node left;
            Node right;
        }

        private Node root;
        private int size;

        public BinaryTree() {
            this.root = this.takeInput(null, false);
        }

        public Node takeInput(Node parent, boolean ilc) {

            int cdata = scn.nextInt();
            Node child = new Node();
            child.data = cdata;
            this.size++;

            // left
            boolean hlc = scn.nextBoolean();

            if (hlc) {
                child.left = this.takeInput(child, true);
            }

            // right
            boolean hrc = scn.nextBoolean();

            if (hrc) {
                child.right = this.takeInput(child, false);
            }

            // return
            return child;
        }

        public void levelOrderZZ() {

            Stack<Node> oddLevel = new Stack<>();
            Stack<Node> eveLevel = new Stack<>();
            boolean lvl = true;
            oddLevel.push(this.root);
            while(!oddLevel.isEmpty() || !eveLevel.isEmpty())
            {
                if(lvl)
                {
                    while(!oddLevel.isEmpty())
                    {
                        Node temp = oddLevel.pop();
                        if(temp.left != null)
                        {
                            eveLevel.push(temp.left);
                        }
                        if(temp.right != null)
                        {
                            eveLevel.push(temp.right);
                        }
                        System.out.print(temp.data + " ");
                    }
                    lvl  = false;
                }
                else {
                    while (!eveLevel.isEmpty()) {
                        Node temp = eveLevel.pop();
                        if (temp.right != null) {
                            oddLevel.push(temp.right);
                        }
                        if (temp.left != null) {
                            oddLevel.push(temp.left);
                        }
                        System.out.print(temp.data + " ");
                    }
                    lvl = true;
                }
                LinkedList list = new LinkedList();
                Set set = new HashSet<>();


            }
        }
    }
}
