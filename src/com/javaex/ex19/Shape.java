package com.javaex.ex19;

public abstract class Shape implements Drawable {

	protected String fillColor, lineColor;

	public Shape() {

	}

	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
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

	// public abstract void draw(); >> Drawable 인터페이스에서 실행할 계획이므로 삭제

	public abstract double area();

}
