package lec_05_04_2020;

public class DynamicStackEg_Client
{
    public static void main(String[] args) throws Exception
    {
        DynamicStackEg stack = new DynamicStackEg();
        for (int i = 0; i < 100; i++)
        {
            stack.push(i);
        }
        for (int i = 0; i < 100; i++) {
            System.out.println(stack.pop());
        }
    }
}
