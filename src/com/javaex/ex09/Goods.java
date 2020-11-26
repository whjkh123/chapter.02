package com.javaex.ex09;

public class Goods {

	private String name;
	private int price;
	private static int count;

	public Goods() {
		count = count + 1;
	}

	public Goods(String name) {
		this.name = name;
		count = count + 1;
	}

	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
		count = count + 1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", count=" + count + "]";
	}

	public void showInfo() {
		System.out.println("상품명: " + name);
		System.out.println("가격: " + price);
	}

}
