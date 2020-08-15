package lec_23_02_2020;

public class rec_numpad
{
    public static void main(String[] args) {
        numpad("", "34" + "");
    }


    public static void numpad(String process, String unprocess)
    {
        if(unprocess.isEmpty())
        {
            System.out.println(process);
            return;
        }

        int digit = Integer.parseInt(unprocess.substring(0,1));// int digit = unprocess.charAt(0) - '0';
        unprocess = unprocess.substring(1);
        for (int i = 3 * (digit - 1) ; i < 3 * digit; i++)
        {
            if(i == 26)
            {
                continue;
            }
            numpad(process + (char)(i + 'a'), unprocess);
        }
    }

}
