package practice;

import java.util.*;

public class Pairing
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);


        int cities = s.nextInt();
        int roads = s.nextInt();

        Graph town = new Graph();

        for(int i = 0; i < cities; ++i)
        {
            town.addVertex(i);
        }
        for(long i = 1; i <= roads; ++i)
        {
            int a = s.nextInt();
            int b = s.nextInt();

            town.addEdge(a, b);
        }

        System.out.println(town.cityChoose(cities));

    }

    static class Graph
    {
        private HashMap<Integer, Vertex> vtces = new HashMap<>();

        private class Vertex
        {
            HashMap<Integer, Integer> nbr = new HashMap<>();

//            Vertex()
//            {
//                HashMap<Long, Long> nbr = new HashMap<>();
//            }

        }

        public void addVertex(int vetx)
        {
            this.vtces.put(vetx, new Vertex());
        }

        public void addEdge(int vetx1, int vetx2)
        {
            this.vtces.get(vetx1).nbr.put(vetx2, 1);
            this.vtces.get(vetx2).nbr.put(vetx1, 1);
        }

        public ArrayList<Integer> connectedComp(int cities)
        {
            Queue<Integer> queue = new LinkedList<>();
            ArrayList<Integer> comp = new ArrayList<>();
            int town_in_each_comp = 0;
            Set<Integer> visited = new HashSet<>();
            for(int i = 0; i < cities; ++i)
            {
                if(visited.contains(i))
                {
                    continue;
                }
                else
                {
                    town_in_each_comp = 0;
                    queue.add(i);
                    visited.add(i);
                    town_in_each_comp++;
                }

                while(!queue.isEmpty())
                {
                    int key = queue.remove();
                    Vertex v = vtces.get(key);
                    for(int padosi : v.nbr.keySet())
                    {
                        if(visited.contains(padosi))
                        {
                            continue;
                        }
                        queue.add(padosi);
                        visited.add(padosi);
                        town_in_each_comp++;
                    }
                }
                comp.add(town_in_each_comp);
            }

            return comp;
        }

        // public long minCost(int cities, int roads, long temple, long repairRoad)
        // {
        //     if(temple <= repairRoad)
        //     {
        //         return temple*cities;
        //     }

        //     long connected_comp = connectedComp(cities);

        //     return connected_comp*temple + (cities - connected_comp)*repairRoad;
        // }

        public long cityChoose(int cities)
        {
            ArrayList<Integer> comp = connectedComp(cities);

            long ans = 0;

            for(int i = 0; i < comp.size()-1; ++i)
            {
                int temp = comp.get(i);
                for(int j = i+1; j < comp.size(); ++j)
                {
                    ans += temp*comp.get(j);
                }
            }

            return ans;
        }
    }
}
