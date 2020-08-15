package Assignment_7;

public class Ques_2
{
    public static void main(String[] args) {


    String str = "12345" ;
        System.out.println(str_to_int(str, 0));

    }


    public static int str_to_int(String str, int i)
    {
        if(i == str.length() - 1)
            return Integer.parseInt(str.substring(i,i+1));

        return (((int)Math.pow(10, str.length() - 1 - i) * Integer.parseInt(str.substring(i,i+1)) ) + str_to_int(str, i+1));
    }
}
