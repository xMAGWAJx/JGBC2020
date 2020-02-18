package lesson3.dog;

public class Dog {
    private int age;
    private String color;
    private String name;

    public Dog(int age, String color, String name) {
        this.age = age;
        this.color = color;
        this.name = name;
    }

    public void voice() {
        System.out.println("Bark Bark");
    }

    public void eat() {
        System.out.println("chewing a bone");
    }

    public void sleep() {
        System.out.println("Z-Z-Z-Z-Z-Z-Z-Z-Z-Z-Z-Z-Z");
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

}
