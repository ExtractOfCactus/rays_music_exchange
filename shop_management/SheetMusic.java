package shop_management;
import behaviours.*;

public class SheetMusic extends Accessory {
  String type;

  public SheetMusic(int buyingPrice, int sellingPrice, String brand, String type) {
    super(buyingPrice, sellingPrice, brand);
    this.type = type;
    
  }
}