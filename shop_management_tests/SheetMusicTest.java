import static org.junit.Assert.*;
import org.junit.*;
import shop_management.*;

public class SheetMusicTest {
  SheetMusic sheetMusic1;
  SheetMusic sheetMusic2;

  @Before
  public void before() {
    sheetMusic1 = new SheetMusic(20, 49, "Bärenreiter", "Rock");
    sheetMusic2 = new SheetMusic(16, 39, "Boosey & Hawkes", "Classical");
  }

  @Test
  public void canGetBuyingPrice() {
    assertEquals(20, sheetMusic1.getBuyingPrice());
  }

  @Test
  public void canGetSellingPrice() {
    assertEquals(39, sheetMusic2.getSellingPrice());
  }

  @Test
  public void canGetBrand() {
    assertEquals("Bärenreiter", sheetMusic1.getBrand());
  }

  @Test
  public void canGetGenre() {
    assertEquals("Classical", sheetMusic2.getGenre());
  }

}