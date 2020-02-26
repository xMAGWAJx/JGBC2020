package lesson6.numberservice;

public class NumberService {

  public int rangeSum(int start, int finish) {
    if (start < finish) {
      int sum = 0;
      for (int i = start; i <= finish; i++) {
        sum += i;
      }
      return sum;
    } else {
      int sum = 0;
      for (int i = start; i >= finish; i--) {
        sum += i;
      }
      return sum;
    }
  }

    public int rangeEvenCount(int start, int finish) {
      if (start < finish) {
        int count = 0;
          for (int i = start; i <= finish; i++) {
             if (i % 2 == 0) {
               count++;
             }
          }
          return count;
      } else {
        int count = 0;
        for (int i = start; i >= finish; i--) {
          if (i % 2 == 0) {
            count++;
          }
        }
        return count;
      }
  }
}

