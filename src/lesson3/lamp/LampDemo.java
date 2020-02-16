package lesson3.lamp;

public class LampDemo {
    public static void main(String[] args) {
        Lamp lampOne = new Lamp();
        Lamp lampTwo = new Lamp();

        System.out.println("lampOne.isOn = " + lampOne.isOn);
        System.out.println("lampTwo.isOn = " + lampTwo.isOn);
        System.out.println("Turning on lampOne!");
        lampOne.turnOn();
        System.out.println("lampOne.isOn = " + lampOne.isOn);
        System.out.println("lampTwo.isOn = " + lampTwo.isOn);
    }

}
