package practice;


import java.util.*;


public class RemoveDuplicatescharacters
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();

        String s2 = "";

        Set<Character> map = new HashSet<>();

        for (int i = 0; i < str.length() ; i++)
        {
            if(!map.contains(str.charAt(i)))
            {
                s2 = s2 + str.charAt(i);
                map.add(str.charAt(i));
            }
        }

        System.out.print(s2);
    }
}
