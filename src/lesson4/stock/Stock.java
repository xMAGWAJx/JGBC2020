package lesson4.stock;

public class Stock {

  private String companyName;
  private int currentPrice;
  private int minPrice;
  private int maxPrice;



  public Stock(String companyName, int currentPrice) {
    this.companyName = companyName;
    this.currentPrice = currentPrice;
  }

  public void printInformation() {
    System.out.println("Company = \"" + getCompanyName() + "\", Current Price = " + getCurrentPrice() + ", Min Price = " + getMinPrice() + ", Max Price = " + getMaxPrice());
  }

  public void updatePrice(int currentPrice) {
    if (currentPrice < getMaxPrice()) {
      setMaxPrice(currentPrice);
    } else if (currentPrice > getMinPrice()) {
      setMinPrice(currentPrice);
    } else {

      System.out.println("Some error");
    }
  }

  public String getCompanyName() {
    return companyName;
  }

  public int getCurrentPrice() {
    return currentPrice;
  }

  public void setMinPrice(int minPrice) {
    this.minPrice = minPrice;
  }

  public void setMaxPrice(int maxPrice) {
    this.maxPrice = maxPrice;
  }

  public int getMinPrice() {
    return minPrice;
  }

  public int getMaxPrice() {
    return maxPrice;
  }
}
