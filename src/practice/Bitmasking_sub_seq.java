package practice;

public class Bitmasking_sub_seq {
    public static void main(String[] args) {
        String str = "abcd";
        String s1 = " ";
        for (int i = 0; i < (int) Math.pow(2, str.length()); i++)
        {
            /*int k = i;
            while (k != 0)
            {
                if ((k & 1) == 1)
                {
                    System.out.println(str.charAt(k));
                }
                k = k>>1;
            }
            */
            int k = i;
            int pos = 0;
            while (k != 0)
            {
                if ((k & 1) == 1)
                {
                    s1 = s1 + str.charAt(pos);
                }
                k = k >> 1;
                pos++;
            }
            System.out.println(s1);
            s1 = "";
        }
    }
}