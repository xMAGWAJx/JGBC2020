package lesson03.human;

public class Human {
    private String name;
    private int age;

    public Human (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void great() {
        System.out.println("Hi! My name is " + name + ", I'm " + age + " years old");
    }
}
