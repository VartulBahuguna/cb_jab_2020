package lec_30_03_2020;

public class Stackeg {

    protected int[] data;
    protected int top;
    protected int DEFAULT_SIZE=10;


    public Stackeg() {
        this.data =new int[DEFAULT_SIZE];
        this.top=0;
    }

    public void push(int element){

        if(isFull()){
            return;
        }

        data[top++]=element;
    }

    protected boolean isFull() {
        return top==data.length;
    }

    public int pop() throws Exception {

        if(isEmpty()){
            throw new Exception("Khaali he bhai");
        }

        int temp= data[top-1];
        top--;

        return temp;
    }

    protected boolean isEmpty() {
        return top==0;
    }


}