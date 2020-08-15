package Generics;

public class CAR implements Comparable<CAR>
{
    int speed ;
    int price;
    String colour;

    public CAR(int speed, int price, String colour)
    {
        this.speed = speed;
        this.price = price;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "CAR{" + "speed=" + speed + ", price=" + price + ", colour='" + colour + '\'' + "}\n";
    }

    @Override
    public int compareTo(CAR other) {
        return this.speed - other.speed ;
    }
}
