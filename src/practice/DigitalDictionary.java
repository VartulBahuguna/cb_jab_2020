package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class DigitalDictionary
{
    public static void main(String args[],String st)
    {
        Scanner s = new Scanner(System.in);

        Triet trie = new Triet();

        int words = s.nextInt();

        for(int i = 0; i < words; ++i)
        {
            String str = s.next();
            trie.addWord(str);
        }

        int n = s.nextInt();

        for(int i = 0; i < n; ++i)
        {
            String str = s.next();
         //   System.out.println(str);
            trie.display(str);
        }


    }


    static class Triet
    {
        Node root;
        private class Node
        {

            char ch;
            boolean isLast;
            HashMap<Character, Node> children;
            Node(char ch, boolean isLast)
            {
                this.ch = ch;
                this.isLast = isLast;
                this.children = new HashMap<>();
            }
        }

        Triet()
        {
            this.root = new Node('\0', false);
        }

        public void addWord(String word)
        {
            addWord(this.root, word);
        }

        private void addWord(Node parent, String word)
        {
            if(word.isEmpty())
            {
                parent.isLast = true;
                return;
            }

            char letter = word.charAt(0);
            word = word.substring(1);
            Node child = parent.children.get(letter);
            if(child == null)
            {
                child = new Node(letter,false);
                parent.children.put(letter, child);

            }
            addWord(child,word);
        }

        public void display(String pre)
        {
            display(this.root, pre,"");
        }

        private void display(Node parent, String pre, String wsf)
        {
            if(pre.isEmpty())
            {
                //	System.out.println(wsf);
                restWord(parent,wsf);
                return;
            }

            char letter = pre.charAt(0);
            wsf += letter;
            System.out.println(wsf);
            pre = pre.substring(1);
            Node child = parent.children.get(letter);
            if(child == null)
            {
                child = new Node(letter,false);
                parent.children.put(letter, child);
                addWord(child,pre);
                return;
            }

            display(child,pre,wsf);
        }

        private void restWord(Node node, String wsf)
        {
            if(node.isLast)
            {
                System.out.println(wsf);
            }
            for(char c : node.children.keySet())
            {
                restWord(node.children.get(c), wsf + c);
            }
        }
    }

    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        Trie trie = new Trie();

        int words = s.nextInt();

        for(int i = 0; i < words; ++i)
        {
            String str = s.next();
            trie.addWord(str);
        }

        int n = s.nextInt();

        for(int i = 0; i < n; ++i)
        {
            String str = s.next();
            //   System.out.println(str);
            ArrayList<String> list = trie.display(str);
            if(list != null)
            {
            Collections.sort(list);
                for (String s1 : list)
                {
                    System.out.println(s1);
                }
            }
        }


    }

    static class Trie
    {
        Node root;
        private class Node
        {
            char ch;
            boolean isLast;
            HashMap<Character, Node> children;
            Node(char ch, boolean isLast)
            {
                this.ch = ch;
                this.isLast = isLast;
                this.children = new HashMap<>();
            }
        }

        Trie()
        {
            this.root = new Node('\0', false);
        }

        public void addWord(String word)
        {
            addWord(this.root, word);
        }

        private void addWord(Node parent, String word)
        {
            if(word.isEmpty())
            {
                parent.isLast = true;
                return;
            }

            char letter = word.charAt(0);
            word = word.substring(1);
            Node child = parent.children.get(letter);
            if(child == null)
            {
                child = new Node(letter,false);
                parent.children.put(letter, child);

            }
            addWord(child,word);
        }

        public ArrayList<String> display(String pre)
        {
            return  display(this.root, pre,"");
        }

        private ArrayList<String> display(Node parent, String pre, String wsf)
        {
            ArrayList<String> list;
            if(pre.isEmpty())
            {
                //	System.out.println(wsf);
                list = (restWord(parent,wsf));
                return list;
            }

            char letter = pre.charAt(0);
            wsf += letter;
            //System.out.println(wsf);
            pre = pre.substring(1);
            Node child = parent.children.get(letter);
            if(child == null)
            {
                child = new Node(letter,false);
                parent.children.put(letter, child);
                addWord(child,pre);
                return null;
            }

            list = (display(child,pre,wsf));

            return list;
        }

        private ArrayList<String> restWord(Node node, String wsf)
        {
            ArrayList<String> list = new ArrayList<>();
            if(node.isLast)
            {
                list.add(wsf);
            }
            for(char c : node.children.keySet())
            {
                list.addAll(restWord(node.children.get(c), wsf + c));
            }

            return list;
        }
    }
}
