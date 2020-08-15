package lec_25_04_2020;

public class HashMapClientArray
{
    public static void main(String[] args) {

        HashMapArrays map = new HashMapArrays();
        map.put("apple" , "red hota hai");
        map.put("banana" , "peela hota hai");
        map.put("mango", "corona ki wjh se mil nahi rha");

        System.out.println("apple".hashCode());
        System.out.println("banana".hashCode());
        System.out.println("mango".hashCode());
        System.out.println(map.get("apple"));
        System.out.println(map.get("banana"));
        System.out.println(map.get("mango"));



    }







}
