package lesson8.animal;

public class AnimalsDemo {

  public static void main(String[] args) {

    Bird someBird = new Bird(true, true);

    System.out.println(someBird);
    someBird.fly();

    Bird someBirdCantFly = new Bird(false, true);

    System.out.println(someBirdCantFly);
    someBirdCantFly.fly();
    System.out.println(someBirdCantFly.makeSomeNoise("Tweet"));

    System.out.println(someBird.equals(someBird));

    // Parrot

    Parrot parrot = new Parrot(true,true,"Will Dance like Jackson!");
    System.out.println(parrot);
    parrot.setParrotWillDance("Like a nobody is watching!");
    parrot.fly();

    System.out.println(parrot.equals(parrot));

    // Mammal

    Mammal someMammal = new Mammal(false,true,"Come and check whats up");

    System.out.println(someMammal);
    System.out.println(someMammal.howMammalWillMeetYou);


    // Dog

    Dog someDog = new Dog(false, true, "start running towards you");

    System.out.println(someDog);
    someDog.setHowMammalWillMeetYou("It will jump and bark: ");

    someDog.setDogBarks("Dog barks");


    // Cat

    Cat someCat = new Cat(false,true,"ask for food.");


    someCat.setCatRrrrs("rRrrrRRRrrrRRRrrrRRRRrr");
    System.out.println();

  }
}
