package Test;


class StacksK {
        public int[] data;
        public int size;
        public int top = 0;

        public StacksK(int x) {
            this.size = x;
            this.data = new int[size];
        }

        public void display(int[] data, int top) {
            for (int i = 0; i < top; i++) {
                System.out.println(data[i]);
            }
        }

        public void push(int e) //
        {
            if (isfull()) {
                System.out.println("Overfull");
                return;
            }
            else
            {
                data[top++] = e;
            }
        }

        private boolean isfull() {
            if (top == data.length)
                return true;
            else
                return false;
        }

        public void pop() {

            if (isempty())
            {
                System.out.println("Underflow");
            }
            else
            {
                int deleted = data[top - 1];
                System.out.println(deleted + " is the removed element");
                top--;
            }

        }

        private boolean isempty() {
            if (top == 0 || top == -1)
            {
                return true;
            }
            else
                return false;
        }
    }
public class stack_query1
{
        public static void main(String a[])
        {
            StacksK k= new StacksK(5);
            k.push(6);
            k.push(7);
            k.push(8);
            k.push(9);
            k.push(4);
            // k.push(10);
            k.pop();
            k.pop();
            k.display(k.data,k.top);
        }
}
