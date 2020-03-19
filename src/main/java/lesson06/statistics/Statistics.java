package lesson06.statistics;

import java.util.Random;

public class Statistics {

    public static void main(String[] args) {
        Random random = new Random();

        int n = 5;
        System.out.println("Generating " + n + " numbers:");

        int sum = 0;
        int max = 0;
        int min = 0;
        for (int i = 0; i < n; i++) {
            int randomValue = random.nextInt(100);
            System.out.println(i + ") = " + randomValue);
            sum += randomValue;
            if (randomValue > max) {
                max = i;
            }
            if (randomValue < min || i == 0) {
                min = randomValue;
            }
        }
        double avg = (double) sum / n;
        System.out.println();
        System.out.println("Statistical information:");
        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
