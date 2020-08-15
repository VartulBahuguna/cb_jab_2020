package Huffman_Coding;

public class TriesClient
{
    public static void main(String[] args)
    {
        Tries trie = new Tries();

        trie.addWord("arts");
        trie.addWord("art");
        trie.addWord("bug");
        trie.addWord("boy");
        trie.addWord("sea");
        trie.addWord("see");
        trie.addWord("seen");
        trie.addWord("amit");

        trie.Display();

      //  System.out.println(trie.search("amit"));

   //     System.out.println(trie.remove("art"));
        System.out.println();
        System.out.println(trie.search("arts"));
        System.out.println(trie.search("art"));
        System.out.println(trie.search("bug"));
        System.out.println(trie.search("boy"));
        System.out.println(trie.search("sea"));
        System.out.println(trie.search("harry"));
        System.out.println();
        trie.display();

    }
}
