package KotlinPrograms

import java.util.*

lateinit var hel :String
//Late initialization
val c : String = "10"
fun main()
{
   // println("Hello world")

    // val or var -> variable name-> : -> variable type -> = value

    val a = "hello world from variable"

   // println(a);

    var b = 10
    val arr = arrayOf(1,2,3,4,"a","f");
    val nameString = arrayListOf<String>("hello","bye");
    val num = Array(6) { i -> i+1};
    println(nameString)

    val array = intArrayOf(1);

    var li = listOf("String", "name", 8, 90)
    var muti = mutableListOf("stru", "strimp","sturk", 80, 8, 'n')
    var muarli = arrayListOf("String", "stong", 'n',9)
    val map = mapOf("name" to "vartul", 1 to 10)
    val hashM = hashMapOf("name" to "vartul", 1 to 10)

    println(array.contentToString())
    println(map)

    map.forEach{(any , any2)->
    println("" + any + any2)
    }

    li.forEach{(it);
    println(it)
    }
    nameString.forEach {
        (it)
        println(it);
    }

    muarli.forEach{(it)
    println(it)
    }

    var x = "Vartul"

    when(x)
    {
        "name" -> {
            println("hi")}
        "Vartul" -> {
            println("sexy boy")
        }

        else ->{
            println("Kuch bhi dal rha hai bayewakuff admi")
        }
    }

    x =    when(x)
    {
        "name" ->
            "hi"
        "Vartul" ->
            "sexy boy"


        else ->"Kuch bhi dal rha hai bayewakuff admi"
    }




    b = 40
    //println(b);

    println(hello())
    disp("Vartul", age = 19)

}
// fun(key word) hello (func name) : String (return type)
fun hello() : String{
    return "kaisa hai bhai"
}

fun square(num : Int):Int{
    return num*num
}

fun sq(num : Int):Int = num*num

// fun sq(num : Int):Int = num*num

fun disp(name : String, age : Int, isActive : Boolean = true)
{
    print("$name $age $isActive")
}
