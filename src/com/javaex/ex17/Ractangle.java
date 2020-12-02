package com.javaex.ex17;

public class Ractangle extends Shape {

	// private String fillColor;
	// private String lineColor;
	private int width;
	private int height;

	public Ractangle() {

	}

	public Ractangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public Ractangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor, lineColor);// 부모 클래스 호출 super 추가
		this.width = width;
		this.height = height;
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

	@Override
	public String toString() {
		return "Ractangle [fillColor=" + fillColor + ", lineColor=" + lineColor + ", width=" + width + ", height="
				+ height + "]";
	}

	public void draw() {
		System.out.println("사각형  " + "면색: " + fillColor + "  선색: " + lineColor + "  가로: " + width + "  세로: " + height);
	}

	public double area() {
		double area = width * height;
		System.out.println("사각형의 면적: " + area);
		return area;
	}

}
