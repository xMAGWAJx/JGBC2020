package lesson08.practisetaskfromartyom;

import java.util.ArrayList;
import java.util.List;

public class AnimalUtils {

    // methods for array
//    public static void printStartsWith(Animal[] animals, String startsWith) {
//        for (Animal animal : animals) {
//            if (animal.getName().startsWith(startsWith)) {
//                System.out.println(animal);
//            }
//        }
//    }
//
//    public static void makeThemTalk(Animal[] animals) {
//        for (int i = 0; i < animals.length; i++) {
//            if (animals[i] instanceof Talker) {
//                Talker talker = (Talker)animals[i];
//                talker.talk();
//            }
//        }
//    }

    // Using List

    public static List<Animal> getStartWith(List<Animal> animals, String startWith) {
        List<Animal> result = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal.getName().startsWith(startWith)) {
                result.add(animal);
            }
        }
        return result;
    }

    public static List<Animal> getFishes(List<Animal> animals) {
        List<Animal> result = new ArrayList<>();
        for (Animal fish : animals) {
            if (fish instanceof Fish) {
                result.add(fish);
            }
        }
        return result;
    }

//    public static Map<String, List<Animal>> mapByFirstLetter(List<Animal> animals) {
//        Map<String, List<Animal>> map = new HashMap<>();
//
//    }

}
