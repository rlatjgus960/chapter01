package com.javaex.ex03;

import java.util.Scanner;

public class Ex04_2 {

	public static void main(String[] args) {
		
		int sum;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간:");
		int time = sc.nextInt();
		
		if(time>8) {
			sum = 8*10000+(time-8)*12000;
			System.out.println("임금은 "+sum+"원 입니다.");
			
		}else if(time>0){
			sum = time*10000;
			System.out.println("임금은 "+sum+"원 입니다.");
			
		}else {
			System.out.println("잘못된 값");
		}
			
		

		sc.close();

	}

}
