package KotlinPrograms.StaticFields;

public class Main
{
    public static void main(String[] args) {
        System.out.println(new Human("female", 40, "Nancy"));
        System.out.println(Human.STANDARD_MALE);
        //Without any  annotation
        //System.out.println(Person.Companion.getSTANDARD_FEMALE());

        //After using @JvmStatic annotation
        System.out.println(Person.getSTANDARD_MALE());

        //After using @JvmField annotation
        System.out.println(Person.STANDARD_FEMALE);
    }
}
