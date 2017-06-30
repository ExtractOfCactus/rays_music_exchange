import static org.junit.Assert.*;
import org.junit.*;
import shop_management.*;

public class PianoTest {
  Piano piano1;
  Piano piano2;

  @Before
  public void before() {
    piano1 = new Piano("Baldwin", 85);
    piano2 = new Piano("Yamaha", 88);
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
}