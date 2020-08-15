package Graph;

import HeapPractice.Heapeg;

import java.util.*;

public class Graph
{
    HashMap<String, Vertex> vtces;

    public Graph()
    {
        this.vtces = new HashMap<>();
    }

    private  class Vertex
    {
        HashMap<String, Integer> nbrs;

        public Vertex() {
            this.nbrs = new HashMap<>();
        }
    }

    public int numVertex()
    {
        return this.vtces.size();
    }

    public  boolean containsVertex(String vname)
    {
        return this.vtces.containsKey(vname);
    }

    public void addVertex(String vname)
    {
        this.vtces.put(vname, new Vertex());
    }

    public void removeVertex(String vname)
    {

//        LENGTHY METHOD
//        for (Vertex vertex: this.vtces.values())
//        {
//            for (String edge : vertex.nbrs.keySet())
//            {
//                if(edge == vname)
//                {
//                    vertex.nbrs.remove(edge);
//                }
//            }
//        }
//
//        this.vtces.remove(vname);

        Vertex vertex = this.vtces.get(vname);

//        for (String key : vertex.nbrs.keySet())
//        {
//            //this.vtces.get(key).nbrs.remove(vname);    COMPLEX METHOD
//            Vertex temp = this.vtces.get(key);
//            temp.nbrs.remove(vertex);
//        }
//
//        this.vtces.remove(vertex);


//        MORE SIMPLIFIED METHOD
        ArrayList<String> keys = new ArrayList<>(vertex.nbrs.keySet());

        for (String key : keys)
        {
            Vertex temp = this.vtces.get(key);
            temp.nbrs.remove(vname);
        }
        this.vtces.remove(vname);
    }

    public int numEdges()
    {
        int sum  = 0;

        //        ALTERNATE WAY
//        ArrayList<String> keys = new ArrayList<>(vtces.keySet());
//        for (String key: keys)
//        {
//            Vertex vertex = vtces.get(key);
//            sum += vertex.nbrs.size();
//        }


        for (Vertex vertex: this.vtces.values())
        {
            sum += vertex.nbrs.size();
        }
        return sum / 2;
    }

    public boolean containsEdge(String vname1, String vname2)
    {
        Vertex v1 = this.vtces.get(vname1);
        Vertex v2 = this.vtces.get(vname2);

        if(v1 == null || v2 == null)
        {
            return false;
        }

        return v1.nbrs.containsKey(vname2);
    }

    public void addEdge(String vname1, String vname2, int Edgewt)
    {


        if(this.vtces.get(vname1) == null)
        {
            this.addVertex(vname1);
        }
        if(this.vtces.get(vname2) == null)
        {
            this.addVertex(vname2);
        }
        Vertex v1 = this.vtces.get(vname1);
        Vertex v2 = this.vtces.get(vname2);
        if(v1.nbrs.containsKey(vname2))
        {
            return;
        }

        v1.nbrs.put(vname2, Edgewt);
        v2.nbrs.put(vname1, Edgewt);

    }

    public void addEdge(String vname1, String vname2)
    {
        Vertex v1 = this.vtces.get(vname1);
        Vertex v2 = this.vtces.get(vname2);

        if(v1 == null)
        {
            this.addVertex(vname1);
        }
        if(v2 == null)
        {
            this.addVertex(vname2);
        }
        if(v1.nbrs.containsKey(vname2))
        {
            return;
        }

        v1.nbrs.put(vname2, 1);
        v2.nbrs.put(vname1, 1);

    }

    public void removeEdge(String vname1, String vname2)
    {
        Vertex v1 = this.vtces.get(vname1);
        Vertex v2 = this.vtces.get(vname2);

        if(v1 == null || v2 == null||!v1.nbrs.containsKey(vname2))
        {
            return;
        }

        v1.nbrs.remove(vname2);
        v2.nbrs.remove(vname1);
    }

    public void display()
    {
        for (String vname : this.vtces.keySet())
        {
            System.out.print(vname + " -> ");
            Vertex vertex = this.vtces.get(vname);
            for (String vnbr : vertex.nbrs.keySet())
            {
                int edgeWt = vertex.nbrs.get(vnbr);
                System.out.print(vnbr + "(" + edgeWt + ") ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public boolean hasPath(String vname1, String  vname2)
    {
        if(this.vtces.get(vname1) == null || this.vtces.get(vname2) == null)
        {
            return false;
        }
        Queue<String> queue = new LinkedList();

        Set<String> visited = new HashSet<>();

        queue.add(vname1);
        visited.add(vname1);
        while(!queue.isEmpty())
        {
            String key = queue.remove();
            Vertex vertex = this.vtces.get(key);

            if(this.containsEdge(key, vname2))//vertex.nbrs.containsKey(vname2)
            {
                return true;
            }
            for (String nbrvrt: vertex.nbrs.keySet())
            {
                if(!visited.contains(nbrvrt))
                {
                    queue.add(nbrvrt);
                    visited.add(nbrvrt);
                }
            }
        }

        return false;
    }

    public boolean BFS(String src, String dest)
    {
        Queue<String > queue = new LinkedList();

        HashMap<String , String> visited = new HashMap<>();

        queue.add(src);

        visited.put(src, src);

        while(!queue.isEmpty())
        {
            String key = queue.remove();

            Vertex vertex = this.vtces.get(key);


            if(this.containsEdge(key, dest))
            {
                System.out.println(visited.get(key) + " -(" + vertex.nbrs.get(dest) + ")-> " + dest);
                return true;
            }

            for (String keys : vertex.nbrs.keySet())
            {
                if(!visited.containsKey(keys))
                {
                    queue.add(keys);
                    visited.put(keys, visited.get(key) + " -(" + vertex.nbrs.get(keys) + ")-> " + keys);
                }
            }
        }

        return false;
    }

    private class pair
    {
        String vname;
        String psf;
    }

    public boolean bfs(String src, String dest)
    {
        Queue<pair> queue = new LinkedList<>();

        HashSet<String> visited = new HashSet<>();
        pair sp = new pair();
        sp.vname = src;
        sp.psf = src;

        queue.add(sp);

        while(!queue.isEmpty())
        {
            pair rp = queue.remove();

            if(visited.contains(rp.vname))
            {
                continue;
            }
            visited.add(rp.vname);

            Vertex vertex =  this.vtces.get(rp.vname);

            if(this.containsEdge(rp.vname, dest))
            {
                System.out.println(rp.psf + " -(" + vertex.nbrs.get(dest) + ")-> " + dest);
                return true;
            }

            for (String key :vertex.nbrs.keySet())
            {
                if(!visited.contains(key))
                {
                    pair temp = new pair();
                    temp.vname = key;
                    temp.psf = rp.psf + " -(" + vertex.nbrs.get(key) + ")-> " + key;
                    queue.add(temp);
                }
            }
        }


        return false;
    }

    public boolean DFS(String src, String dest)
    {

        LinkedList<String> stack = new LinkedList<>();

        HashMap<String, String> visited = new HashMap<>();

        stack.push(src);

        visited.put(src, src);

        while(!stack.isEmpty())
        {
            String key = stack.removeFirst();

            Vertex vertex = this.vtces.get(key);

            if(this.containsEdge(key, dest))
            {
                System.out.println(visited.get(key) + " -(" + vertex.nbrs.get(dest) + ")-> " + dest);
                return true;
            }

            for (String keys : vertex.nbrs.keySet())
            {
                if(!visited.containsKey(keys))
                {
                    visited.put(keys,  visited.get(key) + " -(" + vertex.nbrs.get(keys) + ")-> " + keys);
                    stack.addFirst(keys);
                }
            }
        }



        return false;
    }

    public boolean dfs(String src, String dest)
    {
        Stack<pair> stack = new Stack<>();

        HashSet<String> visited = new HashSet<>();
        pair sp = new pair();
        sp.vname = src;
        sp.psf = src;

        stack.push(sp);

        while(!stack.isEmpty())
        {
            pair rp = stack.pop();

            if(visited.contains(rp.vname))
            {
                continue;
            }
            visited.add(rp.vname);

            Vertex vertex =  this.vtces.get(rp.vname);

            if(this.containsEdge(rp.vname, dest))
            {
                System.out.println(rp.psf + " -(" + vertex.nbrs.get(dest) + ")-> " + dest);
                return true;
            }

            for (String key :vertex.nbrs.keySet())
            {
                if(!visited.contains(key))
                {
                    pair temp = new pair();
                    temp.vname = key;
                    temp.psf = rp.psf + " -(" + vertex.nbrs.get(key) + ")-> " + key;
                    stack.push(temp);
                }
            }
        }


        return false;
    }

    public void BFT()
    {
        Queue<String > queue = new LinkedList();

        HashMap<String , String> visited = new HashMap<>();

        for (String chabi : this.vtces.keySet())

        {
            if(visited.containsKey(chabi))
            {
                continue;
            }
            queue.add(chabi);

            visited.put(chabi, chabi);

            while(!queue.isEmpty())
            {
                String key = queue.remove();

                Vertex vertex = this.vtces.get(key);

                System.out.println(visited.get(key));

                for (String keys : vertex.nbrs.keySet())
                {
                    if(!visited.containsKey(keys))
                    {
                        queue.add(keys);
                        visited.put(keys, visited.get(key) + " -(" + vertex.nbrs.get(keys) + ")-> " + keys);
                //        System.out.println(visited.get(key) + " -(" + vertex.nbrs.get(keys) + ")-> " + keys);
                    }
                }

            }
            System.out.println("*---------*");

        }

    }

    public void bft()
    {
        Queue<pair> queue = new LinkedList<>();

        HashSet<String> visited = new HashSet<>();

        for (String keys : this.vtces.keySet()) {


            if(visited.contains(keys))
            {
                continue;
            }

            pair sp = new pair();
            sp.vname = keys;
            sp.psf = keys;

            queue.add(sp);

            while (!queue.isEmpty())
            {
                pair rp = queue.remove();

                if(visited.contains(rp.vname))
                {
                    continue;
                }

                visited.add(rp.vname);

                Vertex vertex = this.vtces.get(rp.vname);

                System.out.println(rp.psf);

                for (String key : vertex.nbrs.keySet()) {
                    if (!visited.contains(key)) {
                        pair temp = new pair();
                        temp.vname = key;
                        temp.psf = rp.psf + " -(" + vertex.nbrs.get(key) + ")-> " + key;
                        queue.add(temp);
                    }
                }
            }

            System.out.println("*----------------------*");

        }

    }

    public void DFT()
    {
        Stack<String > stack = new Stack<>();

        HashMap<String , String> visited = new HashMap<>();

        for (String chabi : this.vtces.keySet())

        {
            if(visited.containsKey(chabi))
            {
                continue;
            }
            stack.push(chabi);

            visited.put(chabi, chabi);

            while(!stack.isEmpty())
            {
                String key = stack.pop();

                Vertex vertex = this.vtces.get(key);

                System.out.println(visited.get(key));
                for (String keys : vertex.nbrs.keySet())
                {
                    if(!visited.containsKey(keys))
                    {
                        stack.push(keys);
                        visited.put(keys, visited.get(key) + " -(" + vertex.nbrs.get(keys) + ")-> " + keys);
                    //    System.out.println(visited.get(key) + " -(" + vertex.nbrs.get(keys) + ")-> " + keys);
                    }
                }

            }
            System.out.println("*---------*");

        }

    }

    public void dft()
    {
        Stack<pair> stack = new Stack<>();

        HashSet<String> visited = new HashSet<>();

        for (String keys : this.vtces.keySet()) {


            if(visited.contains(keys))
            {
                continue;
            }

            pair sp = new pair();
            sp.vname = keys;
            sp.psf = keys;

            stack.push(sp);

            while (!stack.isEmpty())
            {
                pair rp = stack.pop();

                visited.add(rp.vname);

                Vertex vertex = this.vtces.get(rp.vname);

                System.out.println(rp.psf);

                for (String key : vertex.nbrs.keySet()) {
                    if (!visited.contains(key)) {
                        pair temp = new pair();
                        temp.vname = key;
                        temp.psf = rp.psf + " -(" + vertex.nbrs.get(key) + ")-> " + key;
                        stack.push(temp);
                    }
                }
            }

            System.out.println("*----------------------*");

        }

    }

    public boolean isCyclic()
    {
        Queue<pair> queue = new LinkedList<>();

        HashSet<String> visited = new HashSet<>();

        for (String keys : this.vtces.keySet()) {


            if(visited.contains(keys))
            {
                continue;
            }

            pair sp = new pair();
            sp.vname = keys;
            sp.psf = keys;

            queue.add(sp);

            while (!queue.isEmpty())
            {
                pair rp = queue.remove();

                if(visited.contains(rp.vname))
                {
                    return  true;
                }

                visited.add(rp.vname);

                Vertex vertex = this.vtces.get(rp.vname);

                for (String key : vertex.nbrs.keySet()) {
                    if (!visited.contains(key)) {
                        pair temp = new pair();
                        temp.vname = key;
                        temp.psf = rp.psf + " -(" + vertex.nbrs.get(key) + ")-> " + key;
                        queue.add(temp);
                    }
                }
            }


        }
        return false;
    }

    public boolean iscyclic()
    {
        Queue<String > queue = new LinkedList();

        HashSet<String> visited = new HashSet<>();

        for (String chabi : this.vtces.keySet())

        {
            if(visited.contains(chabi))
            {
                continue;
            }
            queue.add(chabi);

            while(!queue.isEmpty())
            {
                String key = queue.remove();

                Vertex vertex = this.vtces.get(key);

                if(visited.contains(key))
                {
                    return true;
                }
                visited.add(key);

                for (String keys : vertex.nbrs.keySet())
                {
                    if(!visited.contains(keys))
                    {
                       queue.add(keys);
                 //       visited.put(keys, visited.get(key) + " -(" + vertex.nbrs.get(keys) + ")-> " + keys);
                        //        System.out.println(visited.get(key) + " -(" + vertex.nbrs.get(keys) + ")-> " + keys);
                    }
                }

            }

        }

        return false;
    }

    public boolean isConnected()
    {
        Queue<pair> queue = new LinkedList<>();

        HashSet<String> visited = new HashSet<>();

        boolean notConnected = false;

        for (String keys : this.vtces.keySet()) {


            if(visited.contains(keys))
            {
                continue;
            }
            if(notConnected)
            {
                return false;
            }

            notConnected = true;
            pair sp = new pair();
            sp.vname = keys;
            sp.psf = keys;

            queue.add(sp);

            while (!queue.isEmpty())
            {
                pair rp = queue.remove();

                visited.add(rp.vname);

                Vertex vertex = this.vtces.get(rp.vname);

                for (String key : vertex.nbrs.keySet())
                {
                    if (!visited.contains(key))
                    {
                        pair temp = new pair();
                        temp.vname = key;
                        temp.psf = rp.psf + " -(" + vertex.nbrs.get(key) + ")-> " + key;
                        queue.add(temp);
                    }
                }
            }
        }
        return true;
    }

    public boolean isconnected()
    {
        Queue<String > queue = new LinkedList();

        HashSet<String> visited = new HashSet<>();

        boolean notconnected = false;
        for (String chabi : this.vtces.keySet())
        {
            if(visited.contains(chabi))
            {
                continue;
            }
            if(notconnected)
            {
                return false;
            }

            notconnected = true;

            queue.add(chabi);

            while(!queue.isEmpty())
            {
                String key = queue.remove();

                Vertex vertex = this.vtces.get(key);

                visited.add(key);

                for (String keys : vertex.nbrs.keySet())
                {
                    if(!visited.contains(keys))
                    {
                        queue.add(keys);
                        //       visited.put(keys, visited.get(key) + " -(" + vertex.nbrs.get(keys) + ")-> " + keys);
                        //        System.out.println(visited.get(key) + " -(" + vertex.nbrs.get(keys) + ")-> " + keys);
                    }
                }

            }

        }

        return true;
    }

    public ArrayList<ArrayList<String>> connectComponents()
    {
        ArrayList<ArrayList<String>> ans = new ArrayList<>();

        Queue<pair> queue = new LinkedList<>();

        HashSet<String> visited = new HashSet<>();

        for (String keys : this.vtces.keySet()) {


            if(visited.contains(keys))
            {
                continue;
            }

            ArrayList<String> subAns = new ArrayList<>();

            pair sp = new pair();
            sp.vname = keys;
            sp.psf = keys;

            queue.add(sp);

            while (!queue.isEmpty())
            {
                pair rp = queue.remove();

                if(visited.contains(rp.vname))
                {
                    continue;
                }

                visited.add(rp.vname);

                Vertex vertex = this.vtces.get(rp.vname);

                subAns.add(rp.vname);

                for (String key : vertex.nbrs.keySet()) {
                    if (!visited.contains(key)) {
                        pair temp = new pair();
                        temp.vname = key;
                        temp.psf = rp.psf + " -(" + vertex.nbrs.get(key) + ")-> " + key;
                        queue.add(temp);
                    }
                }
            }

            ans.add(subAns);
        }
        return ans;
    }

    public ArrayList<String > connectcomponents()
    {
        Queue<String > queue = new LinkedList();

        HashMap<String , String> visited = new HashMap<>();

        ArrayList<String> ans = new ArrayList<>();

        for (String chabi : this.vtces.keySet())

        {
            if(visited.containsKey(chabi))
            {
                continue;
            }
            queue.add(chabi);

            String subans = "";

            visited.put(chabi, chabi);

            subans += chabi;
            while(!queue.isEmpty())
            {
                String key = queue.remove();

                Vertex vertex = this.vtces.get(key);

                for (String keys : vertex.nbrs.keySet())
                {
                    if(!visited.containsKey(keys))
                    {
                        queue.add(keys);
                        visited.put(keys, visited.get(key) + " -(" + vertex.nbrs.get(keys) + ")-> " + keys);
                        subans = subans + keys;
                        //        System.out.println(visited.get(key) + " -(" + vertex.nbrs.get(keys) + ")-> " + keys);
                    }
                }
            }
            ans.add(subans);
        }
        return ans;
    }

    private class primsPair implements Comparable<primsPair>
    {
        String vname;
        String acqver;
        int wt;

        @Override
        public int compareTo(primsPair o) {
            return this.wt - o.wt;
        }

        @Override
        public String toString() {
            return "primsPair{" +
                    "vname='" + vname + '\'' +
                    ", acqver='" + acqver + '\'' +
                    ", wt=" + wt +
                    "}\n";
        }
    }


    public Graph Prims()
    {
        Graph mst = new Graph();

        HashMap<String , primsPair> map = new HashMap<>();

        Heapeg<primsPair> heap = new Heapeg<>();
        //PriorityQueue<primsPair> heap = new PriorityQueue<>();

        for (String key: vtces.keySet())
        {
            primsPair np = new primsPair();
            np.vname = key;
            np.acqver = null;
            np.wt = Integer.MAX_VALUE;
            map.put(key, np);
            heap.add(np);
        }

     //   heap.display();

        while (!heap.isEmpty())
        {
            primsPair np = heap.rem();
        //    primsPair np = heap.remove();
            map.remove(np.vname);

            if(np.acqver == null)
            {
       //         System.out.println(np.vname);
                mst.addVertex(np.vname);
            }
            else
            {
                mst.addVertex(np.vname);
                mst.addEdge(np.vname, np.acqver, np.wt);
            }

            Vertex vtx = vtces.get(np.vname);

        //    System.out.print(np.vname + " " + vtx.nbrs);
            for (String nbrKey : vtx.nbrs.keySet())
            {

                if(map.containsKey(nbrKey))
                {

                    int oc = map.get(nbrKey).wt;
                    int nc = vtces.get(np.vname).nbrs.get(nbrKey);

                    if(nc < oc)
                    {
                        primsPair gp = map.get(nbrKey);
                        gp.acqver = np.vname;
                        gp.wt = nc;

                        heap.updatePriority(gp);
                    }

          //          System.out.print(" " +nbrKey);
//                    if (vtx.nbrs.get(nbrKey) < map.get(nbrKey).wt) {
              //          System.out.print(" " +nbrKey);
//                        primsPair temp = new primsPair();
//                        temp.vname = nbrKey;
//                        temp.acqver = np.vname;
//                        temp.wt = vtx.nbrs.get(nbrKey);
//
//                        map.put(nbrKey, temp);
//                        heap.remove(map.get(nbrKey));
//                        heap.add(temp);
                 //   }
                }

             //   heap.display();

            }

   //         System.out.println();
        }

        System.out.println("**********************************");
        return mst;
    }

    private class DijkstraPair implements Comparable<DijkstraPair>
    {
        String vname;
        String psf;
        int dist;

        @Override
        public int compareTo(DijkstraPair o) {
            return this.dist - o.dist;
        }

        @Override
        public String toString() {
            return "primsPair{" +
                    "vname='" + vname + '\'' +
                    ", acqver='" + psf + '\'' +
                    ", wt=" + dist +
                    "}\n";
        }
    }


    public HashMap<String, Integer> Dijkstra(String src)
    {
        HashMap<String,Integer> path = new HashMap<>();

        HashMap<String , DijkstraPair> map = new HashMap<>();

        Heapeg<DijkstraPair> heap = new Heapeg<>();
        //PriorityQueue<primsPair> heap = new PriorityQueue<>();

        for (String key: vtces.keySet())
        {
            DijkstraPair np = new DijkstraPair();
            np.vname = key;
            np.psf = "";
            np.dist = Integer.MAX_VALUE;
            if(key.equals(src))
            {
                np.vname = key;
                np.psf = src;
                np.dist = 0;
            }
            map.put(key, np);
            heap.add(np);
        }

   //     heap.display();

        while (!heap.isEmpty())
        {
            DijkstraPair np = heap.rem();
            //    primsPair np = heap.remove();
            map.remove(np.vname);

            path.put(np.psf, np.dist);


            Vertex vtx = vtces.get(np.vname);

            //    System.out.print(np.vname + " " + vtx.nbrs);
            for (String nbrKey : vtx.nbrs.keySet())
            {

                if(map.containsKey(nbrKey))
                {

                    int oc = map.get(nbrKey).dist;
                    int nc = vtces.get(np.vname).nbrs.get(nbrKey) + np.dist;

                    if(nc < oc)
                    {
                        DijkstraPair gp = map.get(nbrKey);
                        gp.psf = np.psf + gp.vname;
                        gp.dist = nc;

                        heap.updatePriority(gp);
                    }

                    //          System.out.print(" " +nbrKey);
//                    if (vtx.nbrs.get(nbrKey) < map.get(nbrKey).wt) {
                    //          System.out.print(" " +nbrKey);
//                        primsPair temp = new primsPair();
//                        temp.vname = nbrKey;
//                        temp.acqver = np.vname;
//                        temp.wt = vtx.nbrs.get(nbrKey);
//
//                        map.put(nbrKey, temp);
//                        heap.remove(map.get(nbrKey));
//                        heap.add(temp);
                    //   }
                }

        //        heap.display();

            }

           // System.out.println();
        }

        System.out.println("**********************************");
        return path;
    }


}