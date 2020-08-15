package lec_23_02_2020;

public class rec_remove_alt_elements
{
    public static void main(String[] args)
    {

        remalt("","hihihi");
    }
    public static void remalt(String process, String unprocessed)
    {
        if(unprocessed.isEmpty())
        {
            System.out.println(process);
            return ;

        }
        char ch = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);
        if(ch != 'i')
        {
            remalt(process + ch , unprocessed);
        }
        else
        {
            remalt(process, unprocessed);
        }

    }


    public static void skipi(String processed, String unprocess)
    {
        if(unprocess.isEmpty())
        {
            System.out.println(processed);
            return ;

        }

        char ch = unprocess.charAt(0);
        unprocess = unprocess.substring(1);

        if(ch != 'i')
        {
            skipi(processed + ch , unprocess);
        }
       //else{
            skipi(processed, unprocess);
        //}

    }

}
