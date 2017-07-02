import static org.junit.Assert.*;
import org.junit.*;
import shop_management.*;

public class DrumSticksTest {
  DrumSticks stickSet1;
  DrumSticks stickSet2;

  @Before
  public void before() {
    stickSet1 = new DrumSticks(8, 15, "Pro-Mark", "Hickory");
    stickSet2 = new DrumSticks(10, 20, "Tama", "Maple");
  }

  @Test
  public void canGetBuyingPrice() {
    assertEquals(8, stickSet1.getBuyingPrice());
  }

  @Test
  public void canGetSellingPrice() {
    assertEquals(20, stickSet2.getSellingPrice());
  }

  @Test
  public void canGetBrand() {
    assertEquals("Pro-Mark", stickSet1.getBrand());
  }

  @Test
  public void canGetMaterial() {
    assertEquals("Maple", stickSet2.getMaterial());
  }

  @Test
  public void canCalculateMarkup() {
    assertEquals(7, stickSet1.calculateMarkup());
  }

}