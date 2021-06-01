package com.javaex.ex05;

public class Ex09 {

	public static void main(String[] args) {


		//배열 같음 판단
		int[] arrA = new int[3];
		arrA[0] = 10;
		arrA[1]	= 20;
		arrA[2] = 30;
		
		
		int[] arrB = new int[3];
		arrB[0] = 10;
		arrB[1]	= 20;
		arrB[2] = 30;
		
		//배열A 배열B 같은지 판단 --> 배열의 개수 같아야 함, 값과 순서가 같아야 함
		
		if (arrA.length == arrB.length) { //배열의 갯수가 같다
			//첫번째부터 값 비교
			for (int i=0; i<arrA.length; i++) {
				if (arrA[i]!=arrB[i]) {
					System.out.println(i+"번째 값이 다릅니다.");
				}
			}
		}else {
			System.out.println("배열의 크기가 다릅니다.");
			//종료
		}
		
		
		
		
		
		
		
		
		
		/*
		for(int i=0; i<arrA.length; i++) {
			System.out.println(arrA[i]);
		}
		*/

	}

}
