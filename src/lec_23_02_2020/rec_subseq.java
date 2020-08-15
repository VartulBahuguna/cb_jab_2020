package lec_23_02_2020;

public class rec_subseq
{
    public static void main(String[] args) {
        subseq("", "abc");
    }
    public static void subseq(String processed, String unprocessed )
    {
        if(unprocessed.isEmpty())
        {
            System.out.println(processed);
            return ;
        }
        char ch = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);
        subseq(processed + ch, unprocessed);
        subseq(processed, unprocessed);
    }

}
