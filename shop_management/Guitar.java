package shop_management;
import behaviours.*;

public class Guitar extends Instrument {
  int strings;
  String bodyType;

  public Guitar(int buyingPrice, int sellingPrice, String brand, int strings, String bodyType) {
    super(buyingPrice, sellingPrice, brand);
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

