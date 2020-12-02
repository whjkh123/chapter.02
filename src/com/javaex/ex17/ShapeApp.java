package com.javaex.ex17;

public class ShapeApp {

	public static void main(String[] args) {

		Ractangle r01 = new Ractangle("빨강", "노랑", 5, 10);
		Ractangle r02 = new Ractangle("빨강", "파랑", 20, 30);
		Ractangle r03 = new Ractangle("빨강", "초록", 100, 100);

		r01.draw();
		r02.draw();
		r03.draw();

		System.out.println("=======================================");

		Ractangle[] rArray = new Ractangle[3];

		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;

		for (int i = 0; i < rArray.length; i++) {
			rArray[i].draw();
		}

		System.out.println("=======================================");

		Circle c01 = new Circle("빨강", "노랑", 5);
		Circle c02 = new Circle("빨강", "파랑", 20);
		Circle c03 = new Circle("빨강", "초록", 100);

		c01.draw();
		c02.draw();
		c03.draw();

		System.out.println("=======================================");

		Circle[] cArray = new Circle[3];

		cArray[0] = c01;
		cArray[1] = c02;
		cArray[2] = c03;

		for (int i = 0; i < cArray.length; i++) {
			cArray[i].draw();
		}

		System.out.println("=======================================");

		Shape s01 = new Ractangle("빨강", "노랑", 5, 10);
		Shape s02 = new Circle("빨강", "노랑", 5);

		s01.draw();
		s02.draw();

		System.out.println("=======================================");

		Shape[] sArray = new Shape[2];

		sArray[0] = s01;
		sArray[1] = s02;

		for (int i = 0; i < sArray.length; i++) {
			sArray[i].draw();
		}

		System.out.println("=======================================");

		// Shape s = new Shape("빨강", "노랑"); >> '추상(abstract) 클래스(부모)'는 단독으로 메모리에 로드 불가

		for (int i = 0; i < sArray.length; i++) {
			sArray[i].area();
		}

	}

}
