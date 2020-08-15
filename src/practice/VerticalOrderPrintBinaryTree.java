package practice;

import java.util.*;

public class VerticalOrderPrintBinaryTree
{
    public static void main(String[] args)
    {
        BTree tree = new BTree();
        tree.insert();
        HashMap<Integer, ArrayList<Integer>> map = tree.bottomDisplay();
        //tree.topDisplay(map);

        ArrayList<Integer> list = new ArrayList<>(map.keySet());

        Collections.sort(list);

        for(int key : list)
        {
            ArrayList<Integer> values = map.get(key);
            for(int val : values)
            {
                System.out.print(val + " ");
            }
            System.out.println();
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
	    int k = s.nextInt();
            int val = s.nextInt();
            root = new Node(val);

            Queue<Node> queue = new LinkedList<>();

            queue.add(root);

            while(!queue.isEmpty())
            {
                //	Scanner s = new Scanner(System.in);
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

        public HashMap<Integer,ArrayList<Integer>> bottomDisplay()
        {
            HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
            bottomDisplay(this.root,map,0);
            //	System.out.println(map);
            return map;

        }

        private void bottomDisplay(Node node,HashMap<Integer,ArrayList<Integer>> map, int d)
        {
            if(node == null)
            {
                return;
            }

            if(!map.containsKey(d))
            {
                map.put(d, new ArrayList<>());//Arrays.asList(node.data)
            }

            //LvlData temp = new LvlData(node.data,lvl);
            // ArrayList<Integer> temp = map.get(d);
            // temp.add(node.data);
            map.get(d).add(node.data);


            bottomDisplay(node.left, map, d-1);
            bottomDisplay(node.right, map, d+1);

        }
    }
}
