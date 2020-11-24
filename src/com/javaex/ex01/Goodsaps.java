package com.javaex.ex01;

public class Goodsaps {

	public static void main(String[] args) {
		
		Goods camera = new Goods();
		Goods computer = new Goods();
		Goods cup = new Goods("머그컵", 10000);
		
		/*
		camera.name = "니콘";
		camera.price = 400000;
		
		System.out.println(camera.name);
		System.out.println(camera.price);
		
		Goods computer = new Goods();
		
		computer.name = "LG그램";
		computer.price = 1000000;
		
		System.out.println(computer.name);
		System.out.println(computer.price);
		
		Goods cup = new Goods();
		
		cup.name = "머그컵";
		cup.price = 10000;
		
		System.out.println(cup.name);
		System.out.println(cup.price);
		
		camera.price = 450000;
		
		System.out.println(camera.name);
		System.out.println(camera.price);
		*/
		
		camera.setName("니콘");		
		camera.setPrice(400000);	
		
		camera.showInfo();
		
		computer.setName("LG그램");				
		computer.setPrice(1000000);		
		
		computer.showInfo();		
		
		cup.showInfo();
		
	}

}
