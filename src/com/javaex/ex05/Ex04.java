package com.javaex.ex05;

public class Ex04 {

	public static void main(String[] args) {
		
		//방갯수 변경될때 for문에서 개수 부분을 변경해줘야 함
		
		int[] no = new int[8];

		//이거는 수동으로 해야됨 for문 입력할때 잘 안씀 (운이 좋아서 쓸수있는 상황), 출력할때만 사용하기
		for (int i=0; i<no.length; i++) {
			no[i] = (int)(Math.random()*45)+1;
		}
		
		System.out.println(no.length);
		

		for (int i=0; i<no.length; i++) {  
			System.out.println(no[i]);
		}
		
		System.out.println("=============================");
		
		
		for (int i=0; i<no.length; i++) {  
			System.out.println(no[i]);
		}
		
		
	}

}