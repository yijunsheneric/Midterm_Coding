package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

public class Staff_Test {
	ArrayList<String> staffList = new ArrayList<String>();
	Staff staff1 = new Staff();
	Staff staff2 = new Staff();
	Staff staff3 = new Staff();
	Staff staff4 = new Staff();
	Staff staff5 = new Staff();

	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void test() {
		assertEquals(1,1);
	}	

}