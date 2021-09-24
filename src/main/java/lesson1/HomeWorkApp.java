package lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
        checkSumSign();
        printColor();
        compareNumbers();
    }

    static void checkSumSign() {
        int a = 5;
        int b = -50;
        int result;
        result = a + b;
        if (result >= 0)
            System.out.println("Сумма положительная");
        else
            System.out.println("Сумма отрицательная");
    }

    static void printColor() {
        int value = 101;
        if (value <= 0)
            System.out.println("Красный");
        else if (value > 100)
            System.out.println("Зеленый");
        else
            System.out.println("Желтый");

    }

    static void compareNumbers() {
        int a = 100;
        int b = 30;
        if (a >= b)
            System.out.println("a >= b");
        else
            System.out.println("a < b");
    }
}
