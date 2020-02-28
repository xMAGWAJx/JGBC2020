package lesson7.indexofmath;

public class IndexOfMax {

  public static void main(String[] args) {

    int[] elements = {1, 5, 3, 4, 7, 9, 8, 2, 6, 0};
    int idx = 0;

    for (int i = 0; i < elements.length; i++) {
      if (elements[idx] < elements[i]) {
        idx = i;
      }
    }

    System.out.println("idx = " + idx);
    System.out.println("elements[idx] = " + elements[idx]);
  }
}
