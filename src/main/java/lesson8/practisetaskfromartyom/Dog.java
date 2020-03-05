package lesson8.practisetaskfromartyom;

public class Dog extends Animal implements Talker, Walker {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void breath() {
        System.out.println("Dog is breathing");
    }

    @Override
    public void talk() {
        System.out.println("Bark");
    }

    @Override
    public void walk() {
        System.out.println("Dog is walking");
    }
}
