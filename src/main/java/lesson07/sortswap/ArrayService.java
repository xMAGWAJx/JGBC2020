package lesson07.sortswap;

public class ArrayService {

    public void sort(int[] array) {
        int tempNumber;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    tempNumber = array[i];
                    array[i] = array[j];
                    array[j] = tempNumber;
                }
            }
        }
    }

    public void swap(int[] array) {

        for (int i = 0; i < array.length / 2; i++) {
            int tempReverseNumber = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tempReverseNumber;
        }
    }
}
