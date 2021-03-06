import static org.junit.Assert.*;

import org.junit.Test;

public class MyTests {

  @Test
  public void multiplicationOfZeroIntegersShouldReturnZero() {

	MyMath tester = new MyMath();

    // assert statements
    assertEquals("10 x 0 must be 0", 0, tester.multi(10, 0));
    assertEquals("0 x 10 must be 0", 0, tester.multi(0, 10));
    assertEquals("0 x 0 must be 0", 0, tester.multi(0, 0));
  }

} 

