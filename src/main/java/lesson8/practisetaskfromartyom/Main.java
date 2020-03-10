package lesson8.practisetaskfromartyom;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Fish fish1 = new Fish("riba1");
        Fish fish2 = new Fish("riba2");
        Dog dog = new Dog("dog1");
        FlyingFish flyingFish = new FlyingFish("flying riba");
        System.out.println(Fish.getFishCount());
        System.out.println(Animal.getAnimalCount());

        // Using arrays

//        Animal[] animals = new Animal[4];
//        animals[0] = fish1;
//        animals[1] = fish2;
//        animals[2] = dog;
//        animals[3] = flyingFish;
//
//        AnimalUtils.printStartsWith(animals, "ri");
//        AnimalUtils.makeThemTalk(animals);


        // Using List

        List<Animal> animals = new ArrayList<>();

        animals.add(fish1);
        animals.add(fish2);
        animals.add(dog);
        animals.add(flyingFish);

        // getStartWith

        List<Animal> animalList = AnimalUtils.getStartWith(animals, "ri");

        System.out.println(animalList);

        // getFishes

        List<Animal> fishList = AnimalUtils.getFishes(animals);

        System.out.println(fishList);
    }

}
