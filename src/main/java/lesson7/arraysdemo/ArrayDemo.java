package lesson7.arraysdemo;

import java.util.Random;

public class ArrayDemo {

  public static void main(String[] args) {
    int[] array = new int[10];

    Random random = new Random();
    for (int i = 0; i < array.length; i++) {
      array[i] = random.nextInt();
    }

    for (int i = 0; i < array.length; i++) {
      System.out.println("array[" + i + "] = " + array[i]);
    }

  }

}
