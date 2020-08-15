package practice;

import java.util.Scanner;

public class MikeandHashTrick
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int[] a = new int[n];

        for(int i = 0; i < n; ++i)
        {
            a[i] = s.nextInt();
        }

        int[] hash = hash_array(a, n);

        for(int i = 0; i < hash.length; ++i)
        {
            //if(hash[i] != 0)
            System.out.println(hash[i] + 1);
        }


    }


    public static int[] hash_array(int A[], int n)
    {
        int[] hash = new int[n]; //MAX is the maximum possible value of A[i]
        for(int i=0;i<n;i++) hash[i]=-1; //initialize hash to -1.
        int count = 0;
        for(int i=0;i<n;i++) // Loop through elements of array
        {
            if(hash[A[i]] == -1) // A[i] was not assigned any hash before
            {
                hash[A[i]] = count; // Assigning hash to A[i]
                count++;
                continue;
            }
            for(int j = 0;j<i;j++)
            {
                if(hash[A[j]] > hash[A[i]]) // All the hashes greater than previous hash of A[i] are decremented.
                    hash[A[j]]--;
            }
            hash[A[i]] = count - 1; // Assigning a new hash to A[i]
        }
        return hash;
    }
}
