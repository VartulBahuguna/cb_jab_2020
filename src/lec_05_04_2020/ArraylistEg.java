package lec_05_04_2020;

public class ArraylistEg
{
    private int[] data;
    private int size = 0;
    private int DEFAULTSIZE = 10;

    public ArraylistEg()
    {
        this.data = new int[DEFAULTSIZE];
        this.size = 0;
    }

    public void add(int value)
    {
        if(isFull())
        {
            resize();
        }

        data[size++] = value;
    }

    private boolean isFull()
    {
        return size == data.length;
    }

    public void resize()
    {
        System.out.println("Mai badh gya");

        int[] ar = new int[2 * data.length];
        for (int i = 0; i < data.length; i++)
        {
            ar[i] = data[i];
        }

        data = ar;
    }

    public int get(int index)
    {
        return data[index];
    }

    public void set(int index, int val)
    {
        data[index] = val;
    }







}
