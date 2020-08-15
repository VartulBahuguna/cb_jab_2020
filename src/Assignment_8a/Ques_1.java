package Assignment_8a;

//import lec_09_02_2020.sorting.ArrayList;
import java.util.ArrayList;

public class Ques_1
{
    public static void main(String[] args)
    {
        System.out.println(sub_seq_cnt("", "abc"));
        System.out.println(sub_seq("", "abc"));
    }


    public static int sub_seq_cnt(String pro, String unpro)
    {
        int cnt = 0;
        if(unpro.isEmpty())
        {
            System.out.println(pro);
            return 1;
        }
        char ch = unpro.charAt(0);
        unpro = unpro.substring(1);
        cnt = cnt + sub_seq_cnt(pro + ch, unpro);
        cnt = cnt + sub_seq_cnt(pro , unpro);
        return cnt;
    }


    public static ArrayList sub_seq(String pro, String unpro)
    {

        if(unpro.isEmpty())
        {
            ArrayList list = new ArrayList();
            list.add(pro);
            return list;
        }
        ArrayList list = new ArrayList();
        char ch = unpro.charAt(0);
        unpro = unpro.substring(1);
        list.addAll(sub_seq(pro + ch, unpro));
        list.addAll(sub_seq(pro , unpro));
        return list;
    }


}
