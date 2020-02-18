package lesson3.dog;

public class DogDemo {
    public static void main(String[] args) {

        Dog bark = new Dog(100500, "black", "Barkly");
        System.out.println("Dog: " + bark.getName() + " is " + bark.getAge() + " years old and it's color is: " + bark.getColor() + ".");
        System.out.println("Dog named " + bark.getName() + " is asking for food!");
        bark.voice();
        System.out.print("Dog " + bark.getName() + " received his food. Now he sits in a corner and ");
        bark.eat();

        System.out.println();

        Dog sleepy = new Dog (9000, "white", "Sleepy");
        System.out.println("Dog: " + sleepy.getName() + " is " + sleepy.getAge() + " years old and it's color is: " + sleepy.getColor() + ".");
        System.out.println("Sleepy dog is not eating");
        System.out.print(sleepy.getName() + " is lying in a corner and he's sleeping making this sound - ");
        sleepy.sleep();
    }
}
