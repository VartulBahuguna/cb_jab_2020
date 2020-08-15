package HeapPractice;


import java.util.ArrayList;
import java.util.HashMap;


public class Heapeg<T extends Comparable<T>>
{
    ArrayList<T> data = new ArrayList<>();
    HashMap<T, Integer> map = new HashMap<>();

    public void add(T val)
    {
        data.add(val);
        map.put(val, this.data.size() -1);
        upheapify(data.size() - 1);
    }

    private void upheapify(int ci)
    {
        int pi = (ci - 1) / 2;

        if(this.data.get(ci).compareTo(this.data.get(pi)) < 0)
        {
            swap(this.data, ci, pi);
            upheapify(pi);
        }

    }

    public T getParent(int child)
    {
        return this.data.get((child - 1) / 2);
    }

    private void swap(ArrayList<T> lst, int i, int j)
    {
        T ith = lst.get(i);
        T jth = lst.get(j);
        map.put(ith, j);
        map.put(jth, i);
        lst.set(i,jth);
        lst.set(j, ith);

    }

    public int getSize()
    {
        return this.data.size();
    }

    public boolean isEmpty()
    {
        return this.getSize() == 0;
    }


    public void display()
    {
        System.out.println(this.data + "\n" + this.map);
    }

    public T rem()
    {
        T removed = this.data.get(0);

        this.swap(this.data, 0 , this.getSize() - 1);

        this.data.remove(data.size() - 1);

        downheapify(0);

        map.remove(removed);

        return removed;
    }

    private void downheapify(int pi)
    {
        int mini = pi;

        int lci = (pi * 2) + 1;
        int rci = (pi * 2) + 2;

        if(lci < this.data.size() && this.data.get(mini).compareTo(this.data.get(lci)) > 0)
        {
            mini = lci;
        }
        if(rci < this.data.size() && this.data.get(mini).compareTo(this.data.get(rci)) > 0)
        {
            mini = rci;
        }
        if(mini != pi)
        {
            swap(this.data, mini, pi);
            upheapify(mini);
        }
    }

    public T getTop()
    {
        return this.data.get(0);
    }

    public  void updatePriority(T pair)
    {
        int index = map.get(pair);
        upheapify(index);
    }
}
