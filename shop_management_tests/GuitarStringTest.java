import static org.junit.Assert.*;
import org.junit.*;
import shop_management.*;

public class GuitarStringTest {
  GuitarString stringSet1;
  GuitarString stringSet2;

  @Before
  public void before() {
    stringSet1 = new GuitarString(5, 20, "Elixir", 0.028);
    stringSet2 = new GuitarString(7, 25, "D'Addario", 0.032);
  }

  @Test
  public void canGetBuyingPrice() {
    assertEquals(5, stringSet1.getBuyingPrice());
  }

  @Test
  public void canGetSellingPrice() {
    assertEquals(25, stringSet2.getSellingPrice());
  }@Test
  public void canGetBrand() {
    assertEquals("Elixir", stringSet1.getBrand());
  }

  @Test
  public void canGetgauge() {
    assertEquals(0.032, stringSet2.getGauge(), 0.001);
  }

}