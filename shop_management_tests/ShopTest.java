import static org.junit.Assert.*;
import org.junit.*;
import shop_management.*;

public class ShopTest {
  Shop shop;

  @Before
  public void before() {
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

  
}