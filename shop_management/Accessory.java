package shop_management;
import behaviours.*;

abstract class Accessory {
  int buyingPrice;
  int sellingPrice;
  String brand;

  public Accessory(int buyingPrice, int sellingPrice, String brand) {
    this.buyingPrice = buyingPrice;
    this.sellingPrice = sellingPrice;
    this.brand = brand;
  }

  public int getBuyingPrice() {
    return this.buyingPrice;
  }

  public int getSellingPrice() {
    return this.sellingPrice;
  }

  public String getBrand() {
    return this.brand;
  }
}