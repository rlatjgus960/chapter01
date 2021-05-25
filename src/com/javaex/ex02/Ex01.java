package com.javaex.ex02;

public class Ex01 {

	public static void main(String[] args) {
		
		int i = 2345;
		double d = 3.34;
		String str = "굿모닝";
		char c = '한';
		String s = "한";
		
		String name = "김서현";
				
				
		System.out.println("안녕하세요");
		System.out.println(str);
		System.out.println("str");
		
		
		System.out.println(i);
		System.out.println("i");
		System.out.println('i');
		System.out.println("ii");
		
		/*
		System.out.print("안녕");
		System.out.print("하");
		*/
		
		System.out.println("안녕");
		System.out.print("하");
		
		System.out.println("===========");
		
		System.out.println(i);
		System.out.println(i+i);
		
		System.out.println(str);
		System.out.println(str+str);
		
		System.out.println(str+i); //문자열+숫자 하면 숫자열을 문자열로 바꿔서 표시해줌
		System.out.println(str+d);
		System.out.println(str+" 이랑 "+i+" 다");
		System.out.println(str+" "+i+" 다");
		
		//주의
		System.out.println(c);
		System.out.println(c+c); //char는 숫자로 인식돼서 더하면 코드숫자끼리 더한값이 나옴
		System.out.println(s+s);
		System.out.println(c+s);
		
		// 제 이름은 김서현 입니다.
		
		System.out.println("제 이름은 "+name+" 입니다.");
		
		System.out.println("안녕하세요"); //안녕하세요
		System.out.println("안녕'하'세요"); //안녕'하'세요
		System.out.println("안녕\"하\"세요"); //안녕"하"세요
		
		System.out.println("안녕\\하\\세요"); // 안녕\하\세요
		
		System.out.println("안녕\t하\t세요"); //안녕  하  세요
		System.out.println("안녕\n하세요");		
	}

}
