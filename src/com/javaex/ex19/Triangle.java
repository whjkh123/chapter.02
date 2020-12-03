package com.javaex.ex19;

public class Triangle extends Shape implements Drawable {

	private int width, height;

	public Triangle() {

	}

	public Triangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void draw() {
		System.out.println("삼각형" + "  가로: " + width + "  세로: " + height + "  면색: " + fillColor + "  선색: " + lineColor);
	}

	public double area() {
		double area = width * height / 2;
		System.out.println("면적: " + area);
		System.out.println("---------------------------------------");
		return area;
	}

}
