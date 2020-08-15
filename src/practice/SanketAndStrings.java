package practice;

import java.util.Scanner;

public class SanketAndStrings
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        int k = s.nextInt();

        String str = s.next();

        int aLen = charCnt('a',str, k);
        int bLen = charCnt('b', str, k);
        if(bLen > aLen)
        {
            System.out.print(bLen);
        }
        else
        {
            System.out.print(aLen);
        }


    }

    public static int charCnt(char ch, String s1, int k)
    {
        int i = 0; int j = 0;
        int swaps = 0;
        int maxLen = 0;
        //int x = 0;
        while(j < s1.length())
        {
            char c = s1.charAt(j);
            if(swaps <= k)
            {
                if(c != ch)
                {
                    swaps++;
                }
                j++;
            }
            else if(swaps > k)
            {

                if(s1.charAt(i) != ch)
                {
                    swaps--;
                }
                i++;

            }
            if(maxLen < j - i - 1)
            {
                maxLen = j-i-1;
            }
        }

        return maxLen;
    }

    static int countMaxWindowSize(String s, char ch, int k) {
        int i = 0; // Left pointer
        int j = 0; // Right pointer

        // First move the right pointer forward by k steps.
        // If the character is already ch , do not count a swap and move freely

        int c = 0; // Variable to count the swaps so far

        int ans = 0; // Variable to store the final answer

        for (; c < k && j < s.length() - 1; j++) {
            if (s.charAt(j) != ch) {
                // If s.charAt(j) is not ch then count it as a swap and move forward
                c++;
            }
            if (c == k) {
                // If no of swaps has reached k, stop moving j any more forward
                break;
            }
        }

        while (i < j) {

            // Move j ahead if next element is ch as it doesn't count as a swap
            while (j < s.length() - 1 && s.charAt(j + 1) == ch) {
                j++;
            }

            // Store the maximum length of all windows
            int currentLength = j - i + 1;
            ans = Math.max(ans, currentLength);

            // Move left pointer by one to slide the window
            i++;

            // If the char at previous position of left pointer was not ch, then that
            // position must
            // have counted as a swap earlier. Now we have a free swap available.
            // Iterate right pointer forward to use that one free swap
            if (j < s.length() - 1 && s.charAt(i - 1) != ch) {
                j++;
            }
        }

        return ans;
    }
}
