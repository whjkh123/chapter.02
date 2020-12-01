package com.javaex.ex16;

import com.javaex.ex15.Person;
import com.javaex.ex15.Student;

public class PointApp {

	public static void main(String[] args) {

		Point p = new Point(4, 4);
		ColorPoint cp1 = new ColorPoint("red");
		ColorPoint cp2 = new ColorPoint(10, 10, "blue");

		p.showInfo();
		cp1.showInfo();
		cp2.showInfo();

		System.out.println("============================");

		Point cp3 = new ColorPoint("white");
		Point cp4 = new ColorPoint(20, 20, "black");
		cp3.showInfo();
		cp4.showInfo();

		System.out.println("============================");

		Point[] pArray = new Point[5];
		pArray[0] = p;
		pArray[1] = cp1;
		pArray[2] = cp2;
		pArray[3] = cp3;
		pArray[4] = cp4;

		for (int i = 0; i < pArray.length; i++) {
			pArray[i].showInfo();
		}

		System.out.println("============================");

		((ColorPoint) pArray[1]).setColor("pink");
		((ColorPoint) pArray[2]).setColor("orange");
		((ColorPoint) pArray[3]).setColor("gray");
		((ColorPoint) pArray[4]).setColor("yallow");

		for (int i = 0; i < pArray.length; i++) {
			pArray[i].showInfo();
		}

		System.out.println("============================");

		((ColorPoint) pArray[4]).setColor("green");
		Point test01 = pArray[4];
		ColorPoint test02 = (ColorPoint) pArray[4];
		Point test03 = (ColorPoint) pArray[4];
		System.out.println(test01);
		System.out.println(test02);
		System.out.println(test03);

	}

}
