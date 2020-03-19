package lesson03.encoder;

public class Encoder {

    public void encode(short shortCode) {
        char charSymbol = (char) shortCode;
        System.out.println(shortCode + " => " + charSymbol);
    }

    public void decode(char charSymbol) {
        short shortCode = (short) charSymbol;
        System.out.println(charSymbol + " => " + shortCode);
    }
}
