package CODEVITA;

import java.util.*;

public class PathThroughGraph
{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int m = s.nextInt();
        int n = s.nextInt();

        if(m == n)
        {
            System.out.println("1");
        }
        else
        {
            System.out.println(findAns(m,n));
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

        lstB.add(n);

        while(b!=1)
        {
            b = findMaxFactor(b);
            lstB.add(b);
        }

        System.out.println(lstA);
        System.out.println(lstB);

        Set<Integer> set = new HashSet<>(lstA);
        int t = 1;
        for (int x : lstB) {
            if(set.contains(x))
            {
                t = x;
                break;
            }
        }
        System.out.println(t);
        int ans = 0;
        for (int x: lstA)
        {
            ans++;
            if(x == t) {
                break;
            }
        }
        ans--;
        for (int x: lstB)
        {
            ans++;
            if(x == t) {
                break;
            }
        }
        ans--;
        return ans;
    }

    private static int findMaxFactor(int a)
    {
        int maxPrime = 1;
        for (int i = a-1; i >=1 ; i--) {
            if(a%i == 0)
            {
                maxPrime = i;
                break;
            }
        }

            return maxPrime;

    }
}
