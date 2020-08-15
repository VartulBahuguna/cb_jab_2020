package lec_29_04_2020;


import java.util.*;

public class AdjacenyMapGraph<T>
{

    private Map<T,Vertex> vertexMap ;
    private Map<Vertex,Vertex> parents ;

    public AdjacenyMapGraph()
    {
        this.parents = new HashMap<>();
        this.vertexMap = new HashMap<>();
     }

    public void addVertex(T val)
    {
        vertexMap.put(val, new Vertex(val));
    }


    public void addEdge(T first, T second)
    {

        if(vertexMap.containsKey(first) && vertexMap.containsKey(second))
        {
            vertexMap.get(first).neighbours.put(vertexMap.get(second),1);
            vertexMap.get(second).neighbours.put(vertexMap.get(first),1);
        }
    }

    public void addEdge(T first, T second, int size)
    {

        if(vertexMap.containsKey(first) && vertexMap.containsKey(second))
        {
            vertexMap.get(first).neighbours.put(vertexMap.get(second),size);
            vertexMap.get(second).neighbours.put(vertexMap.get(first),size);
        }
    }


    public void display()
    {

        for (Vertex vertex: vertexMap.values())
        {
            System.out.print(vertex.value + " => ");

            for (Vertex padosi: vertex.neighbours.keySet())
            {
                System.out.print(padosi.value + "(" + vertex.neighbours.get(padosi) + ") ");
            }
            System.out.println();
        }
        System.out.println();
    }


    public void setParents()
    {
        for (Vertex vertex: vertexMap.values())
        {
            parents.put(vertex, null);
        }
    }


    public AdjacenyMapGraph<T> Kruskal()
    {

        setParents();

        AdjacenyMapGraph<T> map = new AdjacenyMapGraph<>();

        ArrayList<Edge> edge = new ArrayList<>();

        for (T vertex:vertexMap.keySet())
        {
            map.addVertex(vertex);
        }

        for (Vertex vertex: vertexMap.values())
        {
            for (Vertex padosi: vertex.neighbours.keySet())
            {
                edge.add(new Edge(vertex,padosi,vertex.neighbours.get(padosi)));
            }
        }

        Collections.sort(edge);
        for (Edge e : edge)
        {
            if(union(e.first, e.second))
            {
                map.addEdge(e.first.value,e.second.value,e.weight);
            }
        }

        return map;
    }


    public boolean union(Vertex first, Vertex second)
    {
        Vertex f = findparent(first);
        Vertex s = findparent(second);

        if(f != s)
        {
            parents.put(f, s);
            return true;
        }

        return false;
    }

    private Vertex findparent(Vertex vertex)
    {

        while (parents.get(vertex) != null)
        {
            vertex = parents.get(vertex);
        }

        return vertex;
    }


     private class Edge implements Comparable<Edge>
    {
        Vertex first;
        Vertex second;
        int weight;

        public Edge(Vertex first, Vertex second, int weight)
        {
            this.first = first;
            this.second = second;
            this.weight = weight;
        }


        @Override
        public int compareTo(Edge o) {
            return this.weight-o.weight;

        }
    }


    private class Vertex
    {
        T value;

        Map<Vertex,Integer> neighbours = new HashMap<>();
        public Vertex(T value)
        {
            this.value = value;
        }
    }


    private class primsPairs
    {
        String vname;
        String acqvaname;
        int cost;
    }



    public int prims(){

        int totalcost = 0;

        Set<Vertex> visited = new HashSet<>();

        PriorityQueue<Edge> priorityQueue = new PriorityQueue<>();

        Vertex vertex = vertexMap.values().iterator().next();

        visited.add(vertex);

        for (Vertex neighbour: vertex.neighbours.keySet()) {
            priorityQueue.add(new Edge(vertex, neighbour, vertex.neighbours.get(neighbour)));
        }

        while (!priorityQueue.isEmpty()){
            Edge temp = priorityQueue.remove();
            if (visited.contains(temp.first) && visited.contains(temp.second)){
                continue;
            }

            totalcost += temp.weight;

            if (!visited.contains(temp.first)){
                for (Vertex neighbour: temp.first.neighbours.keySet()) {
                    priorityQueue.add(new Edge(temp.first, neighbour, temp.first.neighbours.get(neighbour)));
                }

                visited.add(temp.first);
            }

            if (!visited.contains(temp.second)){
                for (Vertex neighbour: temp.second.neighbours.keySet()) {
                    priorityQueue.add(new Edge(temp.second, neighbour, temp.second.neighbours.get(neighbour)));
                }

                visited.add(temp.second);
            }
        }

        return totalcost;

    }



}
