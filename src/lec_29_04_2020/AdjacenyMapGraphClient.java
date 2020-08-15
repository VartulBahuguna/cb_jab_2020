package lec_29_04_2020;

public class AdjacenyMapGraphClient
{
    public static void main(String[] args) {

        AdjacenyMapGraph<String> graph = new AdjacenyMapGraph<>();

        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");

        graph.addEdge("A","B",4);
        graph.addEdge("B","C",2);
        graph.addEdge("C","D",1);
        graph.addEdge("A","D",2);

        graph.display();

        AdjacenyMapGraph<String> mapGraph = graph.Kruskal();

        mapGraph.display();
    }
}
