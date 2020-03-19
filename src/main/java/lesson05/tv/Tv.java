package lesson05.tv;

import java.util.Objects;

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

  // This Method is for testing purposes. It passes isTVon = true for TvTest.
  public Tv(int currentChannel, int currentVolume, String manufacturer, boolean isTVon) {
    this.currentChannel = currentChannel;
    this.currentVolume = currentVolume;
    this.manufacturer = manufacturer;
    this.isTVon = isTVon;
  }

  public int getCurrentChannel() {
      return currentChannel;
    }

    public int getCurrentVolume() {
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
    if (this.isTVon) {
      this.currentVolume++;
    }
  }

  public void decreaseVolume() {
    if (this.isTVon) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Tv tv = (Tv) o;
    return currentChannel == tv.currentChannel &&
            currentVolume == tv.currentVolume &&
            isTVon == tv.isTVon &&
            Objects.equals(manufacturer, tv.manufacturer);
  }
}
