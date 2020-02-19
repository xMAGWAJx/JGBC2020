package lesson4.stock;

public class Stock {

  private String companyName;
  private int currentPrice;
  private int minPrice;
  private int maxPrice;

  public Stock(String companyName, int currentPrice) {
    this.companyName = companyName;
    this.currentPrice = currentPrice;
    this.minPrice = currentPrice;
    this.maxPrice = currentPrice;
  }

  public void updatePrice(int newPrice) {

    this.currentPrice = newPrice;

     if (newPrice < minPrice) {
      this.minPrice = newPrice;
     }
     if (newPrice > maxPrice) {
       this.maxPrice = newPrice;
     }
  }

  public void printInformation() {
    System.out.println("Company = \"" + this.companyName + "\", Current Price = " + this.currentPrice + ", Min Price = " + this.minPrice + ", Max Price = " + this.maxPrice);
  }

}
