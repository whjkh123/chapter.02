package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point();
		Point p2 = new Point();
		Point p3 = new Point(19, 92);
		Point p4 = new Point(11, 3);
		
		p1.setX(5);
		p1.setY(5);
		
		p1.draw();
		
		p2.setX(10);
		p2.setY(23);
		
		p2.draw();
		
		p3.draw();
		
		p4.draw();

	}

}
