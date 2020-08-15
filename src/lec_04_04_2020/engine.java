package lec_04_04_2020;

public abstract class engine
{
    public void start()
    {
        System.out.println("Mai engine ki trh chalta hu");
    }

    public void stop()
    {
        System.out.println("Mai engine ki trh rukta hu");
    }

    public abstract void vroom();

    public void accelerate()
    {
        System.out.println("vroom vroom vroom");
    }
}
