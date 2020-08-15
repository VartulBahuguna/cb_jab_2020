package lec_15_02_2020;

public class Strings
{
    public static void main(String[] args) {
        String s = new String("hello");
        String p = "Hello";
        p = "hi";

        String p1 = p + "hi";
        String b = "Hello";
        System.out.println(s);
        boolean a = ("hello" == "Hello");
        System.out.println(a);
        String k = "hello";
        String f = "hell";
        f = f + "o";


//        System.out.println(f == k);
//        System.out.println(s.charAt(0));
//        int i = Integer.parseInt("1");
//        System.out.println(i);
//        System.out.println(s.substring(1));
//        for (int j = 0; j <s.length() ; j++) {
//            for (int l = j+1; l < s.length()+1; l++) {
//                System.out.println(s.substring(j,l));
//
//            }
//
//        }
//        System.out.println(s.substring(1,4));
//        System.out.println(s.indexOf("l"));
//        occurance(s,"l");
//        int j = 0;
//        while(j<=s.length()) {
//            if(s.indexOf("l", j)!=-1) {
//                System.out.println(s.indexOf("l", j));
//                j = s.indexOf("l", j) + 1;
//            }
//
//        }
       // for (int i = 0; i < s.length(); i++) {


        //}
        //System.out.println(s.indexOf());
        System.out.println(pallindrome("abbbba"));

    }
    public static void occurance (String s , String pattern)
    {
        int index = 0;
        while(true)
        {
            index = s.indexOf(pattern,index);
            if(index == -1)
            {
                break;
            }
            System.out.println(index);
            index += 1;
        }
    }
    public static void substring(String s) {
        for (int j = 0; j < s.length(); j++) {
            for (int l = j + 1; l < s.length() + 1; l++) {
                System.out.println(s.substring(j, l));

            }
        }
    }
    public static boolean pallindrome(String s)
    {
        int  i = 0, j = s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;

        }

            return true;
    }

}
