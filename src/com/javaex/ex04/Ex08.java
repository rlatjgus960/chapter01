package com.javaex.ex04;

public class Ex08 {

	public static void main(String[] args) {
		
		/*
		int i = 1; //초기화
	
		while (i<=6*14) {
			if(i%6==0 && i%14==0) {
				System.out.println(i);
			}
			i++;
		*/
		
		int i = 1; //초기화
		
		while (true) { //횟수가 정해진건 for문, 정해지지 않은건 while문에 if+break가 세트
			if(i%6==0 && i%14==0) {
				System.out.println(i);
				break;  //왜 브레이크가 여기에 오는지... 
			}
			
			i++;
		} 

	}

}
