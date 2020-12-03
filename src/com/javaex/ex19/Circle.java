package com.javaex.ex19;

public class Circle extends Shape implements Drawable {

	private int radius;

	public Circle() {

	}

	public Circle(String fillColor, String lineColor, int radius) {
		super(fillColor, lineColor);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void draw() {
		System.out.println("원" + "  반지름: " + radius + "  면색: " + fillColor + "  선색: " + lineColor);
	}

	public double area() {
		double area = radius * radius * 3.14;
		System.out.println("면적: " + area);
		System.out.println("---------------------------------------");
		return area;
	}

}
