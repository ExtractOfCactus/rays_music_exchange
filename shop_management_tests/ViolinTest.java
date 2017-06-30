import static org.junit.Assert.*;
import org.junit.*;
import shop_management.*;

public class ViolinTest {
  Violin violin1;
  Violin violin2;

  @Before
  public void before() {
    violin1 = new Violin("Stentor", 4);
    violin2 = new Violin("Mendini", 4);
  }

  @Test
  public void canGetBrand() {
    assertEquals("Mendini", violin2.getBrand());
  }
}