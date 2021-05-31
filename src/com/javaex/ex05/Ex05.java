package com.javaex.ex05;

public class Ex05 {

	public static void main(String[] args) {
		// 세부문법
		
		
		/*
		int[] intArray = new int[3];

		intArray[0] = 11;
		intArray[1] = 3;
		intArray[2] = 78;
		*/
		
		
		int[] intArray = new int[] {22,99,7,44};  
		//한번에 값까지 써줄때는 방 갯수를 비워야 함, 값 추가하면 바로바로 확장됨
		
		for (int i=0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
	}

}
