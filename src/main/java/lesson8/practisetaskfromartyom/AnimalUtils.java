package lesson8.practisetaskfromartyom;

public class AnimalUtils {
    public static void printStartsWith(Animal[] animals, String startsWith) {
        for (Animal animal : animals) {
            if (animal.getName().startsWith(startsWith)) {
                System.out.println(animal);
            }
        }
    }

    public static void makeThemTalk(Animal[] animals) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Talker) {
                Talker talker = (Talker)animals[i];
                talker.talk();
            }
        }
    }
}
