package test.java.auto;


import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTests {

  @Test
  public void testArea() {
    Square s = new Square(5);
    System.out.println("HI");
    Assert.assertEquals(s.area(), 25);
  }
}
