package com.javaex.ex05;

public class Point {

	private int x;
	private int y;

	public Point() {

	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point(int x) {
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void draw() {
		System.out.println("[x = " + x + ", " + "y = " + y + "]");
		
	}
	
	public void draw(boolean opt) {
		if(opt == true) {
			System.out.println("[x = " + x + ", " + "y = " + y + "]을 그렸습니다.");
		}else {
			System.out.println("[x = " + x + ", " + "y = " + y + "]을 지웠습니다.");
		}
	}

}
