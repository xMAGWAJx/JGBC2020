package lesson08.animal;

public abstract class Mammal extends Animal {

    protected String howMammalWillMeetYou;

    public Mammal(boolean hasWings, boolean hasTail, String howMammalWillMeetYou) {
        super(hasWings, hasTail);
        this.howMammalWillMeetYou = howMammalWillMeetYou;
    }

    public void setHowMammalWillMeetYou(String getHowMammalWillMeetYou) {
        howMammalWillMeetYou = getHowMammalWillMeetYou;
        System.out.println(howMammalWillMeetYou);
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "howMammalWillMeetYou='" + howMammalWillMeetYou + '\'' +
                ", hasWings=" + hasWings +
                ", hasTail=" + hasTail +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Mammal mammal = (Mammal) o;

        return howMammalWillMeetYou != null ? howMammalWillMeetYou.equals(mammal.howMammalWillMeetYou) : mammal.howMammalWillMeetYou == null;
    }

    @Override
    public int hashCode() {
        return howMammalWillMeetYou != null ? howMammalWillMeetYou.hashCode() : 0;
    }
}
