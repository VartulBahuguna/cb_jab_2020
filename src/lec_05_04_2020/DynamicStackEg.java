package lec_05_04_2020;

import lec_30_03_2020.Stackeg;

public class DynamicStackEg extends Stackeg
{
    public void push(int val)
    {
        if(isFull())
        {
            System.out.println("Mai badh gya");

            int[] ar = new int[2 * data.length];
            for (int i = 0; i <data.length ; i++) {
                ar[i] = data[i];
            }

            data = ar;
        }

        super.push(val);
    }
}
