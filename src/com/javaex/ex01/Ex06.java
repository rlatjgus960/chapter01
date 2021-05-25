package com.javaex.ex01;

public class Ex06 {
	
	public static void main(String[] args) {
		
		//자동형변환 : 자동형변환 규칙을 알아야 자료형을 결정할 수 있다.
		System.out.println(2+3.5);
		double var01 = 2 + 3.5; //자료형을 알아야 한다.
		System.out.println(var01);
		
		//자동형변환2 (long + float)
		long var02 = 12345L;
		float var03 = 1.1F;
		float result01 = var02 + var03; // long(var02) --> float 자동변환되었음
		System.out.println(result01); 
		
		System.out.println("----------------------------------");
		/////////////////////////////////////////////////////////
		
		//강제형변환
		int var04 = (int)3.14;
		System.out.println(var04);
		
		//확대변환
		byte var05 = 127;
		int result02 = (int)var05; //강제형변환(byte --> int)
		System.out.println(result02);
		
		//축소변환
		int var06 = 10;
		byte result03 = (byte)var06;
		System.out.println(result03);
		
		//축소변환 비교
		int var07 = 10232132;
		byte result04 = (byte)var07;
		System.out.println(result04); //출력되는값 이유확인
		
		
		//실수 --> 정수 : 소수점 없어짐
		double var08 = 1235.5734334;
		int result05 = (int)var08;
		System.out.println(result05);
		
		//정수 --> 실수 : 소수점 0으로 표현된다.
		int var09 = 7;
		double result06 = (double)var09;
		System.out.println(result06);
		
		
		
	}

}
