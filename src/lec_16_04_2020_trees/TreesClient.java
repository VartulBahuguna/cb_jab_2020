package lec_16_04_2020_trees;

import java.util.Queue;
import java.util.Scanner;

public class TreesClient
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        GenericTrees tree = new GenericTrees();

        tree.insert(s);

        System.out.println("Enter value of k : ");
        int n = s.nextInt();

        tree.display();
        tree.atlevel(0);
    }


}
