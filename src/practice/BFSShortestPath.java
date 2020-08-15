package practice;

import java.util.*;

public class BFSShortestPath
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        int query = s.nextInt();

        while(query-- != 0)
        {
            Graph graph = new Graph();
            int n = s.nextInt();
            for(int i = 1; i <= n; ++i)
            {
                graph.addVertex(i);
            }

            int m = s.nextInt();

            for(int i = 1; i <= m; ++i)
            {
                int v1 = s.nextInt();
                int v2 = s.nextInt();

                graph.addEdge(v1, v2);
            }

            graph.BFS(s.nextInt(), n);
        }
    }

    static class Graph
    {
        HashMap<Integer, nbrs> vtces = new HashMap<>();

        private class nbrs
        {
            HashMap<Integer, Integer> nbr = new HashMap<>();
        }

        public void addVertex(int vname)
        {
            if(vtces.containsKey(vname))
            {
                return;
            }

            vtces.put(vname, new nbrs());
        }

        public void addEdge(int vname1, int vname2)
        {
            if(!vtces.containsKey(vname1))
            {
                this.addVertex(vname1);
            }
            if(!vtces.containsKey(vname2))
            {
                this.addVertex(vname2);
            }
            vtces.get(vname1).nbr.put(vname2, 6);
            vtces.get(vname2).nbr.put(vname1, 6);
        }

        public void BFS(int startVertex, int n)
        {
            Set<Integer> visited = new HashSet<>();

            visited.add(startVertex);

            for(int i = 1; i <= n; ++i)
            {
                if(visited.contains(i))
                {
                    continue;
                }

                visited.add(i);

                Queue<pair> queue = new LinkedList<>();
                Set<Integer> unique = new HashSet<>();

                pair np = new pair();
                np.vertex = startVertex;
                np.psf = 0;
                queue.add(np);
                unique.add(startVertex);

                boolean notFound = true;

                //		queue.add(vtces.get(startVertex));


                //		unique.add(startVertex)
                int cnt = 0;
                while(!queue.isEmpty())
                {
                    pair vrtx = queue.remove();
                    if(vrtx.vertex == i)
                    {
                        System.out.print(vrtx.psf + " ");
                        notFound = false;
                        break;
                    }

                    for(int j : vtces.get(vrtx.vertex).nbr.keySet())
                    {
                        if(!unique.contains(j))
                        {
                            pair temp = new pair();
                            temp.vertex = j;
                            temp.psf = vrtx.psf + 6;
                            unique.add(j);
                            queue.add(temp);
                        }
                    }
                    cnt += 6;
                }
                if(notFound)
                {
                    System.out.print("-1 ");
                }
            }

            System.out.println();
        }

        private class pair
        {
            int vertex;
            int psf;
        }

        public void BFT(int startVertex, int n)
        {
            HashMap<Integer, Integer> visited = new HashMap<>();

            visited.put(startVertex, 0) ;

            boolean notFirst = false;

            Queue<Integer> queue = new LinkedList<>();

            queue.add(startVertex);

            while (!queue.isEmpty())
            {
                int key = queue.remove();
                if(visited.containsKey(key) && notFirst)
                {

                    continue;

                }

                notFirst = true;

                for (int padosi : vtces.get(key).nbr.keySet())
                {
                    if(!visited.containsKey(padosi))
                    {
                        visited.put(padosi, visited.get(key) + 6);
                        queue.add(padosi);
                    }
                }
            }

            for (int i = 1; i <= n; i++)
            {
                if(i == startVertex)
                {
                    continue;
                }

                if(visited.containsKey(i))
                {
                    System.out.print(visited.get(i) + " ");
                }
                else
                {
                    System.out.print("-1 ");
                }
            }
            System.out.println();
        }


    }
}
