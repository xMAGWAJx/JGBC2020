package lesson08.animal;

import java.util.Objects;

public class Bird extends Animal {

    protected String makeSomeNoise;

    public Bird(boolean hasWings, boolean hasTail) {
        super(hasWings, hasTail);
    }

    public void fly() {
        if (hasWings != false) {
            System.out.println("Fly long and fast.");
        } else {
            System.out.println("Run as fast as lightning.");
        }
    }

    public String makeSomeNoise(String birdSaySomething) {
//    System.out.println(birdSaySomething);
        return birdSaySomething;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "fly='" + makeSomeNoise + '\'' +
                ", hasWings=" + hasWings +
                ", hasTail=" + hasTail +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bird bird = (Bird) o;
        return Objects.equals(makeSomeNoise, bird.makeSomeNoise);
    }

    @Override
    public int hashCode() {
        return Objects.hash(makeSomeNoise);
    }
}
