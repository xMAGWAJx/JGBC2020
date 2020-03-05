package lesson8.practisetaskfromartyom;

public class FlyingSquirrel extends Squirrel implements Flyer {
    public FlyingSquirrel(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Squirrel is flying");
    }

    @Override
    public void land() {
        System.out.println("Squirrel is landing");
    }
}
