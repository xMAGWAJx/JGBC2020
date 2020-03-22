package lesson07.arrayservice;

public class ArrayServiceDemo {

    public static void main(String[] args) {

        int[] arrayExample = ArrayService.create(10);
        ArrayService.fillRandomly(arrayExample);
        ArrayService.printArray(arrayExample);
        ArrayService.sum(arrayExample);
        ArrayService.avg(arrayExample);
    }
}
