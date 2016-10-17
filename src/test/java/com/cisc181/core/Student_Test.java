package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;


public class Student_Test {
	ArrayList courseList = new ArrayList();
	Course course1 = new Course();
	Course course2 = new Course();
	Course course3 = new Course();
	
	ArrayList semesterList = new ArrayList();
	Semester sem1 = new Semester();
	Semester sem2 = new Semester();
	
	ArrayList sectionList = new ArrayList();
	Section section1 = new Section();
	Section section2 = new Section();
	Section section3 = new Section();
	Section section4 = new Section();
	Section section5 = new Section();
	Section section6 = new Section();
	

	@BeforeClass
	public static void setup() {
	}

	@Test
	public void test() {
		assertEquals(1, 1);
	}
}