package com.kh.java.operator;

public class Exam_Triple {
	
	public static void main(String[] args) {
		// 삼항 연산자 
		// %2 == 0 --true -- 짝수입니다.
		//		   ㄴfalse -- 홀수입니다.
		// 비교연산자의 결과값(true, false)를 사용해야함.
		// 분기 처리 -> 삼항연산자
		/*
		 * 항1 == 항2, 항1 > 항2
		 * 항1 ? 항2 : 항3
		 * 항1은 비교연산자를 통해 true, false, 결과값이 나와야함.
		 * 항2은 true일때 리터럴
		 * 항3은 false일때 리터럴
		 * String result = (num1 > num2) ? "참" : "거짓"
		 * 항2와 항3의 자료형은 동일
		 * 짝홀판별의 경우
		 * 항1: num % 2 == 0, num % 2 != 0
		 * 항2: "짝수",		  "홀수"
		 * 항3: "홀수", 	  "짝수"
		 */
		int num1 = 1;
		int num2 = 3;
		
		String result = (num1 > num2) ? "참" : "거짓";
		System.out.println(result);
		
		int num3 = 2;
		result = (num3 % 2 == 0) ? "짝수" : "홀수";
		System.out.println(result);
		// 삼항연산자의 장점, 제어문-조건문을 간단하게 쓸 수 있음
		// but 제어문-조건문보다 간단해 오히려 가독성을 해칠 수 있으므로
		// 간결해지면서 가독성을 해치지 않는 경우에만 사용하는 것을 권장
	}

}
