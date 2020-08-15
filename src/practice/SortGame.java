package practice;

import java.util.Scanner;

public class SortGame
{
    static class emp
    {
        String name;
        int sal;

        public emp(String name, int sal) {
            this.name = name;
            this.sal = sal;
        }
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
        emp[] data = new emp[n];

        for(int i = 0; i < n; ++i)
        {
            data[i] = new emp(s.next(), s.nextInt());
        }

        for(int i = 0; i < n -1; ++i)
        {
            for(int j = 0; j < n - 1 -i; ++j)
            {
                if(data[j].sal < data[j + 1].sal)
                {
                    sal_swap(data, j,j+1);
                }
                else if(data[j].sal == data[j + 1].sal)
                {
                    int k = 0;
                    int c = 0;
                    while(k < Math.min(data[j].name.length(),data[j+1].name.length()))
                    {
                        if(data[j].name.charAt(k) > data[j+1].name.charAt(k))
                        {
                            c = 1;
                            sal_swap(data, j,j+1);
                            break;
                        }
                        if(data[j].name.charAt(k) < data[j+1].name.charAt(k))
                        {
                            c = 1;
                            break;
                        }
                        k++;
                    }
                    if(c == 0 && data[j].name.length() > data[j+1].name.length())
                    {
                        sal_swap(data,j,j+1);
                    }
                }
            }
        }

        for(int i = 0; i < n && data[i].sal >= x; ++i)
        {
            System.out.println(data[i].name + " " + data[i].sal);
        }
    }

    public static void sal_swap(emp[] ar, int i, int j)
    {
        emp temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }
}
