package shop_management;
import behaviours.*;

public class Piano extends Instrument {
  private int keys;

  public Piano(int buyingPrice, int sellingPrice, String brand, int keys, InstrumentType type) {
    super(buyingPrice, sellingPrice, brand, type);
    this.keys = keys;
  }

  public int getKeys() {
    return this.keys;
  }

  public String play() {
    return "Tinkle tinkle pi-an-oh";
  }
}