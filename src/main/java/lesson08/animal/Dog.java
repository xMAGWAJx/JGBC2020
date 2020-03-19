package lesson08.animal;

public class Dog  extends Mammal{

  public String dogBarks;

  public Dog (boolean hasWings, boolean hasTail, String howMammalWillMeetYou) {
    super(hasWings, hasTail, howMammalWillMeetYou);
    this.dogBarks = dogBarks;
  }

  public void setDogBarks(String dogBarks) {
    System.out.println(dogBarks);
    System.out.println("Wuf Wuf!");
  }

  @Override
  public void setHowMammalWillMeetYou(String getHowMammalWillMeetYou) {
    System.out.println("Barkly bark bark - i am happy to welcome you!");
  }

  @Override
  public String toString() {
    return "Dog{" +
            "dogBarks='" + dogBarks + '\'' +
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

    Dog dog = (Dog) o;

    return dogBarks != null ? dogBarks.equals(dog.dogBarks) : dog.dogBarks == null;
  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (dogBarks != null ? dogBarks.hashCode() : 0);
    return result;
  }
}
