package lesson3.dog;

public class Dog {
    private int age;
    private String color;
    private String name;
    private boolean eat;
    private boolean sleep;


    public Dog(int age, String color, String name) {
        this.age = age;
        this.color = color;
        this.name = name;
    }

    public void voice() {
        System.out.println("Bark Bark");
    }

    public void dogEatsFood() {
        System.out.println("chewing a bone");
        eat = true;
    }

    public void dogDoesNotEatsFood() {
        System.out.println("Is not hungry");
        eat = false;
    }

    public void dogSleeps() {
        System.out.println("Z-Z-Z-Z-Z-Z-Z-Z-Z-Z-Z-Z-Z");
        sleep = true;
    }

    public void dogDoesNotSleep() {
        System.out.println("Z-Z-Z-Z-Z-Z-Z-Z-Z-Z-Z-Z-Z");
        sleep = false;
    }

    public void setSleep(boolean sleep) {
        this.sleep = sleep;
    }

    public boolean isSleep() {
        return sleep;
    }

    public int getAge() {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isEat() {
        return eat;
    }

    public void setEat(boolean eat) {
        this.eat = eat;
    }
}
