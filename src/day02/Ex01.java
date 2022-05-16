package day02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		final String KOREA = "대한민국";
		System.out.println(KOREA);
//		KOREA = "케나다";
//		System.out.println(KOREA);
		
		Scanner input = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String name = input.next();
		System.out.print("나이 입력 : ");
		int age = input.nextInt();
		
		System.out.println(name+"님의 나이는 "+age+"살");
	}

}
