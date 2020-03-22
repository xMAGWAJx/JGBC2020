package lesson05.counter;

public class CounterTest {

    public static void main(String[] args) {

        Counter counter = new Counter();

        counter.getValue(); //Equals to 0
        counter.getStep();  //Equals to 1

        counter.increment();

        counter.getValue(); //Equals to 1

        counter.setStep(5);

        counter.increment();

        counter.setStep(2);

        counter.decrement();

        counter.getValue();  //Equals to 4
        counter.getStep();   //Equals to 2

        System.out.println("\nCheck1: clear method\n");

        counter.clear();

        counter.getValue(); //Equals to 0
        counter.getStep();  //Equals to 1

        System.out.println("\nCheck2: that setValues and setSteps are not set if they are above limit\n");

        counter.getValue(); //Equals to 0
        counter.getStep();  //Equals to 1

        counter.setValue(110);
        counter.setStep(20);

        counter.getValue(); //Equals to 0
        counter.getStep();  //Equals to 1

        System.out.println("\nCheck3: that set values are not set with negative values\n");

        counter.getValue(); //Equals to 0
        counter.getStep();  //Equals to 1

        counter.setValue(-10);
        counter.setStep(-4);

        counter.getValue(); //Equals to 0
        counter.getStep();  //Equals to 1

        System.out.println("\nCheck4: if value = 99 and steps = 3, then increment should not execute");

        counter.getValue(); //Equals to 0
        counter.getStep();  //Equals to 1

        counter.setValue(99);
        counter.setStep(3);

        counter.getValue(); //Equals to 99
        counter.getStep();  //Equals to 3

        counter.increment();

        counter.getValue(); //Equals to 99
        counter.getStep();  //Equals to 3

        System.out.println("\nCheck5: if value = 5 and steps = 7, decrement should not execute");

        counter.getValue(); //Equals to 0
        counter.getStep();  //Equals to 1

        counter.setValue(5);
        counter.setStep(7);

        counter.getValue(); //Equals to 5
        counter.getStep();  //Equals to 7

        counter.decrement();

        counter.getValue(); //Equals to 5
        counter.getStep();  //Equals to 7
    }
}
