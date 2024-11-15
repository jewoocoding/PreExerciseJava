package com.kh.java.basic;

public class Exam_DataType {
	
	public static void main(String[] args) {
		
		//int, String,...
		// byte, short, int ,long => 정수 
		//float, double => 실수
		
		byte bNum = 127;
		short sNum = 32767;
		int iNum = 2147483647;
		long lNum = 2147483648l; // 접미사 l을 붙임
		//alt누르고 방향키
		float fNum= 24.1118f; // 접미사 f를 붙임
		double dNum = 25.518;
		
		//char => 문자(한글자)
		char alphabet = 'A';
		// boolean => 참, 거짓
		boolean yesOrNo = true; //false
		//String => 문자(여러글자)
		String message = "Hello World";
		
		//bNum의 값 : 127
		//sNum의 값 : 32767
		//iNUm의 값 : 2147183647
		//lNum의 값 : 2147183648
		//fNum의 값 : 24.1118
		//dNum의 값 : 25.518
		//alphabet : A
		//yesOrNo : true
		//message : Hello World
		System.out.println("bNum의 값 : "+ bNum);
		System.out.println("sNum의 값 : "+ sNum);
		System.out.println("iNum의 값 : "+ iNum);
		System.out.println("lNum의 값 : "+ lNum);
		System.out.println("fNum의 값 : "+ fNum);
		System.out.println("dNum의 값 : "+ dNum);
		System.out.println("alphabet : "+ alphabet);
		System.out.println("yesOrNo : "+ yesOrNo);
		System.out.println("message : "+ message);
		

		
		
	}

}
