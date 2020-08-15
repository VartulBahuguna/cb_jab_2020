package practice;

import java.util.*;
public class CanYouReadThis {
    public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);

		String str = s.nextLine();

		int j = 0,i;
		for(i = 1; i < str.length(); ++i)
		{
			if(str.charAt(i) <= 'Z' && str.charAt(i) >= 'A')
			{
				System.out.println(str.substring(j,i));
				j = i;				
			}
		}
		System.out.println(str.substring(j,i));

    }
}