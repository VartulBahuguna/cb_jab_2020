package KotlinPrograms.KeyWords;

public class Main
{
    public static void main(String[] args)
    {
        Person p = new Person();

        p.when("Angry").shout("What is happening?");
        p.when("Happy").say("This is Awesome !!");

        p.setMood("Angry");
        p.setMood("Happy");
    }
}
