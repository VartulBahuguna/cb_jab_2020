package Huffman_Coding;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Tries
{
    private Node root ;
    private int numWords;

    private class Node
    {
        char data;
        boolean isTerminal;
        HashMap<Character, Node> children ;

        public Node(char data, boolean isTerminal)
        {
            this.data = data;
            this.isTerminal = isTerminal;
            this.children = new HashMap<>();
        }

//        @Override
//        public String toString() {
//            return "Node{" +
//                    "data=" + data +
//                    ", isTerminal=" + isTerminal +
//                    ", children=" + children +
//                    '}';
//        }
    }

    public Tries() {
        this.root = new Node('\0',false);
        this.numWords = 0;
    }

    public int getNumWords()
    {
        return numWords;
    }

    public void addWord(String word)
    {
        addWord(this.root, word);
    }

    private void addWord(Node parent, String word)
    {
        if(word.length() == 0)
        {
            if(parent.isTerminal)
            {
                //word already exist
            }
            else
            {
                parent.isTerminal = true;
                numWords++;
            }
            return;
        }
        char cc = word.charAt(0);
        String ros = word.substring(1);

        Node child = parent.children.get(cc);

        if(child == null)
        {
            child  = new Node(cc, false);
            parent.children.put(cc, child);
        }

        this.addWord(child, ros);
    }

    public  void display()
    {
        display(root,"");
    }

    private void display(Node node, String psf)
    {
        if(node.isTerminal)
        {
            System.out.println(psf);
        }
        Set<Map.Entry<Character, Node>> set = node.children.entrySet();

        for(Map.Entry<Character, Node> entry : set)
        {
            display(entry.getValue(), psf + entry.getKey());
        }

    }

    public  void Display()
    {
        Display(root,"");
    }

    private void Display(Node node, String psf)
    {
        if(node.isTerminal)
        {
            System.out.println(psf);
        }
      //  Set<Map.Entry<Character, Node>> set = node.children.entrySet();

        for(Character ch : node.children.keySet())
        {
            display(node.children.get(ch), psf + ch);
        }

    }

    public boolean search(String word)
    {
        return this.search(this.root, word);
    }

    private boolean search(Node node, String word)
    {

        if(word.length() == 0)
        {
            return node.isTerminal;

        }

        char ch = word.charAt(0);
        String ros = word.substring(1);
        Node child = node.children.get(ch);
     //   System.out.println(child.children);
        if(child == null)
        {
            return false;
        }

        return  this.search(child,ros);

    }

    public boolean remove(String word)
    {
        return remove(this.root, word);
    }

    private boolean remove(Node node, String word)
    {

        if(word.length() == 0)
        {
            if(node.isTerminal)
            {
                node.isTerminal = false;
                numWords--;
                return true;
            }
            else
            {
                return  false;
            }
        }

        char ch = word.charAt(0);

        Node child = node.children.get(ch);

        if(child == null)
        {
            return  false;
        }

        boolean val =  remove(child, word.substring(1));

        if(val && child.children.size() == 0)
        {
            node.children.remove(ch);
        }
        return val;
    }
}
