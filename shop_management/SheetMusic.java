package shop_management;
import behaviours.*;

public class SheetMusic extends Accessory {
  private String genre;

  public SheetMusic(int buyingPrice, int sellingPrice, String brand, String genre) {
    super(buyingPrice, sellingPrice, brand);
    this.genre = genre; 
  }

  public String getGenre() {
    return this.genre;
  }
}