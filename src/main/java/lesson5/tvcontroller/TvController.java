package lesson5.tvcontroller;

public class TvController {

   private Tv tv;

    public TvController(Tv tv) {
        this.tv = tv;
    }

    public void setTv(Tv tv) {
    this.tv = tv;
  }


  public void controllerNextChannel () {
      tv.nextChannel();
  }

  public void controllerPriviousChannel () {
    tv.previousChannel();
  }

  public void controllerAddVolume () {
      tv.addVolume();
  }

  public void controllerDecreaseVolume () {
      tv.decreaseVolume();
  }

}
