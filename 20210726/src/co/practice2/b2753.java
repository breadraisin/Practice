package co.practice2;

import java.util.Scanner;

public class b2753 {

	public static void main(String[] args) {
		// TODO ������ �־����� ��, �����̸� 1, �ƴϸ� 0�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		Scanner scn = new Scanner(System.in);
		int year = scn.nextInt();
		
		if(year%4==0 && year%100!=0 || year%400==0) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		
	}

}
