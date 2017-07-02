package shop_management;
import behaviours.*;

public class Trumpet extends Instrument {
  int valves;

  public Trumpet(int buyingPrice, int sellingPrice, String brand, int valves) {
    super(buyingPrice, sellingPrice, brand);
    this.valves = valves;
  }

  public int getValves() {
    return this.valves;
  }

  public String play() {
    return "trrrrrUMP-ET";
  }
}