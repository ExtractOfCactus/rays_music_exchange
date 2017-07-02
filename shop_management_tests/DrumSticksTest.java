import static org.junit.Assert.*;
import org.junit.*;
import shop_management.*;

public class DrumSticksTest {
  DrumSticks sticksSet1;
  DrumSticks stickSet2;

  @Before
  public void before() {
    sticksSet1 = new DrumSticks(8, 15, "Pro-Mark", "Hickory");
    stickSet2 = new DrumSticks(10, 20, "Tama", "Maple");
  }

  @Test
  public void canGetBuyingPrice() {
    assertEquals(8, sticksSet1.getBuyingPrice());
  }

  @Test
  public void canGetSellingPrice() {
    assertEquals(20, stickSet2.getSellingPrice());
  }@Test
  public void canGetBrand() {
    assertEquals("Pro-Mark", sticksSet1.getBrand());
  }

  @Test
  public void canGetMaterial() {
    assertEquals("Maple", stickSet2.getMaterial());
  }

}