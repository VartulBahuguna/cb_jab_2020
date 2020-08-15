package practice;
import java.util.*;

public class ReligiousPeople
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        while(t-- != 0)
        {
            long cities = s.nextInt();
            long roads = s.nextInt();
            long temple = s.nextInt();
            long repairRoad = s.nextInt();

            Graph town = new Graph();

            for(long i = 1; i <= cities; ++i)
            {
                town.addVertex(i);
            }
            for(long i = 1; i <= roads; ++i)
            {
                long a = s.nextInt();
                long b = s.nextInt();

                town.addEdge(a, b);
            }

            System.out.println(town.minCost(cities, roads, temple, repairRoad));
        }
    }

    static class Graph
    {
        private HashMap<Long, Vertex> vtces = new HashMap<>();

        private class Vertex
        {
            HashMap<Long, Long> nbr = new HashMap<>();

            Vertex()
            {
                HashMap<Long, Long> nbr = new HashMap<>();
            }

        }

        public void addVertex(long vetx)
        {
            this.vtces.put(vetx, new Vertex());
        }

        public void addEdge(long vetx1, long vetx2)
        {
            this.vtces.get(vetx1).nbr.put(vetx2, 1L);
            this.vtces.get(vetx2).nbr.put(vetx1, 1L);
        }

        public long connectedComp(long cities)
        {
            Queue<Long> queue = new LinkedList<>();
            long comp = 0;
            Set<Long> visited = new HashSet<>();
            for(long i = 1; i <= cities; ++i)
            {
                if(visited.contains(i))
                {
                    continue;
                }
                else
                {
                    queue.add(i);
                    comp++;
                }

                while(!queue.isEmpty())
                {
                    long key = queue.remove();
                    Vertex v = vtces.get(key);
                    for(long padosi : v.nbr.keySet())
                    {
                        if(visited.contains(padosi))
                        {
                            continue;
                        }
                        queue.add(padosi);
                        visited.add(padosi);
                    }
                }

            }

            return comp;
        }

        public long minCost(long cities, long roads, long temple, long repairRoad)
        {
            if(temple <= repairRoad)
            {
                return temple*cities;
            }

            long connected_comp = connectedComp(cities);

            return connected_comp*temple + (cities - connected_comp)*repairRoad;
        }
    }
}
