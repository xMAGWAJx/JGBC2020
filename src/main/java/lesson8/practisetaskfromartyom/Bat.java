package lesson8.practisetaskfromartyom;

public class Bat extends Animal implements Flyer, Walker {


    public Bat(String name) {
        super(name);
    }

    @Override
    public void breath() {
        System.out.println("Bat is breathing");
    }

    @Override
    public void fly() {
        System.out.println("Bat is flying");
    }

    @Override
    public void land() {
        System.out.println("Bat is landing");

    }

    @Override
    public void walk() {

    }
}
