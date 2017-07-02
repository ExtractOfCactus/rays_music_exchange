package shop_management;
import behaviours.*;

public class Violin extends Instrument {
  private int strings;

  public Violin(int buyingPrice, int sellingPrice, String brand, int strings, InstrumentType type) {
    super(buyingPrice, sellingPrice, brand, type);
    this.strings = strings;
  }

  public int getStrings() {
    return this.strings;
  }

  public String play() {
    return "VI-oh-LIN";
  }
}