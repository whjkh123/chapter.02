package com.javaex.ex05;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point();
		Point p2 = new Point(11, 3);
		Point p3 = new Point(12);
		
		p1.setX(19);
		p1.setY(92);
		p1.draw();
		
		p2.draw();
		
		p3.setY(25);
		p3.draw();
		
	}
}
