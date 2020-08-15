package lec_04_04_2020;

public class Circular_queue
{
    protected int[] data;
    protected int end;
    protected int front;
    protected int DEFAULT_SIZE=10;
    protected int size;

    public Circular_queue()
    {
        this.data = new int[DEFAULT_SIZE];
        this.end=0;
        this.size = data.length;
        this.front = 0;
    }

    public void push(int element)
    {

        if(isFull())
        {
            return;
        }

        data[end++]=element;
    }

    protected boolean isFull()
    {
        return end==data.length;
    }

    public int pop()
    {

        if(isEmpty())
        {
            return -1;
        }

        int temp=data[0];

        for (int i = 1; i <end ; i++)
        {
            data[i-1]=data[i];
        }

        end--;

        return temp;
    }

    public int dqueue()
    {
        if(isEmpty())
        {
            return -1;
        }
        int temp = data[front];
        front++;
        front = front % data.length;
        return temp;

    }

    public void enqueue(int i)
    {
        if(is_full())
        {
            return;
        }

        data[end++] = i;
        end = end % data.length;
        size --;
    }

    public void display(int[] data, int front, int end)
    {
        for (int i = 0; i < data.length; i++)
        {
            System.out.println(data[(front + i) % data.length]);
        }
    }


    protected boolean is_full()
    {
        return size == data.length;
    }

    protected boolean isEmpty() {
        return size == 0;
    }
}
