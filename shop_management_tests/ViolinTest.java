import static org.junit.Assert.*;
import org.junit.*;
import shop_management.*;

public class ViolinTest {
  Violin violin1;
  Violin violin2;

  @Before
  public void before() {
    violin1 = new Violin(400, 680, "Stentor", 4);
    violin2 = new Violin(540, 800, "Mendini", 4);
  }

  @Test
  public void canGetBrand() {
    assertEquals("Mendini", violin2.getBrand());
  }

  @Test
  public void canGetStrings() {
    assertEquals(4, violin1.getStrings());
  }

  @Test
  public void canPlay() {
    assertEquals("VI-oh-LIN", violin1.play());
  }

  @Test
  public void canCalculateMarkup() {
    assertEquals(280, violin1.calculateMarkup());
  }
}