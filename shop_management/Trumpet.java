package shop_management;
import behaviours.*;

public class Trumpet extends Instrument {
  private int valves;

  public Trumpet(int buyingPrice, int sellingPrice, String brand, int valves, InstrumentType type) {
    super(buyingPrice, sellingPrice, brand, type);
    this.valves = valves;
  }

  public int getValves() {
    return this.valves;
  }

  public String play() {
    return "trrrrrUMP-ET";
  }
}