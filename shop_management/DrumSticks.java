package shop_management;
import behaviours.*;

public class DrumSticks extends Accessory {
  private String material;

  public DrumSticks(int buyingPrice, int sellingPrice, String brand, String material) {
    super(buyingPrice, sellingPrice, brand);
    this.material = material;
  }

  public String getMaterial() {
    return this.material;
  }
}