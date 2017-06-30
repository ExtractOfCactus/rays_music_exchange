package shop_management;
import behaviours.*;

abstract class Instrument implements Playable {
  String brand;

  public Instrument(String brand) {
    this.brand = brand;
  }

  public String getBrand() {
    return this.brand;
  }
}