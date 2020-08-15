package lec_15_02_2020;

public class builder_intro {
    public static void main(String[] args) {
        String s = "";
        StringBuilder builder = new StringBuilder(s);

        for (int i = 0; i < 10; i++) {
            s = s  +"a";

        }
        for (int i = 0; i < 10; i++) {
           builder.append("a");

        }
        System.out.println(s);
        System.out.println(builder);
       // builder.setCharAt(2,'i');

        int n = 'c' - 'a';
        System.out.println(builder);
        System.out.println(n);
        System.out.println((int )('a'));

        StringBuilder str = new StringBuilder("HElloHEllo");



        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if( ch >='A' && ch <= 'Z')
            {
               ch = (char)('a' + (ch - 'A'));
               str.setCharAt(i,ch);

            }
            else

            {
                ch = (char)('A' + (ch - 'a'));
                str.setCharAt(i,ch);
            }



        }
        System.out.println((int)('a'));
        System.out.println((int)('A'));
        System.out.println(str);

    }
}
