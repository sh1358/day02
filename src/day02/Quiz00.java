package day02;

import java.util.Scanner;

public class Quiz00 {

	public static void main(String[] args) {
		
//		국어, 영어 성적을 입력받고,
//		평균이 90점 이상이면 "A",
//		평균이 80점 이상이면 "B",
//		평균이 70점 이상이면 "C",
//		평균이 69점 미만이면 "D" 가 나오도록 하시오
		
		Scanner input = new Scanner(System.in);
		int kor, eng;
		double total;
		System.out.print("국어 점수 입력 : ");
		kor = input.nextInt();
		System.out.print("영어 점수 입력 : ");
		eng = input.nextInt();
		
		total = (kor+eng)/2;
		
		if(total>90&&total<=100) {
			System.out.println("A");
		}
		if(total>80&&total<89) {
			System.out.println("B");
		}
		if(total>70&&total<79) {
			System.out.println("C");
		}
		if(total<69) {
			System.out.println("D");
		}
		
//		A-B-C-D가 순서대로 청소당번을 한다.
//		첫날 A가 당번이라면 N일 후에는 누가 당번인가?
		
		
//		Scanner input = new Scanner(System.in);
		System.out.println("몇 일 후?");
		int day = input.nextInt();
		if(day%4==0) {
			System.out.println("A가 당번");
		}
		if(day%4==1) {
			System.out.println("B가 당번");
		}
		if(day%4==2) {
			System.out.println("C가 당번");
		}
		if(day%4==3) {
			System.out.println("D가 당번");
		}
		
	}

}
