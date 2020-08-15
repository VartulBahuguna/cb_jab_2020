package Graph;

public class GraphClient
{
    public static void main(String[] args)
    {
        Graph graph = new Graph();

        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        graph.addVertex("G");


        graph.addEdge("A", "B",2);
        graph.addEdge("A", "D",6);
        graph.addEdge("B", "C",3);
        graph.addEdge("D", "C",1);
        graph.addEdge("D", "E",8);
        graph.addEdge("E", "F",5);
        graph.addEdge("E", "G", 6);
        graph.addEdge("F", "G", 4);
        graph.addEdge("J", "Q", 11);
        graph.addEdge("K", "Q", 12);
//        graph.addEdge("A", "P", 5);
//        graph.addEdge("F", "P", 13);


//        graph.display();
//        System.out.println(graph.numVertex());
//        System.out.println(graph.numEdges());
//        System.out.println(graph.containsVertex("A"));
//        System.out.println(graph.containsEdge("A" , "B"));
//        System.out.println(graph.containsEdge("A", "E"));
//
//        graph.removeEdge("E", "F");
//        graph.display();
//        graph.removeVertex("F");
//        graph.display();
//        graph.addEdge("E", "F", 6);
//        graph.display();
//        graph.removeEdge("D", "E");
//        System.out.println(graph.hasPath("G", "F"));
//        System.out.println(graph.BFS("A", "F"));
//        System.out.println(graph.bfs("A", "F"));
//        System.out.println(graph.DFS("A","F"));
//        System.out.println(graph.DFS("A","F"));
//        graph.BFT();
//        graph.bft();
//        System.out.println(graph.numEdges());
//        graph.DFT();
//        graph.dft();
//        System.out.println(graph.isCyclic());
//        System.out.println(graph.iscyclic());

//        System.out.println(graph.isConnected());
//        System.out.println(graph.isconnected());

//        System.out.println(graph.connectComponents() + "\n" + graph.connectcomponents());

        graph.Prims().display();
        System.out.println(graph.Dijkstra("A"));
    }
}
