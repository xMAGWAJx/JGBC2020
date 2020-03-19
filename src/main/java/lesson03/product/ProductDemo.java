package lesson03.product;

public class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product("Milk");
        product.setRegularPrice(0.8);
        product.setDiscount(20);
        product.printInformation();
    }
}
