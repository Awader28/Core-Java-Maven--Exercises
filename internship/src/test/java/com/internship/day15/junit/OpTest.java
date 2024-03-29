package com.internship.day15.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class OpTest {
	@Test	
	public void display() {
		Operation op=new Operation();
		int x=40;
		int z=op.add(20, 20);
		assertEquals(x,z);
		System.out.println("PASSED");
	}
	@Test	
	public void displaySub() {
		Operation op=new Operation();
		int x=0;
		int z=op.sub(20, 20);
		assertEquals(x,z);
		System.out.println("PASSED");
	}
	@Test	
	public void displayMul() {
		Operation op=new Operation();
		int x=400;
		int z=op.mul(20, 20);
		assertEquals(x,z);
		System.out.println("PASSED");
	}
	@Test	
	public void displayDiv() {
		Operation op=new Operation();
		int x=1;
		int z=op.div(20, 20);
		assertEquals(x,z);
		System.out.println("PASSED");
	}

}
