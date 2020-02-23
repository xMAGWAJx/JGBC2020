package lesson5.tv;

public class TvDemo {

  public static void main(String[] args) {

    Tv tv = new Tv(10, 5, "Samsung");

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

    System.out.println(tv.getCurrentChannel()); // expected 10 ... but I get 9

    tv.nextChannel();

    System.out.println(tv.getCurrentChannel()); // expected 10 .... but it also increments as in previous step.
  }
}
