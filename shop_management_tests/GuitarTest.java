import static org.junit.Assert.*;
import org.junit.*;
import shop_management.*;

public class GuitarTest {
  Guitar guitar1;
  Guitar guitar2;

  @Before
  public void before() {
    guitar1 = new Guitar(1100, 1800, "Gibson", 6, "Les Paul", InstrumentType.STRING);
    guitar2 = new Guitar(750, 1400, "Ibanez", 12, "SG", InstrumentType.STRING);
  }

  @Test
  public void canGetBrand() {
    assertEquals("Gibson", guitar1.getBrand());
  }

  @Test
  public void canGetStrings() {
    assertEquals(12, guitar2.getStrings());
  }

  @Test
  public void canPlay() {
    assertEquals("GRRitARRRR", guitar2.play());
  }

  @Test
  public void canGetBuyingPrice() {
    assertEquals(750, guitar2.getBuyingPrice());
  }

  @Test
  public void canCalculateMarkup() {
    assertEquals(700, guitar1.calculateMarkup());
  }



}