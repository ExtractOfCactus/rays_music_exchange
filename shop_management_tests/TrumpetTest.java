import static org.junit.Assert.*;
import org.junit.*;
import shop_management.*;

public class TrumpetTest {
  Trumpet trumpet1;
  Trumpet trumpet2;

  @Before
  public void before() {
    trumpet1 = new Trumpet(350, 600, "Etude", 3, InstrumentType.BRASS);
    trumpet2 = new Trumpet(200, 320, "Getzen", 3, InstrumentType.BRASS);
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

  @Test
  public void canCalculateMarkup() {
    assertEquals(120, trumpet2.calculateMarkup());
  }
}