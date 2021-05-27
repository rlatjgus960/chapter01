package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단을 입력해주세요");
		System.out.print("단 : ");
		
		/* 내가한거
		int lv = sc.nextInt();
		int i = 1; 
		
		while (i<=9) { 
			System.out.println(lv+" * "+i+" = "+lv*i);
			i++;
		}
		*/
		
		//보통 for문 먼저 생각하기 한번에 보기 좋음 의식의 흐름은 while인데 표기는 for로 
		
		int dan;
		dan = sc.nextInt();
		
		int i = 1; //초기화
		
		while (i<=9) { //반복조건
			int result = dan * i;
			System.out.println(dan+" * "+i+" = "+result);
			i++;
		}
		
		sc.close();
		

	}

}
