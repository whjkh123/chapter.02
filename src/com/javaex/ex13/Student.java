package com.javaex.ex13;

public class Student extends Person {
	private String schoolName;

	public Student(String schoolName) {
		this.schoolName = schoolName;
		System.out.println("Student(1)");
	}
	
	public Student(String name, int age, String schoolName) {
		super(name, age);
		this.schoolName = schoolName;
		System.out.println("Student(3)");
	}

	public Student() {
		System.out.println("Student()");
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	public void showInfo() {
		System.out.println("이름 : " + name + ", " + "나이: " + age + ", " + "학교: " + schoolName);
	}

}
