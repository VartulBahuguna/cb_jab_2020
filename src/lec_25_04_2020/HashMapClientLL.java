package lec_25_04_2020;

public class HashMapClientLL
{
    public static void main(String[] args) {

        HashMapLL map = new HashMapLL();  // object of class  HashMapLL

        map.put("apple" , "red hota hai");
        map.put("banana" , "peela hota hai");
        map.put("mango", "corona ki wjh se mil nahi rha");
        String str = map.get("mango");
        System.out.println(str);

        System.out.println(map);  //printing object
        map.remove("mango");
        System.out.println(map);
        System.out.println(map.get("mango"));

    }
}
