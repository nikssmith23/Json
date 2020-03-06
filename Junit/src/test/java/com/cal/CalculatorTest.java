package com.cal;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cal.Calculator;

public class CalculatorTest {
	Calculator c = new Calculator();
	@BeforeClass
	public static void initCalculator() {
		System.out.println("@BeforeClass");
		
	}

	@Before
	public void beforeEachTest() {
		System.out.println("This is executed before each Test");
	}

	@After
	public void afterEachTest() {
		System.out.println("This is exceuted after each Test");
	}

	@Test
	public void testSum() {

		assertEquals(7, c.sum(3, 4));
	}

	@Test
	public void testDivison() {
		try {

			assertEquals(5, c.divison(10, 2));
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}
	}

	@Test(expected = Exception.class)
	public void testDivisionException() throws Exception {
		c.divison(10, 0);
	}

	
}
