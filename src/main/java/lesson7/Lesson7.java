package lesson7;

public class Lesson7 {
    public static void main(String[] args) throws InterruptedException {
        task();
        task4();

//        while (plate.getFoodCount() > 0) {
//            cat.eat(plate);
//
//            plate.printInfo();
//            Thread.sleep(3000);
//        }
    }

    private static void task() {
        Cat cat = new Cat("Барсик");
        Plate plate = new Plate(10);

        plate.printInfo();

        cat.eat(plate);
        plate.printInfo();
        plate.increaseFood(15);
        plate.printInfo();
    }

    private static void task4() {
        Plate plate = new Plate(10);
        plate.increaseFood(10);
        plate.printInfo();

        Cat[] arrayOfCats = new Cat[5];
        String[] arrayOfNames = {"Том", "Барсик", "Джек", "Васёк", "Мурзик"};

        for (int i = 0; i < arrayOfNames.length; i++) {
            arrayOfCats[i] = new Cat(arrayOfNames[i]);
        }

        for (int i = 0; i < arrayOfCats.length; i++) {
            arrayOfCats[i].eat(plate);
            plate.printInfo();
        }

        for (int i = 0; i < arrayOfCats.length; i++) {
            System.out.println(arrayOfCats[i].getFattenedInfo());
        }
    }

}
