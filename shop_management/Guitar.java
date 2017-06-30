package shop_management;
import behaviours.*;

public class Guitar extends Instrument {
  int strings;
  String bodyType;

  public Guitar(String brand, int strings, String bodyType) {
    super(brand);
    this.strings = strings;
    this.bodyType = bodyType;
  }

  public int getStrings() {
    return this.strings;
  }
}

