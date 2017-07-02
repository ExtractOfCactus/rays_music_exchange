import static org.junit.Assert.*;
import org.junit.*;
import shop_management.*;

public class PianoTest {
  Piano piano1;
  Piano piano2;

  @Before
  public void before() {
    piano1 = new Piano(2000, 3000, "Baldwin", 85);
    piano2 = new Piano(2450, 3950, "Yamaha", 88);
  }

  @Test
  public void canGetBrand() {
    assertEquals("Baldwin", piano1.getBrand());
  }

  @Test
  public void canGetKeys() {
    assertEquals(88, piano2.getKeys());
  }

  @Test
  public void canPlay() {
    assertEquals("Tinkle tinkle pi-an-oh", piano2.play());
  }

  @Test
  public void canCalculateMarkup() {
    assertEquals(1000, piano1.calculateMarkup());
  }
}