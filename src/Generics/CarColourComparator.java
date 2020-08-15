package Generics;


import java.util.Comparator;

public class CarColourComparator implements Comparator<CAR> {
    @Override
    public int compare(CAR o1, CAR o2)
    {
        return o1.colour.compareTo(o2.colour);
    }
}
