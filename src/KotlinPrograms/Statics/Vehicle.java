package KotlinPrograms.Statics;

public class Vehicle
{
    String name;
    int wheel;
    int seats;
    float fuelTankCapacity;

    @Override
    public String toString()
    {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", wheel=" + wheel +
                ", seats=" + seats +
                ", fuelTankCapacity=" + fuelTankCapacity +
                '}';
    }

    private Vehicle(String name, int wheel, int seats, float fuelTankCapacity)
    {
        this.name = name;
        this.wheel = wheel;
        this.seats = seats;
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public static Vehicle createFor(int passanger, float distance)
    {
        if(passanger < 4)
        {
            if(distance < 40) return new Vehicle("Auto", 3 , 3, 12.5f);

            return  new Vehicle("Car", 4 , 4, 45.5f);
        }
        else
        {
            if(distance < 500) return new Vehicle("Tempo", 4, 20, 100.0f);

            return new Vehicle("Volvo", 8, 54, 600.0f);
        }
    }
}
