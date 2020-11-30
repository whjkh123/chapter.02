package com.javaex.ex12;

public class PersonApp {

	public static void main(String[] args) {
		
		/*
		Person p01 = new Person("정우성", 45);
		Student p02 = new Student("서울고등학교");

		System.out.println(p01.toString());
		System.out.println(p02.toString());
		 */
		
		/*
		Person p03 = new Person("박명수", 50);
		System.out.println(p03.toString());
		*/
		
		Student p04 = new Student("이효리", 44, "제주고등학교");
		System.out.println(p04.toString());
		p04.showInfo();
		/*
		 * 1. Student(3) 시작
		 * 2. Person(2) 실행 > 출력
		 * 3. Student(3) 완료 > 출력
		 */
		
		Student p05 = new Student("제주고등학교");
		
	}

}
