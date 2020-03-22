package lesson03.product;

public class Product {
    private String name;
    private double regularPrice;
    private double discount;

    public Product(String name) {
        this.name = name;
    }

    public double actualPrice() {
        double discountAmount = 100 - discount;
        double result = (regularPrice * discountAmount) / 100;
        return result;
    }

    public void printInformation() {
        System.out.println("Product : name = \"" + name + "\", regular price = " + getRegularPrice() + " EUR, discount = " + getDiscount() + "%, actual price = " + actualPrice());
    }


    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public int getDiscount() {
        return (int) discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
