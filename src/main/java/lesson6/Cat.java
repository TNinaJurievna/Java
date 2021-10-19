package lesson6;

public class Cat extends Animal {

    public Cat(String name) {
        super(name, 200, 0);
    }

    @Override
    public void swim(int length) {
        System.out.println(getName() + " не умеет плавать");
    }
}
