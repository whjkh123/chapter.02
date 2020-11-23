package com.javaex.ex01;

public class Goodsaps {

	public static void main(String[] args) {
		
		Goods camera = new Goods();
		Goods computer = new Goods();
		Goods cup = new Goods();
		
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
		String name01 = camera.getName();
		System.out.println(name01);
		
		camera.setPrice(400000);
		int price01 = camera.getPrice();
		System.out.println(price01);
		
		computer.setName("LG그램");
		String name02 = computer.getName();
		System.out.println(name02);
				
		computer.setPrice(1000000);
		int price02 = computer.getPrice();
		System.out.println(price02);
		
		cup.setName("머그컵");
		String name03 = cup.getName();
		System.out.println(name03);
		
		cup.setPrice(10000);
		int price03 = cup.getPrice();
		System.out.println(price03);
	}

}
