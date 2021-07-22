package co.practice1;

import java.util.Scanner;

public class b1008 {
//두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("정수A 입력 : ");
		double A = scn.nextInt();
		System.out.print("정수B 입력 : ");
		double B = scn.nextInt();
		System.out.println("A/B =" + A/B);
	
	}

}
