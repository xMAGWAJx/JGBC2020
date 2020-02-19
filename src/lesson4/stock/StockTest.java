package lesson4.stock;

public class StockTest {

  public static void main(String[] args) {

    Stock google = new Stock("GOOG", 10);
    google.printInformation();

    google.updatePrice(15);
    google.updatePrice(7);
    google.updatePrice(14);

    google.printInformation();

// Console output should look like this:
//    Company = "GOOG", Current Price = 10, Min Price = 10, Max Price = 10
//    Company = "GOOG", Current Price = 14, Min Price = 7, Max Price = 15

  }
}
