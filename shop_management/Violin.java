package shop_management;
import behaviours.*;

public class Violin extends Instrument {
  int strings;

  public Violin(String brand, int strings) {
    super(brand);
    this.strings = strings;
  }

  public int getStrings() {
    return this.strings;
  }

  public String play() {
    return "VI-oh-LIN";
  }
}