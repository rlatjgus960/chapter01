package com.javaex.ex02;

import java.util.Scanner;

public class Ex05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요");
		System.out.print("나이:");
		int age = sc.nextInt();
		

		sc.nextLine(); //숫자,글자면은 숫자 입력하고 치는 엔터를 글자입력으로 받아들여서 그 엔터를 날려버리므로 넥스트라인 넣어서 넘겨주기
		
		System.out.println("이름을 입력해주세요");
		System.out.print("이름:");
		String name = sc.nextLine();
		
		
		System.out.println("당신의 이름은 "+name+" 나이는 "+age+" 입니다.");
		
		sc.close();
			
		
	}

}
