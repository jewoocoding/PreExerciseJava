package com.kh.java.operator;

import java.io.IOException;

public class Exam_ArithMetic {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println(1+1);
		System.out.println(1-1);
		System.out.println(1*1);
		System.out.println("divide : "+ 5/2); // 몫
		System.out.println("mod : " + 5%2); // 나머지
		
		// 3의 배수인지 아닌지 판별하시오
		// 3, 6, 9, 12, 15
		// 3*1, 3*2, 3*3, 3*4,...
		// 3/3 = 1, 6/3 = 2, 9/3 = 3
		// 3%3 = 0, 6%3 = 0, 9%3 = 0, ...
		// 5의 배수인지 아닌지 판별하시오
		// 5, 10, 15, 20, ...
		// 5%5, 10%5, 15%5, ...
		// 짝수인지 홀수인지 판별하시오
		// 4, 5, ...
		// %2 == 0, %2 != 0
		System.out.print("정수 하나 입력 : ");
		int num = System.in.read();
		System.out.println("입력 받은 값 : "+ num);
		
		
		
	}

}
