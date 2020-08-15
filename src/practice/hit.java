package practice;

public class hit {

        public static void main(String args[])
        {
            skiphit("","hihihit");
        }

        public static void skiphit(String processed,String unprocesed)
        {
            if(unprocesed.length() < 3)
            {
                System.out.print(processed + unprocesed);
                return;
            }

            char ch = unprocesed.charAt(0);

            if("hit".equals(unprocesed.substring(0,3)))
            {
                skiphit(processed,unprocesed.substring(3));

            }
            else
            {
                skiphit(processed+ch,unprocesed.substring(1));
            }
        }
    }

