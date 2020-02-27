package lesson5.tvcontroller;

public class TvDemo {

  public static void main(String[] args) {

    Tv tv = new Tv(10, 5, "Samsung");

    TvController tvcontroller = new TvController(tv);

    // Check that controller methods work.

    tvcontroller.controllerNextChannel();

    System.out.println("Current channel: " + tv.getCurrentChannel()); // return: 10 - because tv is off

    tvcontroller.controllerTurnTvOnOrOff(); // returns: Tv is working: true

    tvcontroller.controllerNextChannel();

    System.out.println("Current channel: " + tv.getCurrentChannel()); // return: 11 - because tv is on

    tvcontroller.controllerTurnTvOnOrOff(); // returns: Tv is working: false

    tvcontroller.controllerNextChannel();

    System.out.println("Current channel: " + tv.getCurrentChannel()); // returns: 11 - because tv is off

    tvcontroller.controllerTurnTvOnOrOff(); // returns: Tv is working: true

    tvcontroller.controllerPreviousChannel();
    tvcontroller.controllerPreviousChannel();

    System.out.println("Current channel: " + tv.getCurrentChannel()); // returns: 9 - because tv is on

    tvcontroller.controllerAddVolume();

    System.out.println("Current volume: " + tv.getCurrentVolume()); // return: 6 - because tv is on

    tvcontroller.controllerDecreaseVolume();
    tvcontroller.controllerDecreaseVolume();

    System.out.println("Current volume: " + tv.getCurrentVolume()); // return: 4 - because tv is on

  }
}
