package practice;

import java.util.*;

public class Treebottomview
{
    public static void main(String[] args)
    {
        BTree tree = new BTree();
        tree.insert();
        HashMap<Integer,LvlData> map = tree.bottomDisplay();
        //tree.topDisplay(map);

        ArrayList<Integer> list = new ArrayList<>(map.keySet());

        Collections.sort(list);

        for(int key : list)
        {
            System.out.print(map.get(key).data + " ");
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

        public HashMap<Integer,LvlData> bottomDisplay()
        {
            HashMap<Integer,LvlData> map = new HashMap<>();
            bottomDisplay(this.root,map,0,0);
            //	System.out.println(map);
            return map;

        }

        private void bottomDisplay(Node node,HashMap<Integer,LvlData> map, int d,int lvl)
        {
            if(node == null)
            {
                return;
            }

            if(!map.containsKey(d))
            {
                map.put(d, new LvlData(node.data,lvl));
            }
            else if(map.get(d).lvl < lvl)
            {
                LvlData temp = new LvlData(node.data,lvl);
                map.put(d,temp);
            }

            bottomDisplay(node.right, map, d+1,lvl+1);
            bottomDisplay(node.left, map, d-1,lvl+1);
        }
    }

    static class LvlData
    {
        int lvl;
        int data;
        public LvlData(int data, int lvl)
        {
            this.lvl = lvl;
            this.data = data;
        }
    }
}
