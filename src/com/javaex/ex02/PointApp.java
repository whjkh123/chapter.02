package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point();
		Point p2 = new Point();
		Point p3 = new Point();
		Point p4 = new Point();
		
		p1.setX(5);
		p1.setY(5);
		System.out.println("점 [x = " + p1.getX() + ", " + "y = " + p1.getY() + "]을 그렸습니다.");
		
		p2.setX(10);
		p2.setY(23);
		System.out.println("점 [x = " + p2.getX() + ", " + "y = " + p2.getY() + "]을 그렸습니다.");
		
		p3.setX(19);
		p3.setY(92);
		System.out.println("점 [x = " + p3.getX() + ", " + "y = " + p3.getY() + "]을 그렸습니다.");
		
		p4.setX(11);
		p4.setY(3);
		System.out.println("점 [x = " + p4.getX() + ", " + "y = " + p4.getY() + "]을 그렸습니다.");
		

	}

}
