

package lesson5.counter;
public class Counter {

/*

Методы класса:

increment() - увеличить значение счетчика с учетом шага;

Условие: Если результат сложения текущего состояния счетчика и шага больше 100, тогда операцию не выполнять;
decrement() - уменьшить значение счетчика с учетом шага;

Условие: Если результат вычитания текущего состояния счетчика от шага меньше 0, тогда операцию не выполнять;
reset() - сбросить значение и шаг счетчика в начальное состояние;

setValue() - переопределение текущего значения;

Условие: Значение должно быть в диапазоне 0 .. 100;
getValue() - получение текущего значения;

setStep() - переопределение шага;

Условие: Значение должно быть в диапазоне 1 .. 10;
getStep() - получение текущего шага;

*/

    private int value;
    private int step;

    public Counter() {
        this.value = 0;
        this.value = 1;
    }

    public void increment() {
        value++;
    }

    public void decrement() {
        value--;
    }

    public void clear() {
        //TODO
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public int getStep() {
        return step;
    }

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

    }

}