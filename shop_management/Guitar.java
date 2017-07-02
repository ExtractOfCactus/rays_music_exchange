package shop_management;
import behaviours.*;

public class Guitar extends Instrument {
  private int strings;
  private String bodyType;

  public Guitar(int buyingPrice, int sellingPrice, String brand, int strings, String bodyType, InstrumentType type) {
    super(buyingPrice, sellingPrice, brand, type);
    this.strings = strings;
    this.bodyType = bodyType;
  }

  public int getStrings() {
    return this.strings;
  }

  public String play() {
    return "GRRitARRRR";
  }
}

