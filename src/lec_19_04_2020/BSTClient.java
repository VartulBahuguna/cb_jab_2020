package lec_19_04_2020;

public class BSTClient
{
    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();

//        tree.insert(5);
//        tree.insert(3);
//        tree.insert(7);
//        tree.insert(4);
//        tree.display();
        int[] pre = {1, 2, 4, 5, 3};
        int[] in = {4, 2, 5, 1, 3};
        tree.makefromprein(pre, in);
        tree.display();
    }
}
