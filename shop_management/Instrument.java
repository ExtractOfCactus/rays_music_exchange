package shop_management;
import behaviours.*;

abstract class Instrument implements Playable, Sellable{
  protected int buyingPrice;
  protected int sellingPrice;
  protected String brand;
  protected InstrumentType type;

  public Instrument(int buyingPrice, int sellingPrice, String brand, InstrumentType type) {
    this.buyingPrice = buyingPrice;
    this.sellingPrice = sellingPrice;
    this.brand = brand;
    this.type = type;
  }

  public String getBrand() {
    return this.brand;
  }

  public int getBuyingPrice() {
    return this.buyingPrice;
  }

  public int calculateMarkup() {
    return (this.sellingPrice - this.buyingPrice);
  }
}