package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {
		
		Point pt = new Point();
		
		pt.setName("x");
		String point01 = pt.getName();
		
		pt.setPoint(5);
		int num01 = pt.getPoint();
		
		pt.setName("y");
		String point02 = pt.getName();
		
		pt.setPoint(5);
		int num02 = pt.getPoint();
		
		System.out.println("점" + "[" + point01 + " = " + num01 + ", " + point02 + " = " + num02 + "]" + "을 그렸습니다.");
		
		pt.setName("z");
		String point03 = pt.getName();
		
		pt.setPoint(10);
		int num03 = pt.getPoint();
		
		pt.setName("q");
		String point04 = pt.getName();
		
		pt.setPoint(23);
		int num04 = pt.getPoint();
		
		System.out.println("점" + "[" + point03 + " = " + num03 + ", " + point04 + " = " + num04 + "]" + "을 그렸습니다.");

	}

}
