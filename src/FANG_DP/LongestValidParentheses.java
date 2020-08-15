package FANG_DP;

import java.util.Scanner;
import java.util.Stack;

public class LongestValidParentheses
{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        Stack<Character> st = new Stack<>();
        int cnt = 0;
        String str = s.nextLine();
        int n = str.length();
        int i = 0;
        int a = 0;
        Stack<Integer> ans = new Stack<>();
        while (i != n)
        {
            char ch = str.charAt(i);

            if(ch == '(')
            {
                st.push(ch);
                ans.push(cnt);
                cnt = 0;
            }
            else if(ch == ')')
            {
                if(st.isEmpty())
                {
                    cnt = 0;
                }
                else
                {
                    cnt += ans.pop() + 2;
                    st.pop();
                    a = Math.max(a, cnt);
                }
            }
            i++;
        }
        System.out.println(a);
    }
}
