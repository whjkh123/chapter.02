package com.javaex.ex07;

public class MathApp {

	public static void main(String[] args) {
		
		Math myMath = new Math();
		
		int sum01 = myMath.plus(1, 2);
		System.out.println(sum01);
		
		double sum02 = myMath.plus(2.3, 3.2);
		System.out.println(sum02);
		
	}

}
