package com.javaex.ex05;

public class Ex02 {

	public static void main(String[] args) {
		
		int[] /*갯수 없이 이렇게 생긴 애다 라고 쓰는..*/ no = new int[6];   //[]안은 방 갯수

		for (int i=0; i<6; i++) {
			no[i] = (int)(Math.random()*45)+1;
			System.out.print(no[i]+" ");
			
		}
		
		
	}

}