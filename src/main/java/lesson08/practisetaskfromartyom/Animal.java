package lesson08.practisetaskfromartyom;

public abstract class Animal {

    private static int counter = 0;
    private String name;

    public Animal(String name) {
        this.name = name;
        counter++;
    }

    public static int getAnimalCount() {
        return counter;
    }

    public abstract void breath();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
