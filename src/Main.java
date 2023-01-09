import javax.crypto.ExemptionMechanism;
import javax.crypto.ExemptionMechanismException;

public class Main {
    public static void main(String[] args) {
        Example example = new Example();
        Example outClass = new Example();
        Example ourNewClass = new Example();




        Example.counter = 3; // инкапсуляция - без создания объекта класса мы не можем получить
                             // доступ к полям класса

        Example example2 = new Example(); // создали объект класса
        example2.counter = 2;             // получили доступ


        outClass.setCounter(15);
        ourNewClass.setCounter(10);

        int exampleInt = outClass.getCounter();
        int exampleInt2 = ourNewClass.getCounter();

        System.out.println(example.getCounter());
        System.out.println(exampleInt);
        System.out.println(exampleInt2);

        outClass.setName("John");
        ourNewClass.setName("Bob");

        System.out.println(example.getName());
        System.out.println(outClass.getName());
        System.out.println(ourNewClass.getName());

        // инициализирую объект (класс) Constructor - начало
        Constructor constructor = new Constructor(1, 2, "3", "4");

        System.out.println(constructor.sum());
        // инициализирую объект (класс) Constructor - конец

        // различие между методами instance и static - начало
        Human.printStatic();

        Human peter = new Human();
        peter.printInstance();
        peter.changeName();
        System.out.println(peter.getName());




        // различие между методами instance и static - конец
    }
}