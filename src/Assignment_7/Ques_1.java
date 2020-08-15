package Assignment_7;

public class Ques_1
{
    public static void main(String[] args) {
        String str = "12345";
        System.out.println(sum_str(str, 0));
    }


    public static int sum_str(String str, int i)
    {
        if(i == str.length() - 1)
            return Integer.parseInt(str.substring(i,i+1));
        return Integer.parseInt(str.substring(i,i+1)) + sum_str(str, i+1);
    }

}
