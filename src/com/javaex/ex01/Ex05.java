package com.javaex.ex01;

public class Ex05 {
	
	public static void main(String[] args) {
		
		
		//일반적인 방식
		double pi = 3.14;
		double result01 = 5*5*pi;
		System.out.println(result01);
		
		
		//pi는 항상 3.14로 사용해야된다 --> 변경되었음
		pi = 3.1415926;
		double result02 = 5*5*pi;
		System.out.println(result02);
		
		//상수로 정의한 경우
		final double PI = 3.14;
		double result03 = 5*5*PI;
		System.out.println(result03);
		
		/*
		PI = 3.1415926;
		double result04 = 5*5*PI;
		System.out.println(result04);
		*/
		
		
	}

}
