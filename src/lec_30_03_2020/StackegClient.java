package lec_30_03_2020;


public class StackegClient
{
    public static void main(String[] args) throws Exception {

        Stackeg stack = new Stackeg();

        stack.push(1);
        stack.push(2);

        try {
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
        }

        finally {
            System.out.println("hello");
        }

    }
}
