package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumTest {
Sum sum;
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before Each");
		sum = new Sum();
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After Each");
	}

	@Test
	void testAddNumbers() {
		assertNotEquals(100,sum.addNumbers(19,20));
		
	}
	@Test
	void testAddNumbers2() {
		assertEquals(100,sum.addNumbers(19,81));
		
	}

}
