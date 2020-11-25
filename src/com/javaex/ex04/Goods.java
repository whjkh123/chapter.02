package com.javaex.ex04;

public class Goods {
	
	private String name;
	private int price;
	
	public Goods() {
		
	}//생성자가 한 개라도 있으면 기본 생성자를 추가하지 않는다.
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public Goods(String name) {
		this.name = name;
	}

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
