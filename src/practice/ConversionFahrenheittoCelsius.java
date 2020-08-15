package practice;

import java.util.Scanner;

public class ConversionFahrenheittoCelsius {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int minf = s.nextInt();
        int maxf = s.nextInt();
        int jump = s.nextInt();
        for (int i = minf; i <= maxf; i += jump) {
         //   int KotlinPrograms.getC = (int)((float)(5 / 9) * (i - 32));
            System.out.println(i + " " + (int)(0.55 * (i - 32)));
        }
    }
    public static void convert(int ll, int ul,int step)
    {
        for(int i=ll;i<=ul;i=i+step)
        {
            int c=(int)((5.0/9)*(i-32));
            System.out.println(i+ "\t" +c);
        }
    }
}
