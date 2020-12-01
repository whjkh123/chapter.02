package com.javaex.ex15;

public class Student extends Person {

	private String schoolName;

	/*
	 * 1. 자신의 생성자 시작(완료 x)
	 * 2. 부모의 생성자 호출
	 * 		부모의 생성자를 선택할 수 있다.
	 * 		선택하지 않으면 디폴트 생성자 실행
	 * 3. 부모의 생성자 작업이 끝나면 자신의 생성자 작업 완료
	 */
	
	public Student() {
		System.out.println("Student()");
	}

	public Student(String schoolName) {
		this.schoolName = schoolName;
		System.out.println("Student(1)");
	}

	public Student(String name, int age, String schoolName) {
		super(name, age);//부모 생성자 호출
		this.schoolName = schoolName;
		System.out.println("Student(3)");
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + "]";
	}
	
	public void showInfo() {
		System.out.println("이름: " + name + "  나이: " + age + "  학교: " + schoolName);
		//System.out.println("이름: " + super.name + ", " + "  나이: " + super.age + ", " + "  학교: " + schoolName);
	}

}
