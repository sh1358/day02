package day02;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		int kor, eng, mat, tot;
		
		System.out.print("����� �̸��� ���� �Դϱ�?");
		name = input.next();
		System.out.print(name+" ���� ���� ���� : ");
		kor = input.nextInt();
		System.out.print(name+" ���� ���� ���� : ");
		eng = input.nextInt();
		System.out.print(name+" ���� ���� ���� : ");
		mat = input.nextInt();
		tot = kor+eng+mat;
		
		System.out.println();
		System.out.println("============");
		System.out.println("�̸� : "+name);
		System.out.println("============");
		System.out.println("���� : "+kor);
		System.out.println("���� : "+eng);
		System.out.println("���� : "+mat);
		System.out.println("============");
		System.out.println("�հ� : "+tot);
		System.out.println("============");
	}
}
