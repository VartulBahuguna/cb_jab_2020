package Assignment_8a;

import java.util.ArrayList;

public class Ques_2
{
    public static void main(String[] args) {

        System.out.println(sub_seq_asc_cnt("",  "ab"));
        System.out.println(sub_seq_asc_Array("",  "ab"));
    }


    public static int sub_seq_asc_cnt(String pro, String unpro)
    {
        int cnt = 0;
        if(unpro.isEmpty())
        {
            System.out.println(pro);
            return 1;
        }
        char ch = unpro.charAt(0);
        int asc = unpro.charAt(0);
        unpro = unpro.substring(1);
        cnt = cnt + sub_seq_asc_cnt(pro + ch, unpro);
        cnt = cnt + sub_seq_asc_cnt(pro + asc, unpro);
        cnt = cnt + sub_seq_asc_cnt(pro, unpro);
        return cnt;
    }



    public static ArrayList sub_seq_asc_Array(String pro, String unpro)
    {
        ArrayList list = new ArrayList();
        if(unpro.isEmpty())
        {
            list.add(pro);
            return list;
        }
        char ch = unpro.charAt(0);
        int asc = unpro.charAt(0);
        unpro = unpro.substring(1);
        list.addAll(sub_seq_asc_Array(pro + ch, unpro));
        list.addAll(sub_seq_asc_Array(pro + asc, unpro));
        list.addAll(sub_seq_asc_Array(pro, unpro));
        return list;
    }

}
