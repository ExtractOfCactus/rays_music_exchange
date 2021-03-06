package shop_management;
import behaviours.*;
import java.util.ArrayList;

public class Shop {
  private String name;
  private ArrayList<Sellable> stock;

  public Shop(String name) {
    this.name = name;
    this.stock = new ArrayList<Sellable>();
  }

  public String getName() {
    return this.name;
  }

  public int stockCount() {
    return this.stock.size();
  }

  public void addStock(Sellable item) {
    this.stock.add(item);
  }

  public void removeStock(Sellable item) {
    if (stock.remove(item) == true) {
      stock.remove(item);
    }
  }

  public int calculateTotalProfit() {
    int total = 0;
    for (Sellable item : stock) {
      total += item.calculateMarkup();
    }
    return total;
  }

}