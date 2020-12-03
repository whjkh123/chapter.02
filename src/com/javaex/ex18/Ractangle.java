package com.javaex.ex18;

public class Ractangle extends Shape {

	private int width, height;

	public Ractangle() {

	}

	public Ractangle(String fillColor, String lineColor, int width, int height) {
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
		System.out.println("사각형  가로: " + width + "  세로: " + height + "  면색: " + fillColor + "  선색: " + lineColor);
	}

	public double area() {
		double area = width * height;
		System.out.println("면적: " + area);
		System.out.println("---------------------------------------");
		return area;
	}

}
