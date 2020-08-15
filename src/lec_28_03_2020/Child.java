package lec_28_03_2020;

public class Child
{
    public static void main(String[] args) {


        Human shubham = new Human();
        shubham.name="Shubham";
        System.out.println(shubham.name);

        shubham.loan();


        Human mukul = new Human("Loki");
        System.out.println(mukul.salary);
        mukul.salary=1000000;
        System.out.println(mukul.salary);

        Human chetan =new Human("Hawkeye");
        System.out.println(chetan.salary);


    }
}
