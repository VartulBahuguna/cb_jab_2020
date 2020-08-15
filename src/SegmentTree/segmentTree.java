package SegmentTree;

public class segmentTree
{
    private Node root;

    private class Node
    {
        int data;
        int startingIndex;
        int endIndex;
        Node left;
        Node right;
    }

    public segmentTree(int[] a)
    {
        this.root = createTree(a, 0, a.length - 1);
    }

    private Node createTree(int[] a, int fi, int li)
    {
        if(fi >= li)
        {
            Node node = new Node();
            node.startingIndex = fi;
            node.endIndex = li;
            node.data = a[li];
            return node;
        }

        Node node = new Node();

        int midi = (fi + li) / 2;

        node.left = createTree(a, fi, midi);
        node.right = createTree(a, midi + 1, li);

        node.data = node.left.data + node.right.data;
        node.endIndex = li;
        node.startingIndex = fi;

        return node;
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
        String str = "";
        if(node.left == null)
        {
            str += "No left Node => ";
        }
        else
        {
            str += "(" + node.left.startingIndex + "," + node.left.endIndex + ") " + node.left.data + " => ";
        }

        str += node.data + "(" + node.startingIndex + "," + node.endIndex + ")";
        if(node.left == null)
        {
            str += " <= No right Node";
        }
        else
        {
            str += " <= " + node.right.data + "(" + node.right.startingIndex + "," + node.right.endIndex + ")";
        }
        System.out.println(str);

        display(node.left);
        display(node.right);
    }

    public int sumInRange(int si, int ei)
    {
        return  sumInRange(this.root, si, ei);
    }

    private int sumInRange(Node root, int si, int ei)
    {
        if(root.endIndex <= ei && root.startingIndex >= si)
        {
            return root.data;
        }
        if(root.startingIndex > ei || root.endIndex < si)
        {
            return 0;
        }
        else
        {
            int leftAns = sumInRange(root.left, si, ei);
            int rightAns = sumInRange(root.right, si, ei);

            return  leftAns + rightAns;
        }
    }

}
