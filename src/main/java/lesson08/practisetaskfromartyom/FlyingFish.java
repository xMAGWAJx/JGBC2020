package lesson08.practisetaskfromartyom;

public class FlyingFish extends Fish implements Flyer {

    private static int counter = 0;

    public FlyingFish(String name) {
        super(name);
        counter++;
    }

    @Override
    public void fly() {
        System.out.println("Fish is flying");
    }

    @Override
    public void land() {
        System.out.println("Fish drops into the water");
    }
}
