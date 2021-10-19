package lesson6;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Том");
        Dog dog = new Dog("Бобик");

        cat.printInfo();
        cat.swim(10);
        cat.run(10);

        System.out.println("");

        dog.printInfo();
        dog.swim(100);
        dog.run(100);
    }
}
