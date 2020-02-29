package lesson7.arrayservice;

import java.util.Random;

public class ArrayService {

    public int[] create(int size) {
        int[] array = new int[size];
        return array;
    }

    public void fillRandomly(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return;
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }


//
//    public int sum(int[] array) {
//        // TODO
//    }
//
//    public double avg(int[] array) {
//        // TODO
//    }

}
