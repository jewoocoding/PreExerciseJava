package com.kh.java.exercise;

import java.util.Scanner;

public class Exercise_Basic2 {
	/*
	 * 입력받은 문자가 대문자인지 소문자인지 확인하는 프로그램을 작성하여라.
	 * 문자 하나 입력 : a
	 * 영어 대문자 확인 : false
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 하나 입력 : " );
		char ch = sc.next().charAt(0);
		boolean result = (ch >= 'A') && (ch <='Z'); // ASCII 코드표 볼 필요없이 문자만 써서 가능
		
		System.out.println("영어 대문자 확인 : "+ result);
		
	}
}
