package co.practice2;

import java.util.Scanner;

public class b1330 {

	public static void main(String[] args) {
		// TODO 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.

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
