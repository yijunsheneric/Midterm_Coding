package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	
	//attributes
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	//constructors
	public Enrollment(){
	}
	private Enrollment(UUID SectionID, UUID StudentID){
		UUID section = SectionID;
		UUID student = StudentID;
	}
	public void SetGrade(double Grade){
		this.setGrade(Grade);
	}
	public UUID getSectionID() {
		return SectionID;
	}
	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}
	public UUID getStudentID() {
		return StudentID;
	}
	public void setStudentID(UUID studentID) {
		StudentID = studentID;
	}
	public UUID getEnrollmentID() {
		return EnrollmentID;
	}
	public void setEnrollmentID(UUID enrollmentID) {
		EnrollmentID = enrollmentID;
	}
	public double getGrade() {
		return Grade;
	}
	public void setGrade(double grade) {
		Grade = grade;
	}
}
