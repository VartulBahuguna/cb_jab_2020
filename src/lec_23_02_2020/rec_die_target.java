package lec_23_02_2020;

public class rec_die_target
{
    public static void main(String[] args)
    {
        die_target("", 4);
    }
    public static void die_target(String process, int target)
    {
      if(target == 0)
      {
          System.out.println(process);
          return;
      }

        for (int i = 1; i <= 6 && i <= target ; i++)
        {
            die_target(process + i, target - i);
        }
    }
}
