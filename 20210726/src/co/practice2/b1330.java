package co.practice2;

import java.util.Scanner;

public class b1330 {

	public static void main(String[] args) {
		// TODO �� ���� A�� B�� �־����� ��, A�� B�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		
		if(a>b) {
			System.out.println(">");
		}else if(a<b) {
			System.out.println("<");
		}else if(a == b) {
			System.out.println("==");
		}

	}

}
