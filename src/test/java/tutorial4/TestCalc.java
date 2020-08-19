package tutorial4;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestCalc {

	@Test
	public void testAdd() {
		int x = 1;
		int y = 2;
		assertEquals(Calc.add(x, y), 3);
	}
	
	@Test
	public void testSubtract() {
		int x = 10;
		int y = 2;
		assertEquals(Calc.subtract(x, y), 8);
	}
}