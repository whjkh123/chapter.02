package com.javaex.ex01;

public class Goods {

	private String name;
	private int price;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void showInfo() {
		System.out.println("상품이름: " + name);
		System.out.println("가격: " + price);
	}
	
}
