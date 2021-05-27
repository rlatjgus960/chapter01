package com.javaex.ex04;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		/*
		Scanner sc = new Scanner (System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		
			while (true) {
				while (num>0 || num<0) {
					if (num%3==0) {
						System.out.println("3의 배수입니다.");
						break;
					}else {
						System.out.println("3의 배수가 아닙니다.");
						break;
					}
				}
			}
			
		
		if(num==0) {
			System.out.println("종료");
		}
		sc.close();
		
		망한 코드
		하
		
		*/

		Scanner sc = new Scanner (System.in);
		
		while (true) { //전체 박스
			System.out.println("숫자를 입력하세요");
			int num = sc.nextInt();
			
			if(num==0) { //0 먼저.. 걸러주기.. 알고리즘 따질때 순서 생각 잘하기
				System.out.println("종료");
				break;
			}
			
			if(num%3==0) {
				System.out.println("3의 배수입니다.");
			}else {
				System.out.println("3의 배수가 아닙니다.");
			}
			System.out.println("");
			
			
		}
		
		sc.close();
		
		
	}
}
