package Test;

import Math.NumberFun;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumberFunTests {

	@Test
	void GetAdditionResultTest() {
		NumberFun newFun = new NumberFun(5, 3);
		assertEquals(8, newFun.GetAdditionResult());
	}

	@Test
	void GetAdditionResultTestFail() {
		NumberFun newFun = new NumberFun(5, 3);
		assertEquals(3, newFun.GetAdditionResult());
	}
}
