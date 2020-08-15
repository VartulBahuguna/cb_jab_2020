package bitmasking_practice;

public class ques_2
{
        static boolean oppositeSigns(int x, int y)
        {
            return ((x ^ y) < 0);
        }

        public static void main(String[] args)
        {
            int x = 100, y = -100;
            if (oppositeSigns(x, y) == true)
                System.out.println("Signs are opposite");
            else
                System.out.println("Signs are not opposite");
            int x1 =12;

            System.out.println(x1>>1);
        }


}
