package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간:");
		int time = sc.nextInt();
		int wage = 10000;
		int plus = (time-8)*(int)(10000*1.5); //1.5 int로 강제형변환
		
		if(time<=8) {
			System.out.println("임금은 "+time*wage+"원 입니다.");
		}else {
			System.out.println("임금은 "+(80000+plus)+"원 입니다.");
		}
		
		sc.close();
		
				

	}

}
