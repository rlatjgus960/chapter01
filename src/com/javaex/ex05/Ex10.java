package com.javaex.ex05;
//javaC Ex10.java --> Ex10.class
//java Ex10

//java Ex10 -version
public class Ex10 {

	public static void main(String[] args) {


		char[] arryC = new char[3];
		
		arryC[0]= '정';
		arryC[1]= '이';
		arryC[2]= '유';
		
		for(int i=0; i<arryC.length; i++) {
			System.out.println(arryC[i]);
		}
		
		String[] arryS = new String[3];
		
		arryS[0] = "정우성";
		arryS[1] = "이효리";
		arryS[2] = "유재석";

		for(int i=0; i<arryS.length; i++) {
			System.out.println(arryS[i]);
		}

	}

}
