package Assignment_7;

public class Ques_12
{
    public static void main(String[] args)
    {
        str_int("", "123");
    }


    public static void str_int(String proc, String unproc)
    {
        if(unproc.isEmpty())
        {
            System.out.println(proc);
            return;
        }

        int n = Integer.parseInt(unproc.substring(0,1));
        str_int(proc + (char)('a' + (n-1)),unproc.substring(1));

        if(unproc.length() > 1)
        {
            int k = Integer.parseInt(unproc.substring(0,2));
            if(k < 27)
            {
                str_int(proc + (char)('a' + (k-1)), unproc.substring(2));
            }
        }

    }
}
