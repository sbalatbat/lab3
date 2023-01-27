import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
  
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    int [] input2 = {0, 1, 2};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{2, 1, 0}, input2);
	}

  @Test
  public void testReversed() {
    int[] input1 = { };
    int [] input2 = {0, 1, 2};
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    assertArrayEquals(new int[]{2, 1, 0}, ArrayExamples.reversed(input2));
  }

}
