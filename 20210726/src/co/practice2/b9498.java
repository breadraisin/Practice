package co.practice2;

import java.util.Scanner;

public class b9498 {
	public static void main(String[] args) {
		//TODO 시험 점수를 입력받아 90 ~ 100점은 A, 
		//80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 
		//나머지 점수는 F를 출력하는 프로그램을 작성하시오.
		
		Scanner scn = new Scanner(System.in);
		System.out.println("시험 점수 입력:");
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
