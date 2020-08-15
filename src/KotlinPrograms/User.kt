package KotlinPrograms

fun main()
{
    val acnt =  Account()

    acnt.insert(12345, "Pulkit", 1000f)
    acnt.deposit(100f)
    acnt.withDraw(150f)
    acnt.withDraw(50f)
    println(acnt.accNo)
    println(acnt.name)
    println(acnt.amount)
    print("Acount no ${acnt.accNo} \nAccount name ${acnt.name} \nAccount balance ${acnt.amount}")

}


class Account{

    // Properties
    var accNo : Int = 0
    var name : String ?= null
    var amount : Float = 0f

    // Member func.

    fun insert(ac : Int, n : String, amnt : Float)
    {
        accNo = ac
        name = n
        amount = amnt
    }


    fun deposit(money : Float)
    {
        amount += money
        println(amount)
    }

    fun  withDraw(money: Float)
    {
        if(amount < money)
        {
            println("Greeb hai bhai tu")
        }
        else
        {
            amount -= money
            println(amount)
        }
    }



}