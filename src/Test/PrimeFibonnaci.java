package Test;

import java.util.*;

public class PrimeFibonnaci
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        boolean[] prime = new boolean[10000];
        Arrays.fill(prime,true);
        prime[0] = false;
        prime[1] = false;

        for(int i = 2; i*i <10000; i++)
        {
            if(prime[i])
            {
                for(int j = 2; j*i <10000; j++)
                {
                    prime[j*i]=false;
                }
            }
        }

        int n1 = s.nextInt();
        int n2 = s.nextInt();
        ArrayList<Integer> lst = new ArrayList<>();
        for(int i = n1; i<= n2; ++i)
        {
            if(prime[i])
            {
                lst.add(i);
            }
        }

        ArrayList<Integer> lst2 = new ArrayList<>();

        int m ;
        int h;
        Set<Integer> set = new HashSet<>();

        for(int i = 0;i < lst.size(); ++i)
        {
            for(int j = 0; j < lst.size(); ++j) {
                if (j == i) {
                    continue;
                }

                String str = lst.get(i) + "" + lst.get(j);
                if (prime[Integer.parseInt(str)] && !set.contains(Integer.parseInt(str))) {
                    lst2.add(Integer.parseInt(str));
                    set.add(Integer.parseInt(str));
                }

            }
        }

        int n = lst2.size();

        if(lst2.size() == 0)
        {
            m = 0;
            h = 0;
        }
        else
        {
            h = Collections. max(lst2);
            m = Collections. min(lst2);
        }

        long fst = m;
        long snd = h;
        long ans ;

        for(int i = 3; i<=n; ++i)
        {
            ans = fst + snd;
            fst = snd;
            snd = ans;

        }

        System.out.print(snd);


    }
}
