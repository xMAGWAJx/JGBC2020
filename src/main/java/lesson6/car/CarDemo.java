package lesson6.car;

public class CarDemo {

  public static void main(String[] args) {

    Car carKia = new Car("Sportage", "Black", 200, 190);
    Car carKia2 = new Car("Sportage", "Blue", 200, 100);

    System.out.println(carKia.toString());

    System.out.println("Car can accelerate: " + carKia.canAccelerate()); // return: true

    carKia.accelerate(200);

    System.out.println("Current speed1: " + carKia.getCarCurrentSpeed()); // return: 200

    System.out.println("Car can accelerate: " + carKia.canAccelerate()); // return: false

    carKia.accelerate(210);

    System.out.println("Current speed2: " + carKia.getCarCurrentSpeed()); // return: 200

    carKia.decelerate(180);

    System.out.println("Current speed3: " + carKia.getCarCurrentSpeed()); // return: 180

    carKia.decelerate(180);

    System.out.println("Current speed4: " + carKia.getCarCurrentSpeed()); // return: 180

    carKia.decelerate(0);

    System.out.println("Current speed5: " + carKia.getCarCurrentSpeed()); // return: 0

    System.out.println("Car is driving: " + carKia.isDriving()); // return: false

    System.out.println("Car is stopped: " + carKia.isStopped()); // return: true

    carKia.accelerate(50);

    System.out.println("Current speed6: " + carKia.getCarCurrentSpeed()); // return: 50

    System.out.println("Car is driving: " + carKia.isDriving()); // return: true

    System.out.println("carKia equals carKia = " + carKia.equals(carKia));
    System.out.println("carKia not equals carKia2 = " + carKia.equals(carKia2));

  }
}
