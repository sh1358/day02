package day02;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int num;
		String s;
		System.out.print("수 입력 : ");
		num = input.nextInt();
		s = (num%2==0)?"짝수":"홀수";
		System.out.println(num+" = "+s);
		s = (num%3==0)?"3의배수다.":"3의배수가 아니다.";
		System.out.println(num+" = "+s);
		
		int num1, num2;
		System.out.print("두 수 입력 : ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		System.out.println("num1 : "+num1+" ,num2 : "+num2);
		s = (num1>num2)?"작다":"크다";
		System.out.println("num2가 num1보다 "+s);
	}

}
