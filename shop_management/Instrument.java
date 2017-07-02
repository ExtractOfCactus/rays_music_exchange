package shop_management;
import behaviours.*;

abstract class Instrument implements Playable, Sellable{
  int buyingPrice;
  int sellingPrice;
  String brand;

  public Instrument(int buyingPrice, int sellingPrice, String brand) {
    this.buyingPrice = buyingPrice;
    this.sellingPrice = sellingPrice;
    this.brand = brand;
  }

  public String getBrand() {
    return this.brand;
  }

  public int calculateMarkup() {
    return (this.sellingPrice - this.buyingPrice);
  }
}