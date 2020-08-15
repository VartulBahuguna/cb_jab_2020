package KotlinPrograms.Statics;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) {



        System.out.println("For 10 people to travel 200 km we need");
        System.out.println(Vehicle.createFor(10, 200.0f));


        System.out.println("For 2 people to travel 10 km we need");
        System.out.println(Vehicle.createFor(2, 10.0f));


        //WITHOUT USING JvmStatic ANNOTATION
//        System.out.println("For 10 people to travel 200 km we need");
//        System.out.println(Automobile.Companion.createFor(10, 200.0f));
//
//
//        System.out.println("For 2 people to travel 10 km we need");
//        System.out.println(Automobile.Companion.createFor(2, 10.0f));

        System.out.println("For 10 people to travel 200 km we need");
        System.out.println(Automobile.createFor(10, 200.0f));


        System.out.println("For 2 people to travel 10 km we need");
        System.out.println(Automobile.createFor(2, 10.0f));
    }
}
