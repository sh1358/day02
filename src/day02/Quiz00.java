package day02;

import java.util.Scanner;

public class Quiz00 {

	public static void main(String[] args) {
		
//		����, ���� ������ �Է¹ް�,
//		����� 90�� �̻��̸� "A",
//		����� 80�� �̻��̸� "B",
//		����� 70�� �̻��̸� "C",
//		����� 69�� �̸��̸� "D" �� �������� �Ͻÿ�
		
		Scanner input = new Scanner(System.in);
		int kor, eng;
		double total;
		System.out.print("���� ���� �Է� : ");
		kor = input.nextInt();
		System.out.print("���� ���� �Է� : ");
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
		
//		A-B-C-D�� ������� û�Ҵ���� �Ѵ�.
//		ù�� A�� ����̶�� N�� �Ŀ��� ���� ����ΰ�?
		
		
//		Scanner input = new Scanner(System.in);
		System.out.println("�� �� ��?");
		int day = input.nextInt();
		if(day%4==0) {
			System.out.println("A�� ���");
		}
		if(day%4==1) {
			System.out.println("B�� ���");
		}
		if(day%4==2) {
			System.out.println("C�� ���");
		}
		if(day%4==3) {
			System.out.println("D�� ���");
		}
		
	}

}
