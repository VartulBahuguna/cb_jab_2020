package practice;

import java.util.*;

public class TreeLeftView
{
    public static void main(String[] args)
    {
        BTree tree = new BTree();
        tree.insert();
        HashMap<Integer,Integer> map = tree.leftDisplay();
        //tree.topDisplay(map);

        ArrayList<Integer> list = new ArrayList<>(map.keySet());

        Collections.sort(list);

        for(int key : list)
        {
            System.out.print(map.get(key) + " ");
        }
    }

    static class BTree
    {
        Node root;
        private static class Node
        {
            int data;
            Node left;
            Node right;
            public Node(int data)
            {
                this.data = data;
                left = null;
                right = null;
            }
        }

        public void insert()
        {
            Scanner s = new Scanner(System.in);

            int val = s.nextInt();
            root = new Node(val);

            Queue<Node> queue = new LinkedList<>();

            queue.add(root);

            while(!queue.isEmpty())
            {
                int valLeft = s.nextInt();
                int valRight = s.nextInt();
                Node temp = queue.remove();

                if(valLeft != -1)
                {
                    temp.left = new Node(valLeft);
                    queue.add(temp.left);
                }
                if(valRight != -1)
                {
                    temp.right = new Node(valRight);
                    queue.add(temp.right);
                }
            }
        }

        public HashMap<Integer,Integer> leftDisplay()
        {
            HashMap<Integer,Integer> map = new HashMap<>();
            leftDisplay(this.root,map,0);
            //	System.out.println(map);
            return map;

        }

        private void leftDisplay(Node node, HashMap<Integer,Integer> map, int lvl)
        {
            if(node == null)
            {
                return;
            }

            if(!map.containsKey(lvl))
            {
                map.put(lvl, node.data);
            }

            leftDisplay(node.left, map, lvl+1);
            leftDisplay(node.right, map, lvl+1);
        }
    }
}
