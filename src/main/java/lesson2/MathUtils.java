package lesson2;

public class MathUtils {

    public static void main(String[] args) {
        checkSumBetween10and20(10, 0);
        checkSumBetween10and20(10, 10);
        checkSumBetween10and20(10, 20);

        positiveOrNegativeNumber(-1);
        positiveOrNegativeNumber(0);
        positiveOrNegativeNumber(1);

        isIntValueNegative(5);
        isIntValueNegative(0);
        isIntValueNegative(-2);

        stringAndNumber("Пример", 7);
    }

    static boolean checkSumBetween10and20(int a, int b) {
        if ((a + b) >= 10 && (a + b) <= 20) {
            return true;
        } else {
            return false;
        }
    }

    static void positiveOrNegativeNumber(int c) {
        if (c >= 0) {
            System.out.println("положительное число");
        } else {
            System.out.println("отрицательное число");
        }
    }

    static boolean isIntValueNegative(int d) {
        if (d >= 0) {
            return false;
        } else {
            return true;
        }
    }

    static void stringAndNumber(String text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }
}
