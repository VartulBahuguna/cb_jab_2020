package practice;

import java.util.Scanner;

public class PlayingwithcardsInstack
{
    public static void main(String args[]) throws Exception {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int q = s.nextInt();

        int[] ar = new int[n];
        for(int i = 0; i < n; ++i)
        {
            ar[i] = s.nextInt();
        }

        int prime = 2;
        int temp = 0;
        for(int k = 1; k <= q; ++k)
        {

            while(true)
            {
                if(isPrime(prime))
                {
                    temp++;
                }
                if(temp == q)
                {
                    break;
                }
                prime++;
            }

            StacksUsingArrays A = new StacksUsingArrays();
            StacksUsingArrays B = new StacksUsingArrays();
            for(int i = n - 1; i >= 0; --i)
            {
                if(ar[i] % prime == 0)
                {
                    B.push(ar[i]);
                }
                else
                {
                    A.push(ar[i]);
                }
            }

            while(!B.isEmpty())
            {
                System.out.println(B.pop());
            }
            while(!A.isEmpty())
            {
                System.out.println(A.pop());
            }
            prime++;
        }
    }

    public static boolean isPrime(int n)
    {
        if(n == 2)
        {
            return true;
        }
        if(n == 3)
        {
            return true;
        }
        if(n == 5)
        {
            return true;
        }
        if(n == 7)
        {
            return true;
        }
        if(n == 11)
        {
            return true;
        }
        for(int i = 2; i <= Math.sqrt(n); ++i)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    static private class StacksUsingArrays {
        private int[] data;
        private int tos;

        public static final int DEFAULT_CAPACITY = 10;

        public StacksUsingArrays() throws Exception {
            // TODO Auto-generated constructor stub
            this(DEFAULT_CAPACITY);
        }

        public StacksUsingArrays(int capacity) throws Exception {
            if (capacity <= 0) {
                System.out.println("Invalid Capacity");
            }
            this.data = new int[capacity];
            this.tos = -1;
        }

        public int size() {
            return this.tos + 1;
        }

        public boolean isEmpty() {
            if (this.size() == 0) {
                return true;
            } else {
                return false;
            }
        }

        public void push(int item) throws Exception {
            if (this.size() == this.data.length) {

                int[] temp = new int[2 * data.length];
                for(int i = 0;i < data.length;i++){
                    temp[i] = data[i];
                }

                data = temp;
            }
            this.tos++;
            this.data[this.tos] = item;
        }

        public int pop() throws Exception {
            if (this.size() == 0) {
                throw new Exception("Stack is Empty");
            }
            int retVal = this.data[this.tos];
            this.data[this.tos] = 0;
            this.tos--;
            return retVal;
        }

        public int top() throws Exception {
            if (this.size() == 0) {
                throw new Exception("Stack is Empty");
            }
            int retVal = this.data[this.tos];
            return retVal;
        }

        public void display() throws Exception {
            if (this.size() == 0) {
                throw new Exception("Stack is Empty");
            }
            for (int i = this.tos; i >= 0; i--) {
                System.out.println(this.data[i]);
            }

        }

    }
}
