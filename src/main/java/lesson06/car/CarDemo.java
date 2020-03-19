package lesson06.car;

public class CarDemo {

  public static void main(String[] args) {

    Car carKia = new Car("Sportage", "Black", 10);
    Car carKia2 = new Car("Sportage", "Blue", 200);

    System.out.println(carKia.toString());

    System.out.println("Car is driving: " + carKia.isDriving()); // return: false

    System.out.println("Car is stopped: " + carKia.isStopped()); // return: true

    carKia.accelerate(1);
    System.out.println("Current speed1: " + carKia.getCarCurrentSpeed()); // return: 20

    System.out.println("Car can accelerate: " + carKia.canAccelerate()); // return: true

    carKia.accelerate(12);
    System.out.println("Current speed2: " + carKia.getCarCurrentSpeed()); // return: 100

    System.out.println("Car can accelerate: " + carKia.canAccelerate()); // return: false

    System.out.println("Car is driving: " + carKia.isDriving()); // return: false

    System.out.println("Car is stopped: " + carKia.isStopped()); // return: true

    carKia.decelerate(8);

    System.out.println("Current speed3: " + carKia.getCarCurrentSpeed()); // return: 8

    carKia.decelerate(8);

    System.out.println("Current speed4: " + carKia.getCarCurrentSpeed()); // return: 8

    carKia.decelerate(0);

    System.out.println("Current speed5: " + carKia.getCarCurrentSpeed()); // return: 0

    System.out.println("Car is driving: " + carKia.isDriving()); // return: false

    System.out.println("Car is stopped: " + carKia.isStopped()); // return: true

    System.out.println("carKia equals carKia = " + carKia.equals(carKia));
    System.out.println("carKia not equals carKia2 = " + carKia.equals(carKia2));

  }
}
