package lesson08.practisetaskfromartyom;

public class Fish extends Animal {

    private static int counter = 0;

    public Fish(String name) {
        super(name);
        counter++;
    }

    public static int getFishCount() {
        return counter;
    }

    @Override
    public void breath() {
        System.out.println("Fish is breathing");
    }
}
