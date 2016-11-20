package mytest.hello;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {

	@Test
	public void testAdd1() {
		Calc target = new Calc();
		target.setInitial(0);
		int expected = 3;
		assertEquals(expected, target.add(4));
	}
	
	@Test
	public void testAdd2() {
		Calc target = new Calc();
		int expected = 3;
		assertEquals(expected, target.add(4));
	}

	@Test
	public void testSub1() {
		Calc target = new Calc();
		int expected = 1;
		assertEquals(expected, target.sub(0));
	}
}
