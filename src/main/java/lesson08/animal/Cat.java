package lesson08.animal;

public class Cat extends Mammal{

  public String catRrrrs;

  public Cat(boolean hasWings, boolean hasTail, String howMammalWillMeetYou) {
    super(hasWings, hasTail, howMammalWillMeetYou);
    this.catRrrrs = catRrrrs;
  }

  @Override
  public void setHowMammalWillMeetYou(String getHowMammalWillMeetYou) {
    System.out.println("Something that cat do");
  }

  public void setCatRrrrs(String catRrrrs) {
    System.out.println("Cat is on table and snors like: ");
    System.out.println(catRrrrs);
  }

  @Override
  public String toString() {
    return "Cat{" +
            "catRrrrs='" + catRrrrs + '\'' +
            ", howMammalWillMeetYou='" + howMammalWillMeetYou + '\'' +
            ", hasWings=" + hasWings +
            ", hasTail=" + hasTail +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;

    Cat cat = (Cat) o;

    return catRrrrs != null ? catRrrrs.equals(cat.catRrrrs) : cat.catRrrrs == null;
  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (catRrrrs != null ? catRrrrs.hashCode() : 0);
    return result;
  }
}
