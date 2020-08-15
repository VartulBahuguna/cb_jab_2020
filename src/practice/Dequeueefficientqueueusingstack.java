package practice;


import java.util.Scanner;

public class Dequeueefficientqueueusingstack
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        Queue queue = new Queue(n);

        for(int i = 0; i < n; ++i)
        {
            queue.enQueue(i);
        }
        while(!queue.queueIsEmpty())
        {
            System.out.print(queue.deQueue() + " ");
        }
    }


    static class Queue {


        Stack stack;
        Stack helpStack ;

        public Queue(int n) {
            this.stack = new Stack(n);
            this.helpStack = new Stack(n);
        }

        public void enQueue(int val)
        {
            while(!stack.isEmpty())
            {
                helpStack.push(stack.pop());
            }

            stack.push(val);

            while (!helpStack.isEmpty())
            {
                stack.push(helpStack.pop());
            }
        }

        public boolean queueIsEmpty()
        {
            return stack.isEmpty();
        }

        public int deQueue()
        {
            return stack.pop();
        }


        private class Stack
        {
            private int size;
            private int[] list;
            private int index;

            public Stack(int n) {
                int size = 0;
                list = new int[n];
                index = -1;
            }

            public void push(int i) {

                list[size] = i;
                size++;
                index++;
            }

            public boolean isEmpty() {
                return size == 0 ;
            }

            public int pop() {
                size--;
                return list[index--];
            }

            public int getSize() {
                return size;
            }

        }
    }
}
