package lec_26_04_2020;

import java.util.*;

public class GraphUsingAdjacencyList<T extends Comparable<String>>
{

    LinkedList<Vertex> vertices = new LinkedList<>();

    public void addvertex(T value)
    {
        vertices.add(new Vertex(value));
    }

    public void addedge(T first, T second)
    {
        Vertex f = get(first);
        Vertex s = get(second);

        if(f != null && s != null)
        {
            f.neighbours.add(s);
            s.neighbours.add(f);
        }
    }


    private Vertex get(T val)
    {
        for (Vertex vertex: vertices)
        {
            if(vertex.value == val)
            {
                return vertex;
            }
        }
        return  null;
    }


    public void display()
    {
        for (Vertex vertex: vertices)
        {
            System.out.print(vertex.value  +" => ");

            for (Vertex padosi: vertex.neighbours)
            {
                System.out.print(padosi.value + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


    public void BFT()
    {

        Queue<Vertex> queue = new LinkedList<>();
        Set<Vertex> visited = new HashSet<>();

        queue.add(vertices.get(0));
        visited.add(vertices.get(0));

        while(!queue.isEmpty())
        {
            Vertex vertex = queue.remove();
            System.out.println(vertex.value);

            for (Vertex padosi : vertex.neighbours)
            {
                if(!visited.contains(padosi))
                {
                    visited.add(padosi);
                    queue.add(padosi);
                }
            }
        }

    }


    public int connectedcomponents()
    {
        int cnt = 0;
        Set<Vertex> visited = new HashSet<>();

        for (Vertex vertex : vertices)
        {
            if (!visited.contains(vertex))
            {

                cnt++;

                Queue<Vertex> queue = new LinkedList<>();

                queue.add(vertex);
                visited.add(vertex);

                while (!queue.isEmpty())
                {

                    Vertex temp = queue.remove();
                    System.out.println(temp.value);

                    for (Vertex padosi : temp.neighbours)
                    {
                        if (!visited.contains(padosi))
                        {
                            visited.add(padosi);
                            queue.add(padosi);
                        }
                    }
                }

                System.out.println();
            }
        }
        return cnt;
    }


    public void DFT(){

        Stack<Vertex> stack = new Stack<>();
        Set<Vertex> visited = new HashSet<>();


        stack.push(vertices.get(0));
        visited.add(vertices.get(0));

        while(!stack.isEmpty())
        {
            Vertex vertex = stack.pop();

            System.out.println(vertex.value);

            for (Vertex padosi: vertex.neighbours)
            {
                if(!visited.contains(padosi))
                {
                    visited.add(padosi);
                    stack.push(padosi);
                }
            }
        }


    }




    public boolean bipartite()
    {
        Queue<Vertex> queue = new LinkedList<>();
        Set<Vertex> visited = new HashSet<>();

        Set<Vertex> red = new HashSet<>();
        Set<Vertex> green = new HashSet<>();

        queue.add(vertices.get(0));
        visited.add(vertices.get(0));
        red.add(vertices.get(0));

       while(!queue.isEmpty())
       {
            Vertex temp = queue.remove();

            if(red.contains(temp))
            {
                for (Vertex padosi: temp.neighbours)
                {
                    if(!visited.contains(padosi))
                    {
                        green.add(padosi);
                        visited.add(padosi);
                        queue.add(padosi);
                    }
                    else if(red.contains(padosi))
                    {
                        return  false;
                    }
                }
            }
            else if(green.contains(temp))
            {
                for (Vertex padosi: temp.neighbours)
                {
                    if(!visited.contains(padosi))
                    {
                        red.add(padosi);
                        visited.add(padosi);
                        queue.add(padosi);
                    }
                    else if(green.contains(padosi))
                    {
                        return  false;
                    }
                }
            }
       }
        return true;
    }


    class Vertex
    {
        T value;

        LinkedList<Vertex> neighbours;

        public Vertex(T value)
        {
            this.value = value;
            this.neighbours = new LinkedList<>();
        }

    }



}
