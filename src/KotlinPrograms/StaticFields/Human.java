package KotlinPrograms.StaticFields;

public class Human
{
    String gender;
    int age;
    String name;

    public Human(String gender, int age, String name) {
        this.gender = gender;
        this.age = age;
        this.name = name;
    }

    public static final Human STANDARD_MALE = new Human("male", 18, "Jhon Doe");
    public static final Human STANDARD_FEMALE = new Human("female", 18, "Jenny Doe");

    @Override
    public String toString() {
        return "Human{" +
                "gender='" + gender + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
