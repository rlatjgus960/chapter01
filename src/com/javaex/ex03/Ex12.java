package com.javaex.ex03;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("월을 입력하세요");
		int mon = sc.nextInt();
		
		switch (mon) {
		
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("30일");
				break;
				
			case 2:
				System.out.println("28일");
				break;
				
			default :
				System.out.println("31일");
				break;
				
		}
		
		System.out.println("안녕!!");
		sc.close();
		

	}

}
