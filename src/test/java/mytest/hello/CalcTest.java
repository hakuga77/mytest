package mytest.hello;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {

	@Test
	public void testAdding1() {
		Calc target = new Calc();
		target.setInitial(0);
		int expected = 3;
		assertEquals(expected, target.adding(4));
	}
	
	@Test
	public void testAdding2() {
		Calc target = new Calc();
		int expected = 3;
		assertEquals(expected, target.adding(4));
	}
}
