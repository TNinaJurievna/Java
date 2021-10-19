package lesson3;

import java.util.Arrays;

public class Array {


    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5(1, 5);
    }

    static void task1() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                arr[i] = 1;
            else
                arr[i] = 0;
        }

        System.out.println(Arrays.toString(arr));
    }

    static void task2() {
        int[] arr = new int[101];
        for (int i = 0; i <= 100; i++) {
            arr[i] = i;
            System.out.println("arr [" + i + "] = " + arr[i]);
        }

    }

    static void task3() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 6)
                arr[i] = arr[i] * 2;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void task4() {
        System.out.println("task4 ");
        int n = 5;
        int[][] table = new int[n][n];
        for (int i = 0; i < n; i++) {
            int j = i;
            table[i][j] = 1;
        }
        for (int i = 0; i < n; i++) {
            int j = n-1-i;
            table[i][j] = 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println("");
        }
    }

    static int[] task5(int len, int initialValue) {
        int[] n = new int[len];
        for (int i = 0; i < n.length; i++) {
            n[i] = initialValue;
        }
        return n;
    }


}
