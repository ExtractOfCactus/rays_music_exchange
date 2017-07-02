import static org.junit.Assert.*;
import org.junit.*;
import shop_management.*;

public class GuitarTest {
  Guitar guitar1;
  Guitar guitar2;

  @Before
  public void before() {
    guitar1 = new Guitar("Gibson", 6, "Les Paul");
    guitar2 = new Guitar("Ibanez", 12, "SG");
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

}