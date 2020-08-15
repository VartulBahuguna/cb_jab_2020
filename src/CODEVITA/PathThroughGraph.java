package CODEVITA;

import java.util.*;

public class PathThroughGraph
{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int m = s.nextInt();

        if(m == n)
        {
            System.out.println("1");
        }
        else
        {
            int ans = findAns(m,n);
        }
    }

    class pair{
        int key;
        int val;

        public pair(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    private static int findAns(int m, int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int a = m;
        int b = n;

        ArrayList<Integer> lstA = new ArrayList<>();
        ArrayList<Integer> lstB = new ArrayList<>();

        lstA.add(m);

        while(a!=1)
        {
            a = findMaxFactor(a);
            lstA.add(a);
        }
        lstA.add(1);

        lstB.add(n);

        while(b!=1)
        {
            b = findMaxFactor(b);
            lstB.add(b);
        }
        lstA.add(1);

        Set<Integer> set = new HashSet<>(lstA);
        int t = 1;
        for (int x : lstB) {
            if(set.contains(x));
            {
                t = x;
            }
        }

        int ans = 0;
        for (int x: lstA)
        {
            ans++;
            if(x == t) {
                break;
            }
        }
        for (int x: lstB)
        {
            ans++;
            if(x == t) {
                break;
            }
        }
        return ans;
    }

    private static int findMaxFactor(int a)
    {
            int maxPrime = -1;

            while (a % 2 == 0) {
                maxPrime = 2;
                a >>= 1;
            }

            for (int i = 3; i <= Math.sqrt(a); i += 2)
            {
                while (a % i == 0)
                {
                    maxPrime = i;
                    a = a / i;
                }
            }
            if (a > 2)
                maxPrime = a;

            return maxPrime;

    }
}
