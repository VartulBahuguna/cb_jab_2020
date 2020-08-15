package lec_25_04_2020;

import javax.swing.*;
import java.util.HashMap;
import java.util.LinkedList;

public class HashEg
{
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();

        map.put("apple" , "mast hai");
        map.put("mango" , "corona ki wjh se nhi mil rahe");
        map.put("banana" , "acha hota hai pr mereko psand nahi");

        System.out.println(map);

        System.out.println(map.keySet());

        for (String str : map.keySet())
        {
            System.out.println(str);
        }

        for (String str : map.values())
        {
            System.out.println(str);
        }

        System.out.println(freq("jdsigwenhsiohnewiiods"));

       
    }


    public static HashMap<Character,Integer> freq(String str)
    {

        HashMap<Character,Integer> map = new HashMap<>();


        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if(!map.containsKey(ch))
            {
                map.put(ch,1);
            }
            else
            {
                map.put(ch,map.get(ch) + 1);
            }
        }

        return map;
    }

}
