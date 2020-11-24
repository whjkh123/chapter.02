package com.javaex.ex02;

public class Point {

	private int x;
	private int y;
	
	public void setX(int i) {
		x = i;
	}
	
	public void setY(int i) {
		y = i;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void draw() {
		System.out.println("점 [x = " + x + ", " + "y = " + y + "]을 그렸습니다.");
	}
}
