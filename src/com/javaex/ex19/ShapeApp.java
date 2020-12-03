package com.javaex.ex19;

public class ShapeApp {

	public static void main(String[] args) {

		Shape[] cArr = new Circle[3];

		Circle c01 = new Circle("빨강", "주황", 19);
		Circle c02 = new Circle("노랑", "초록", 92);
		Circle c03 = new Circle("파랑", "보라", 11);

		cArr[0] = c01;
		cArr[1] = c02;
		cArr[2] = c03;

		for (int i = 0; i < cArr.length; i++) {
			cArr[i].draw();
			cArr[i].area();
		}

		System.out.println("=======================================");

		Shape[] rArr = new Ractangle[3];

		Ractangle r01 = new Ractangle("주황", "빨강", 92, 19);
		Ractangle r02 = new Ractangle("초록", "노랑", 3, 11);
		Ractangle r03 = new Ractangle("보라", "파랑", 2, 12);

		rArr[0] = r01;
		rArr[1] = r02;
		rArr[2] = r03;

		for (int i = 0; i < rArr.length; i++) {
			rArr[i].draw();
			rArr[i].area();
		}

		System.out.println("=======================================");

		Shape[] tArr = new Triangle[3];

		Triangle t01 = new Triangle("파랑", "보라", 12, 2);
		Triangle t02 = new Triangle("노랑", "초록", 11, 3);
		Triangle t03 = new Triangle("빨강", "주황", 19, 92);

		tArr[0] = t01;
		tArr[1] = t02;
		tArr[2] = t03;

		for (int i = 0; i < tArr.length; i++) {
			tArr[i].draw();
			tArr[i].area();
		}

		System.out.println("=======================================");

		Shape[] allArr = new Shape[3];

		Shape a01 = new Circle("빨강", "주황", 19);
		Shape a02 = new Ractangle("노랑", "초록", 92, 11);
		Shape a03 = new Triangle("파랑", "보라", 3, 12);

		allArr[0] = a01;
		allArr[1] = a02;
		allArr[2] = a03;

		for (int i = 0; i < allArr.length; i++) {
			allArr[i].draw();
			allArr[i].area();
		}

		System.out.println("=======================================");

		Point p = new Point(19, 92);
		p.draw();
		System.out.println(p.getX());

		Drawable pp = new Point(11, 03);
		pp.draw();
		// System.out.println(pp.getX()); >> 보이지 않음(Drawable 인터페이스에 존재 x)
		System.out.println(((Point) pp).getX());// 다운캐스팅

		System.out.println("=======================================");

		Drawable[] dArr = new Drawable[4];

		Drawable cir = new Circle("빨강", "주황", 19);
		Drawable ract = new Ractangle("노랑", "초록", 92, 11);
		Drawable tri = new Triangle("파랑", "보라", 3, 12);
		Drawable pt = new Point(19, 92);

		dArr[0] = cir;
		dArr[1] = ract;
		dArr[2] = tri;
		dArr[3] = pt;

		for (int i = 0; i < dArr.length; i++) {
			dArr[i].draw();
			if (dArr[i] instanceof Shape) {
				((Shape) dArr[i]).area();
			}
		}

		System.out.println("=======================================");

	}

}
