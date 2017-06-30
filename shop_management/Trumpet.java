package shop_management;
import behaviours.*;

public class Trumpet extends Instrument {
  int valves;

  public Trumpet(String brand, int valves) {
    super(brand);
    this.valves = valves;
  }
}