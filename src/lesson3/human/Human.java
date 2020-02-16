package lesson3.human;

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

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
