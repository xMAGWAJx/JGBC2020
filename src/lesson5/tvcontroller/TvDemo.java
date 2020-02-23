package lesson5.tvcontroller;

import lesson5.tv.Tv;

public class TvDemo {

  public static void main(String[] args) {

    Tv tv = new Tv(10, 5, "Samsung");
    Tv tv1 = new Tv(10, 5, "Samsung");
    Tv tv2 = new Tv(10, 5, "Samsung");
    Tv tv3 = new Tv(420, 100500, "Sony");

    tv.isTVon(); // Tv is working: true

    System.out.println(tv); // Tv{currentChannel=10, currentVolume=5, manufacturer='Samsung', isTVon=true}

    tv.nextChannel();

    System.out.println(tv.getCurrentChannel()); // 11

    tv.previousChannel();

    System.out.println(tv.getCurrentChannel()); // 10

    System.out.println(tv); // Tv{currentChannel=10, currentVolume=5, manufacturer='Samsung', isTVon=true}

    tv.isTVon(); // Tv is working: false

    System.out.println(tv); // Tv{currentChannel=10, currentVolume=5, manufacturer='Samsung', isTVon=false}

    tv.previousChannel();

    System.out.println(tv.getCurrentChannel()); // expected 10

    tv.nextChannel();

    System.out.println(tv.getCurrentChannel()); // expected 10

    System.out.println(tv.getManufacturer()); // expected Samsung

    tv.isTVon(); // Tv is working: true

    System.out.println(tv.getCurrentVolume()); // expected 5

    tv.addVolume();
    tv.addVolume();

    System.out.println(tv.getCurrentVolume()); // expected 7

    tv.decreaseVolume();

    System.out.println(tv.getCurrentVolume()); // expected 6

    System.out.println(tv1.equals(tv2)); // true

    System.out.println(tv2.equals(tv3)); // false
  }
}
