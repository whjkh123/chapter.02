package com.javaex.ex09;

public class GoodsApp {

	public static void main(String[] args) {

		Goods camera = new Goods();
		Goods computer = new Goods("LG그램", 1000000);
		Goods cup = new Goods("머그컵");

		camera.setName("니콘");
		camera.setPrice(450000);
		System.out.println(camera.toString());
		camera.showInfo();
		System.out.println(camera.getCount());

		System.out.println(computer.toString());
		computer.showInfo();
		System.out.println(computer.getCount());

		cup.setPrice(10000);
		System.out.println(cup.toString());
		cup.showInfo();
		System.out.println(cup.getCount());

	}

}
