package lec_26_04_2020;

public class GraphLClient
{
    public static void main(String[] args)
    {
        GraphUsingAdjacencyList<String> graph = new GraphUsingAdjacencyList<>();

        graph.addvertex("A");
        graph.addvertex("B");
        graph.addvertex("C");
        graph.addvertex("D");
        graph.addvertex("E");
        graph.addvertex("F");



        graph.addedge("A","C");
        graph.addedge("C","D");
        graph.addedge("A","B");
        graph.addedge("A","D");
        graph.addedge("C","D");


        graph.display();

        graph.BFT();
        System.out.println();
        graph.DFT();

        System.out.println();
        System.out.println(graph.connectedcomponents());
        System.out.println(graph.bipartite());
    }
}
