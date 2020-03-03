package lesson8.animal;

public class Bird extends Animal {

  protected String fly;

  public Bird (boolean hasWings, String fly) {
    super(hasWings);
    this.fly = fly;
  }

  public void fly() {
    fly = "Fly";
  }


}
