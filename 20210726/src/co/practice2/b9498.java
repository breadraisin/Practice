package co.practice2;

import java.util.Scanner;

public class b9498 {
	public static void main(String[] args) {
		//TODO ���� ������ �Է¹޾� 90 ~ 100���� A, 
		//80 ~ 89���� B, 70 ~ 79���� C, 60 ~ 69���� D, 
		//������ ������ F�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		Scanner scn = new Scanner(System.in);
		System.out.println("���� ���� �Է�:");
		int test = scn.nextInt();
		if(test>=90 && test<=100) {
			System.out.println("A");
		}else if(test>=80 && test<=89) {
			System.out.println("B");
		}else if(test>=70 && test<=79) {
			System.out.println("C");
		}else if(test>=60 && test<=69) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}
}
