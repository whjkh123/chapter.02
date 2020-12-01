package com.javaex.ex15;

public class PersonApp {

	public static void main(String[] args) {
		/*
		Person s01 = new Student("유재석", 49, "서울고등학교");
		
		// Student(자식) 메소드 사용 불가 ex)s01.getSchoolName();
		s01.showInfo();// Student(자식) showInfo 메소드 실행(오버라이딩)
		System.out.println(s01.toString());//Student(자식) toString 메소드 실행(오버라이딩)
		*/
		Person[] psArray = new Person[5];
		
		Person p01 = new Person("둘리", 1200);
		Person p02 = new Person("도우너", 200);
		Person p03 = new Person("마이콜", 300);
		
		Person s01 = new Student("유재석", 49, "서울고등학교");
		Person s02 = new Student("강호동", 51, "부산고등학교");
		
		psArray[0] = p01;
		psArray[1] = p02;
		psArray[2] = p03;
		psArray[3] = s01;
		psArray[4] = s02;
		
		for(int i = 0; i < psArray.length; i++) {
			psArray[i].showInfo();
		}
		
		System.out.println("======================================");
		
		((Student)psArray[4]).setSchoolName("마산고등학교");
		for(int i = 0; i < psArray.length; i++) {
			psArray[i].showInfo();
		}
		
		System.out.println("======================================");
		
		Person t01 = psArray[4];
		Student t02 = (Student)psArray[4];
		Person t03 = (Student)psArray[4];
		System.out.println(t01);
		System.out.println(t02);
		System.out.println(t03);
		
	}

}
