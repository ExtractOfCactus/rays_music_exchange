package shop_management;
import behaviours.*;

public class Piano extends Instrument {
  int keys;

  public Piano(String brand, int keys) {
    super(brand);
    this.keys = keys;
  }
}