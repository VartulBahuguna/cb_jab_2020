package KotlinPrograms.KeyWords

fun main()
{
    var p = Person();

    p.`when`("Angry").shout("What is happening?");
    p.`when`("Happy").say("This is Awesome !!");

    p.setMood("Angry");
    p.setMood("Happy");
}