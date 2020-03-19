package lesson08.practisetaskfromartyom;

public class FuguFish extends Fish {

    private static int counter = 0;

    public FuguFish(String name) {
        super(name);
        counter++;
    }
}
