package com.javaex.ex04;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods();//기본생성자
		Goods computer = new Goods("LG그램", 1000000);
		Goods cup = new Goods("머그컵");
		
		camera.setName("니콘");
		camera.setPrice(450000);		
		camera.showInfo();
		
		computer.showInfo();
		
		cup.setPrice(10000);
		cup.showInfo();
		
		

	}

}
