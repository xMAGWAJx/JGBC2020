package lesson05.tvcontroller;

public class TvController {

  private Tv tv;

  public TvController(Tv tv) {
    this.tv = tv;
  }

  public void controllerTurnTvOnOrOff() {
    tv.isTVon();
  }

  public void controllerNextChannel() {
    tv.nextChannel();
  }

  public void controllerPreviousChannel() {
    tv.previousChannel();
  }

  public void controllerAddVolume() {
    tv.addVolume();
  }

  public void controllerDecreaseVolume() {
    tv.decreaseVolume();
  }

}
