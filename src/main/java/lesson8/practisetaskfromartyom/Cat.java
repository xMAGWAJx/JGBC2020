package lesson8.practisetaskfromartyom;

public class Cat extends Animal implements Talker, Walker {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void breath() {
        System.out.println("Cat is breathing");
    }

    @Override
    public void talk() {
        System.out.println("Meow");
    }

    @Override
    public void walk() {
        System.out.println("Cat is walking");
    }
}
