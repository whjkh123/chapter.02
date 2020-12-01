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
		
		Person[] pArray = new Person[3];
				
		Person p01 = new Person("둘리", 1203);
		Person p02 = new Person("도우너", 300);
		Person p03 = new Person("마이콜", 200);
		pArray[0] = p01;
		pArray[1] = p02;
		pArray[2] = p03;
		for(int i = 0; i < pArray.length; i++) {
			pArray[i].showInfo();
		}
				
		Student[] sArray = new Student[3];
		
		Student s01 = new Student("유재석", 49, "서울고등학교");
		Student s02 = new Student("이효리", 44, "제주고등학교");
		Student s03 = new Student("박명수", 51, "군산고등학교");
		sArray[0] = s01;
		sArray[1] = s02;
		sArray[2] = s03;
		for(int i = 0; i < sArray.length; i++) {
			sArray[i].showInfo();
		}
		
	}

}
