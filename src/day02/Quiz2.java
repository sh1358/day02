package day02;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int num;
		String s;
		System.out.print("�� �Է� : ");
		num = input.nextInt();
		s = (num%2==0)?"¦��":"Ȧ��";
		System.out.println(num+" = "+s);
		s = (num%3==0)?"3�ǹ����.":"3�ǹ���� �ƴϴ�.";
		System.out.println(num+" = "+s);
		
		int num1, num2;
		System.out.print("�� �� �Է� : ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		System.out.println("num1 : "+num1+" ,num2 : "+num2);
		s = (num1>num2)?"�۴�":"ũ��";
		System.out.println("num2�� num1���� "+s);
	}

}
