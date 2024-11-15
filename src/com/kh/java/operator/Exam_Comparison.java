package com.kh.java.operator;

public class Exam_Comparison {
	
	public static void main(String[] args) {
		
		// 산술연산자 : +, *, -, /, %
		// 비교연산자 : <, >, <=, >=, ==, !=
		
		int num1 = 1;
		int num2 = 3;
		
		boolean result = num1 < num2;
		boolean result2 = num1 > num2;
		
		System.out.println(result);
		System.out.println(!result);
		System.out.println(result2);
		
		result = num1 > num2;
		
		System.out.println(result);
		// 0과 10사이의 수인가?
		// (num1이 0보다 크고) (num1이 10보다 작아야함) 
		// 참					참
		//둘다 참일때 참이어야 함.
		result = 0 < num1 && num1 < 10;
		System.out.println("0 < num1 && num1 < 10 : " + result);
		
		result = (num1 == 1);
		System.out.println("num1 == 1 : " + result); // 같으면 true
		
		result = (num1 == 2);
		System.out.println("num1 == 2 : " + result);
		
		result = (num1 != 10);
		System.out.println("num1 != 10 : " + result); // 다르면 true
		
		result = (num1 != 1);
		System.out.println("num1 != 1 :"+ result);
		
		
	}

}
