import static org.junit.Assert.*;
import org.junit.*;
import shop_management.*;

public class AmplifierTest {
  Amplifier amp1;
  Amplifier amp2;

  @Before
  public void before() {
    amp1 = new Amplifier(200, 500, "Ibanez", "Guitar");
    amp2 = new Amplifier(150, 400, "Epiphone", "Violin");
  }

  @Test
  public void canGetBuyingPrice() {
    assertEquals(200, amp1.getBuyingPrice());
  }

  @Test
  public void canGetSellingPrice() {
    assertEquals(400, amp2.getSellingPrice());
  }@Test
  public void canGetBrand() {
    assertEquals("Ibanez", amp1.getBrand());
  }

  @Test
  public void canGetMadeFor() {
    assertEquals("Violin", amp2.getMadeFor());
  }
}