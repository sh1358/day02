package day02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		final String KOREA = "���ѹα�";
		System.out.println(KOREA);
//		KOREA = "�ɳ���";
//		System.out.println(KOREA);
		
		Scanner input = new Scanner(System.in);
		System.out.print("�̸� �Է� : ");
		String name = input.next();
		System.out.print("���� �Է� : ");
		int age = input.nextInt();
		
		System.out.println(name+"���� ���̴� "+age+"��");
	}

}
