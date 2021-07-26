package co.practice2;

import java.util.Scanner;

public class b2753 {

	public static void main(String[] args) {
		// TODO 연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
		Scanner scn = new Scanner(System.in);
		int year = scn.nextInt();
		
		if(year%4==0 && year%100!=0 || year%400==0) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		
	}

}
