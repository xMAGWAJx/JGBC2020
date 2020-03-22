package lesson07.arrayservice;

import java.util.Random;

public class ArrayService {

    public static int[] create(int size) {
        return new int[size];
    }

    public static void fillRandomly(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static double avg(int[] array) {
        double avg = 0;
        if (sum(array) == 0) {
            System.out.println("\nArray is empty = " + 0);
        } else {
            avg = (double) sum(array) / array.length;
        }
        System.out.println("\nSum of array = " + sum(array));
        System.out.println("AVG = " + avg);
        return avg;
    }
}
