package lec_30_03_2020;

public class QueueEg {

    private int[] data;
    private int end;
    private int DEFAULT_SIZE = 10;

    public QueueEg() {
        this.data = new int[DEFAULT_SIZE];
        this.end = 0;
    }

    public void enqueue(int element) {

        if (isFull()) {
            return;
        }

        data[end++] = element;
    }

    private boolean isFull() {
        return end == data.length;
    }

    public int dequeue() {

        if (isEmpty()) {
            return -1;
        }

        int temp = data[0];

        for (int i = 1; i < end; i++) {
            data[i - 1] = data[i];
        }

        end--;

        return temp;
    }

    private boolean isEmpty() {
        return end == 0;
    }
}
