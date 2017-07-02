package shop_management;
import behaviours.*;

public class Amplifier extends Accessory{
  String madeFor;

  public Amplifier(int buyingPrice, int sellingPrice, String brand, String madeFor) {
    super(buyingPrice, sellingPrice, brand);
    this.madeFor = madeFor;

  }

  public String getMadeFor() {
    return this.madeFor;
  }
}