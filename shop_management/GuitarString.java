package shop_management;
import behaviours.*;

public class GuitarString extends Accessory {
  double gauge;

  public GuitarString(int buyingPrice, int sellingPrice, String brand, double gauge) {
    super(buyingPrice, sellingPrice, brand);
    this.gauge = gauge;
  }

  public double getGauge() {
    return this.gauge;
  }
}