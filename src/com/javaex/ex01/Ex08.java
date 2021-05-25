package com.javaex.ex01;

public class Ex08 {

	public static void main(String[] args) {
		
		//대입연산자
		System.out.println("대입연산자------------");
		int a = 7;
		int b = 2;
		System.out.println(a);
		System.out.println(b);
		
		//산술연산자
		System.out.println("산술연산자------------");
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		
		System.out.println(a/b); //몫만 필요할때 int, int 사용
		System.out.println(a%b); //나머지
		
		
		//산술연산자 / %
		System.out.println("산술연산자 / % 자세히---------");
		System.out.println(7.0 / 2.0);
		System.out.println(11.0 % 3.0);
		
		
		//부호연산자
		System.out.println("부호연산자-----------------");
		int var = -3;
		int pVar = +var;
		int mVar = -var;
		System.out.println(var);
		System.out.println(pVar);
		System.out.println(mVar);
		System.out.println(var);
		
		//증감연산자
		System.out.println("증감연산자 앞-----------------");
		System.out.println(a); //a-->7
		System.out.println(++a);
		System.out.println(a); //a 값이 윗줄때문에 변했음
		
		System.out.println(b); //b-->2
		System.out.println(--b);
		System.out.println(b); //b 값도 --해줘서 변했음
		
		
		System.out.println("증감연산자 뒤-----------------");
		System.out.println(a); //a-->8
		System.out.println(a++);
		System.out.println(a);
		
		System.out.println(b); //b-->1
		System.out.println(b--); //출력하고(1) 1-->0 출력이 먼저 돼서 1로 보임 값은 0 됐는데 내눈에안보이는거
		System.out.println(b);
		
		
		System.out.println("증감연산자 연습문제-----------------");
		int num = 5;
		System.out.println(num); // num --> 5
		/*
		System.out.println(++num); // num 5를 6으로 올린 후 출력
		*/
		
		/*
		System.out.println(num++); // 출력 후 num을 5에서 6으로 올림
		System.out.println(num);
		*/
		
		System.out.println(num++ *10-7); // num*10(곱셈이 우선)후 -7, 출력 되고나서 num은 5에서 6 되어있음
		System.out.println(++num *10-7); // 앞에 ++오면 무조건 얘 먼저! 5에서 6된다음 10 곱하고 -7 후 출력
		System.out.println(num);
		System.out.println(num*10);

	}

}
