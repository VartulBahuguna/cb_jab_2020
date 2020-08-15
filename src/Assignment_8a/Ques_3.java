package Assignment_8a;

import java.util.ArrayList;

public class Ques_3
{
    public static void main(String[] args)
    {
        System.out.println(num_pad_cnt("", "12"));
        System.out.println(num_pad_Array("", "12"));
    }


    public static int num_pad_cnt(String pro, String unpro)
    {
        int cnt = 0;
        if(unpro.isEmpty())
        {
            System.out.println(pro);
            return 1;
        }

        int n = Integer.parseInt(unpro.substring(0,1));
        unpro = unpro.substring(1);
        for (int i = (n - 1) * 3; i < n * 3 ; i++)
        {
            if(i == 26)
            {
                continue;
            }
            cnt = cnt + num_pad_cnt(pro + (char)('a' + i), unpro);
        }
        return cnt;
    }


    public static ArrayList num_pad_Array(String pro, String unpro)
    {
        ArrayList list = new ArrayList();
        if(unpro.isEmpty())
        {
            list.add(pro);
            return list;
        }

        int n = Integer.parseInt(unpro.substring(0,1));
        unpro = unpro.substring(1);
        for (int i = (n - 1) * 3; i < n * 3 ; i++)
        {
            if(i == 26)
            {
                continue;
            }
            list.addAll(num_pad_Array(pro + (char)('a' + i), unpro));
        }
        return list;
    }

}
