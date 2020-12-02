package com.javaex.ex17;

public class Circle extends Shape {

	// private String fillColor;
	// private String lineColor;
	private int radius;

	public Circle() {

	}

	public Circle(int radius) {
		this.radius = radius;
	}

	public Circle(String fillColor, String lineColor, int radius) {
		super(fillColor, lineColor);// 부모 클래스 호출 super 추가
		this.radius = radius;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [fillColor=" + fillColor + ", lineColor=" + lineColor + ", radius=" + radius + "]";
	}

	public void draw() {
		System.out.println("원  " + "면색: " + fillColor + "  선색: " + lineColor + "  반지름: " + radius);
	}

	public double area() {
		double area = radius * radius * 3.14;
		System.out.println("원의 면적: " + area);
		return area;
	}

}
