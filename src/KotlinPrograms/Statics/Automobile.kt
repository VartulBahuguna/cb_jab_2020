package KotlinPrograms.Statics

class Automobile private constructor(var name: String,
                 var wheel: Int ,
                 var seats: Int,
                 var fuelTankCapacity: Float)
{
    override fun toString(): String {
        return "Automobile(name='$name', wheel=$wheel, seats=$seats, fuelTankCapacity=$fuelTankCapacity)"
    }

    companion object
    {
        @JvmStatic
        fun createFor(pax: Int, dist: Float) : Automobile
        {
            return if (pax < 4) {
                if (dist < 40) Automobile("Auto", 3, 3, 12.5f)
                else Automobile("Car", 4, 4, 45.5f)
            } else {
                if (pax < 500) Automobile("Tempo", 4, 20, 100.0f)
                else Automobile("Volvo", 8, 54, 600.0f)
            }
        }

    }



}