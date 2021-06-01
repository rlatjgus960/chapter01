package com.javaex.ex05;
//javaC Ex11.java --> Ex11.class
//javaC Ex11   (Ex11.class)



// java Ex11
// java Ex11 i am kim seo hyeon

// java 가 new String[] args = new String[5]; 요걸 해줌
public class Ex11 {

	public static void main(String[] args) {
		
		if (args.length > 0) {
			if(args[0].equals("-version")) {  // Ex11 -version   배열 1개
				System.out.println("Ex11 버전: 3.4343");
			}else if(args[0].equals("-help")) { // Ex11 -help   배열 1개
				System.out.println("지금부터 도움말 ~~");
				System.out.println("[-version] : 버전정보를 확인 할 수 있습니다.");
				System.out.println("[-help] : 도움말을 볼 수 있습니다.");
			}else { // Ex11 i am kim seo hyeon
				for (int i=0; i<args.length; i++) {
					System.out.println(args[i]);
				}
			}
		}
		
		
		
		//
		
		
		/*
		for (int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		*/
		

	}

}
