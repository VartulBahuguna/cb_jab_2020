package lec_22_04_2020;

import main.java.hello.HelloWorld;

import java.util.ArrayList;



public class Heap<T>
{

    ArrayList<Integer> list = new ArrayList<Integer>();

    public void insert(int element)
    {
        list.add(element);
        upheap(list.size() - 1);
    }

    private void upheap(int index)
    {
        if(index == 0)
        {
            return;
        }

        int parent = parent(index);

        if(list.get(parent) > list.get(index))
        {
            swap(parent,index);
            upheap(parent);
        }
    }


    private void downheap(int index)
    {
        int min = index;

        int left = leftChild(index);
        int right = rightChild(index);

        if(left < list.size() && list.get(min) > list.get(left))
        {
            min = left;
        }

        if(right < list.size() && list.get(min) > list.get(right))
        {
            min = right;
        }

        if(min != index)
        {
            swap(min, index);
            downheap(min);
        }
        
    }

    public  int remove() throws Exception
    {
        if(list.isEmpty())
        {
            throw new Exception("Khali hai bhai");
        }

        int temp = list.get(0);

        int last = list.remove(list.size() - 1);

        if(!list.isEmpty())
        {
            list.set(0, last);
            downheap(0);
        }

        return temp;
    }



    private void swap(int parent, int index)
    {
        int temp = list.get(parent);
        list.set(parent,list.get(index));
        list.set(index,temp);
    }


    public int parent(int index)
    {
        return (index - 1) / 2;
    }


    public int leftChild(int index)
    {
        return (index * 2)  + 1;
    }


    public  int rightChild(int index)
    {
        return (index * 2) + 2;
    }

    public void display()
    {
        System.out.println(list);
    }


}
