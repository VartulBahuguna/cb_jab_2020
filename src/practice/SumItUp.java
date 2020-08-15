package practice;

import java.util.*;

public class SumItUp
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int[] a = new int[n];

        for(int i = 0; i < n; ++i)
        {
            a[i] = s.nextInt();
        }

        int target = s.nextInt();
        Arrays.sort(a);

        ArrayList<String> res = new ArrayList<>();

        //HashSet<String> lst = uniqueComb("", a, target, 0);
        //Collections.sort(lst);
        uniqueComb("", a, target, 0, res);
        for(String li : res)
        {
//            if(lst.isEmpty())
//            {
//                continue;
//            }

            System.out.println(li);
        }


    }

    public static void uniqueComb(String proc, int[] a, int target, int i, ArrayList<String> res)
    {
        //HashSet<String> list = new HashSet<>();
        if(target == 0)
        {
            if(!res.contains(proc))
            {
                res.add(proc);
            }
            return ;
        }
        if(a.length == i)
        {
            return ;
        }

        if(target - a[i] >= 0)
        {
            uniqueComb(proc + a[i] + " ",a,target - a[i], i + 1,res);
        }

       uniqueComb(proc,a,target, i + 1, res);


    }

//    public static void KotlinPrograms.main(String args[], String str) {
//
//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        int[] array = new int[n];
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = scn.nextInt();
//        }
//
//        int target = scn.nextInt();
//
//        Arrays.sort(array);
//
//        List<> res = new ArrayList<>();
//        helper2(array, 0, target, new ArrayList<>(), res);
//
//        for(List each : res){
//
//            for(int val : each){
//                System.out.print(val+" ");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void helper2(int[] arr, int vidx, int target, List curr, List<> res) {
//
//        if (target == 0) {
//            res.add(new ArrayList<>(curr));
//            return;
//        }
//
//        if (target < 0) {
//            return;
//        }
//
//        for (int i = vidx; i < arr.length; i++) {
//
//            if (i == vidx || arr[i] != arr[i - 1]) {
//                curr.add(arr[i]);
//                helper2(arr, i + 1, target - arr[i], curr, res);
//                curr.remove(curr.size() - 1);
//            }
//        }
//    }
}
