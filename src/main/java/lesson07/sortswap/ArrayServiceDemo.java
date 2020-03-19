package lesson07.sortswap;

import java.util.Arrays;

public class ArrayServiceDemo {

    public static void main(String[] args) {

        int[] a1 = {4, 7, 2, 3, 8, 9, 5, 1, 6};
        int[] a2 = {1, 3, 8, 5, 4, 7, 9, 6, 2};

        System.out.println(Arrays.toString(a1)); //[4, 7, 2, 3, 8, 9, 5, 1, 6]
        System.out.println(Arrays.toString(a2)); //[1, 3, 8, 5, 4, 7, 9, 6, 2]

        ArrayService svc = new ArrayService();
        svc.sort(a1);
        svc.swap(a2);

        System.out.println(Arrays.toString(a1)); //[1, 2, 3, 4, 5, 6, 7, 8, 9]
        System.out.println(Arrays.toString(a2)); //[2, 6, 9, 7, 4, 5, 8, 3, 1]
    }
}
