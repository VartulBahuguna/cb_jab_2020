package lec_18_04_2020;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BInaryTreeClient
{
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("input");
        Scanner s  = new Scanner(System.in);

        BinaryTree tree = new BinaryTree();

        tree.insert(s);
        tree.insert(s);
        tree.insert(s);
        tree.display();
        tree.postOrder();
        System.out.println(tree.diameter());
        tree.mirror();
        System.out.println(tree.height());
        tree.display();
    }
}
