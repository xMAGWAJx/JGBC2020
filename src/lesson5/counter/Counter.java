package lesson5.counter;

public class Counter {

    private int value;
    private int step;

    public Counter() {
        this.value = 0;
        this.step = 1;
    }

  public int getValue() {
    System.out.println("Value equals to : " + value);
    return this.value;
  }

  public int getStep() {
    System.out.println("Step equals to: " + step);
    return step;
  }

  public void setStep(int step) {
      if (step >= 1 && step <= 10) {
        this.step = step;
      }
  }

  public void setValue(int value) {
      if (value >= 0 && value <= 100) {
        this.value = value;
      }
  }

  public void increment() {
      int incrementValue = this.value + this.step;
      if ((incrementValue >= 0) && (incrementValue < 100) ) {
        this.value = incrementValue;
      }
    }

    public void decrement() {
      int incrementValue = this.value - this.step;
      if (incrementValue >= 0) {
        this.value = incrementValue;
      }
    }

    public void clear() {
      this.value = 0;
      this.step = 1;
    }
}