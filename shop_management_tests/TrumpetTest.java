import static org.junit.Assert.*;
import org.junit.*;
import shop_management.*;

public class TrumpetTest {
  Trumpet trumpet1;
  Trumpet trumpet2;

  @Before
  public void before() {
    trumpet1 = new Trumpet("Etude", 3);
    trumpet2 = new Trumpet("Getzen", 3);
  }

  @Test
  public void canGetBrand() {
    assertEquals("Etude", trumpet1.getBrand());
  }

  @Test
  public void canGetValves() {
    assertEquals(3, trumpet1.getValves());
  }

  @Test
  public void canPlay() {
    assertEquals("trrrrrUMP-ET", trumpet2.play());
  }
}