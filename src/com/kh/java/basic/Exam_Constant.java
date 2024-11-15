package com.kh.java.basic;

public class Exam_Constant {
	
	public static void main(String[] args) {
		
		//상수는 변하지 않는 수 
		//선언시 대문자로 표시
		final double PI = 3.14;
		
		//원의 면적 공식 : 3.14 * r * r
		double radius = 5.7;
		double circleArea;
		circleArea = PI * radius * radius;
		
		System.out.println("원의 면적 : "+ circleArea);
	}

}
