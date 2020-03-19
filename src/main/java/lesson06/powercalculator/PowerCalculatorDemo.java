package lesson06.powercalculator;

public class PowerCalculatorDemo {

    public static void main(String[] args) {
        PowerCalculator powerCalculator = new PowerCalculator();

        int result = powerCalculator.resultNumber(3,3);
        int result2 = powerCalculator.resultNumber(-8,-8);
        int result3 = powerCalculator.resultNumber(-2,4);
        int result4 = powerCalculator.resultNumber(6,-5);
        System.out.println("number 3 power 3 - Result: " + result);
        System.out.println("number -8 power -8 - Result: " + result2);
        System.out.println("number -2 power 4 - Result: " + result3);
        System.out.println("number 6 power -5 - Result: " + result4);
    }
}
