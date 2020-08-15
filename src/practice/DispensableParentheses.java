package practice;

import java.util.*;

public class DispensableParentheses
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        while(t-- != 0)
        {
            Stack<Character> stack = new Stack<>();

            String str = s.next();
            boolean useful = false;
            boolean dupli = false;
            while(!str.isEmpty())
            {
                useful = false;
                char ch = str.charAt(0);
                if(ch == ')')
                {
                    char c = 'a';
                    while(c != '(')
                    {
                        c = stack.pop();
                        if (c != '(') {
                            useful = true;
                        }
                    }
                    if(!useful)
                    {
                        dupli = true;
                    }
                }
                else
                {
                    stack.push(ch);
                }

                if(dupli)
                {
                    break;
                }


                str = str.substring(1);
            }

            if(dupli)
            {
                System.out.println("Duplicate");
            }
            else
            {
                System.out.println("Not Duplicates");
            }
        }
    }
}
