import static org.junit.Assert.*;
import org.junit.*;
import shop_management.*;

public class ShopTest {
  Shop shop;
  Guitar guitar;
  Piano piano;
  Trumpet trumpet;

  @Before
  public void before() {
    trumpet = new Trumpet(350, 600, "Etude", 3, InstrumentType.BRASS);
    piano = new Piano(2000, 3000, "Baldwin", 85, InstrumentType.KEYBOARD);
    guitar = new Guitar(1100, 1800, "Gibson", 6, "Les Paul", InstrumentType.STRING);
    shop = new Shop("Ray's Music Exchange");
  }

  @Test
  public void canGetName() {
    assertEquals("Ray's Music Exchange", shop.getName());
  }

  @Test
  public void stockStartsEmpty() {
    assertEquals(0, shop.stockCount());
  }

  @Test
  public void canAddItemToStock() {
    shop.addStock(guitar);
    assertEquals(1, shop.stockCount());
  }

  @Test
  public void canRemoveItemsFromStock() {
    shop.addStock(guitar);
    shop.removeStock();
    assertEquals(0, shop.stockCount());
  }

  @Test
  public void canCalculateTotalProfit() {
    shop.addStock(guitar);
    shop.addStock(piano);
    shop.addStock(trumpet);
    assertEquals(1950, shop.calculateTotalProfit());
  }
  
}