package com.javaex.ex11;

public class GoodsApp {

	public static void main(String[] args) {

		Goods[] goodsArray = new Goods[3];

		Goods camera = new Goods("니콘", 450000);
		Goods computer = new Goods("LG그램", 1000000);
		Goods cup = new Goods("머그컵", 10000);

		goodsArray[0] = camera;
		goodsArray[1] = computer;
		goodsArray[2] = cup;
		/*
		camera.getName();
		goodsArray[0].getName();
		*/
		for (int i = 0; i < goodsArray.length; i++) {
			System.out.println(goodsArray[i].getName());
			System.out.println(goodsArray[i].getPrice());
			System.out.println(goodsArray[i]);
			goodsArray[i].showInfo();
		}

	}

}
