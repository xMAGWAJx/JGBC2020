package lesson2;

import java.util.Random;

public class RandomGeneratorDemo {
    public static void main(String[] args) {
        Random randomGenerator = new Random();

        int value1 = randomGenerator.nextInt(100);
        int value2 = randomGenerator.nextInt(100);
        int value3 = randomGenerator.nextInt(100);

        System.out.println("Первое случайно сгенерированное число: " + value1);
        System.out.println("Второе случайно сгенерированное число: " + value2);
        System.out.println("Третье случайно сгенерированное число: " + value3);

        int randomNumberSum = value1 + value2 + value3;

        System.out.println("Результат сложения трёх случайных чисел" + randomNumberSum);
    }
}
