package lesson7;

import java.util.Random;

public class Cat {

    private Random random = new Random();

    private final String name;

    private boolean isFattened = false;

    public Cat(String name) {
        this.name = name;
    }

    public void eat(Plate plate) {
        isFattened = plate.decreaseFood(random.nextInt(4) + 3);
    }

    public String getFattenedInfo() {
        if(isFattened)
            return name + " сыт";
        else
            return name + " голоден";
    }
}
