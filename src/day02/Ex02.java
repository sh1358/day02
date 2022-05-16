package day02;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		int kor, eng, mat, tot;
		
		System.out.print("당신의 이름은 무엇 입니까?");
		name = input.next();
		System.out.print(name+" 님의 국어 점수 : ");
		kor = input.nextInt();
		System.out.print(name+" 님의 영어 점수 : ");
		eng = input.nextInt();
		System.out.print(name+" 님의 수학 점수 : ");
		mat = input.nextInt();
		tot = kor+eng+mat;
		
		System.out.println();
		System.out.println("============");
		System.out.println("이름 : "+name);
		System.out.println("============");
		System.out.println("국어 : "+kor);
		System.out.println("국어 : "+eng);
		System.out.println("국어 : "+mat);
		System.out.println("============");
		System.out.println("합계 : "+tot);
		System.out.println("============");
	}
}
