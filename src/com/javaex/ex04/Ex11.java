package com.javaex.ex04;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		
		/* 방법1
		Scanner sc = new Scanner(System.in);
		
		int i;
		int sum = 0;

		System.out.println("숫자를 입력하세요. [0이면 종료]");
		
			
		i = sc.nextInt();
		sum=sum+i;
		System.out.println("합계: "+sum);  //이부분이 아래 한번 더 똑같이 반복되므로 두화일문 써보기
			
			
		//반복시작	
		while(i != 0) {
			i = sc.nextInt();
			sum=sum+i;
			System.out.println("합계: "+sum);
		}
		
		System.out.println("종료");
		

		sc.close();
		*/
		
		
		/* ==================================================
		//방법2 do while
		
		Scanner sc = new Scanner(System.in);
		int i;
		int sum = 0;
		
		System.out.println("숫자를 입력하세요. [0이면 종료]");
		
		do {
			
			i = sc.nextInt();
			sum=sum+i;
			System.out.println("합계: "+sum);
			
		}while(i !=0);
			
		
		System.out.println("종료");
		
		sc.close();
		================================================== */ 
		
		//방법3 while
		
		Scanner sc = new Scanner(System.in);
		int i;
		int sum = 0;
		
		System.out.println("숫자를 입력하세요. [0이면 종료]");
		
		while(true) {
			i = sc.nextInt();
			sum=sum+i;
			System.out.println("합계: "+sum);
			if(i==0) {
				System.out.println("종료");
				break;
				
			}
				
			
		}
		
		sc.close();
	}

}
