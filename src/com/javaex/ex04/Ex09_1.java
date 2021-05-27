package com.javaex.ex04;

import java.util.Scanner;

public class Ex09_1 {

	public static void main(String[] args) {


		boolean action = true; //boolean 변수 하나 둬서 하는 방법도 있다
		
		Scanner sc = new Scanner (System.in);
		
		while (action) { //전체 박스
			System.out.println("숫자를 입력하세요");
			int num = sc.nextInt();
			
			if(num==0) { //0 먼저.. 걸러주기.. 알고리즘 따질때 순서 생각 잘하기
				System.out.println("종료");
				action=false;
			}else if(num%3==0) {
				System.out.println("3의 배수입니다.");
			}else {
				System.out.println("3의 배수가 아닙니다.");
			}
			System.out.println("");
			
			
		}
		
		sc.close();
		
		
	}
}