package com.junitexamples;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator c=new Calculator();
		assertEquals(5,c.add(2,3));
	}

	@Test
	public void testSub() {
		Calculator c=new Calculator();
		assertEquals(-1,c.sub(2, 3));
	}
	@Test
	public void testMul() {
		Calculator c=new Calculator();
		assertEquals(6,c.mul(2, 3));
	}
	@Test
	public void testDiv() {
		Calculator c=new Calculator();
		assertEquals(0,c.div(2, 3));
	}
}
