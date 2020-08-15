package practice;

import java.util.Scanner;

public class RainWaterHarvesting
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int[] elevMap = new int[n];

        for(int i = 0; i < n; ++i)
        {
            elevMap[i] = s.nextInt();
        }

        int[] leftHigh = new int[n];
        int[] rightHigh = new int[n];

        leftHigh[0] = elevMap[0];
        rightHigh[n - 1] = elevMap[n - 1];

        int storedWater = 0;

        for(int i = 1; i < n; ++i)
        {
            leftHigh[i] = Math.max(leftHigh[i - 1], elevMap[i]);
        }
        for(int i = n - 2; i >= 0; --i)
        {
            rightHigh[i] = Math.max(rightHigh[i + 1], elevMap[i]);
        }

        for(int i = 0; i < n; ++i)
        {
            storedWater += Math.min(leftHigh[i], rightHigh[i]) - elevMap[i];
        }

        System.out.print(storedWater);

    }
}
