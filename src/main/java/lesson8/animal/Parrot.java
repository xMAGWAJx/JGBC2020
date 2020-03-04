package lesson8.animal;

public class Parrot extends Bird{

  protected String parrotWillDance;

  public Parrot (boolean hasWings,boolean hasTail, String parrotWillDance) {
    super(hasWings, hasTail);
    this.parrotWillDance = parrotWillDance;
  }

  public void setParrotWillDance(String getHowParrotWillDance) {
    parrotWillDance = getHowParrotWillDance;
    System.out.println(parrotWillDance);
  }

  @Override
  public String toString() {
    return "Parrot{" +
            "parrotWillDance='" + parrotWillDance + '\'' +
            ", makeSomeNoise='" + makeSomeNoise + '\'' +
            ", hasWings=" + hasWings +
            ", hasTail=" + hasTail +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;

    Parrot parrot = (Parrot) o;

    return parrotWillDance.equals(parrot.parrotWillDance);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + parrotWillDance.hashCode();
    return result;
  }
}
