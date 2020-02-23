package lesson5.tv;

public class Tv {

  private int currentChannel;
  private int currentVolume;
  private String manufacturer;
  private boolean isTVon;

  public Tv(int currentChannel, int currentVolume, String manufacturer) {
    this.currentChannel = currentChannel;
    this.currentVolume = currentVolume;
    this.manufacturer = manufacturer;
  }

  public int getCurrentChannel() {
    return currentChannel;
  }

  public int getcurrentVolume() {
    return currentVolume;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public void isTVon() {
    this.isTVon = !this.isTVon;
    System.out.println("Tv is working: " + this.isTVon);
  }

  public void nextChannel() {
    if (this.isTVon) {
      this.currentChannel++;
    }
  }

  public void previousChannel() {
    if (this.isTVon){
      this.currentChannel--;
    }
  }

  public void addVolume() {
    if (isTVon) {
      this.currentVolume++;
    }
  }

  public void decreaseVolume() {
    if (isTVon) {
      this.currentVolume--;
    }
  }

  @Override
  public String toString() {
    return "Tv{" +
            "currentChannel=" + currentChannel +
            ", currentVolume=" + currentVolume +
            ", manufacturer='" + manufacturer + '\'' +
            ", isTVon=" + isTVon +
            '}';
  }
}
